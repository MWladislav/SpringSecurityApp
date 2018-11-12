package by.grsu.matujzo.webapp.validator;

import by.grsu.matujzo.webapp.model.Book;
import by.grsu.matujzo.webapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class BookValidator implements Validator {
    @Autowired
    private BookService bookService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Book.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Book book = (Book) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "Required");
        if (book.getName().length() < 3 || book.getName().length() > 32) {
            errors.rejectValue("name", "Size.bookForm.name");
        }

        if (bookService.findByName(book.getName()) != null) {
            errors.rejectValue("name", "Duplicate.bookForm.name");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "author", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "genre", "Required");

    }
}
