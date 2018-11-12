package by.grsu.matujzo.webapp.controller;

import by.grsu.matujzo.webapp.model.Book;
import by.grsu.matujzo.webapp.model.User;
import by.grsu.matujzo.webapp.service.BookService;
import by.grsu.matujzo.webapp.validator.BookValidator;
import by.grsu.matujzo.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;
    @Autowired
    private BookValidator bookValidator;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model){
        model.addAttribute("users", userService.findAll());
        model.addAttribute("books", bookService.findAll());
        return "admin";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "showUserInfo";
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/updateUser/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "editUser";
    }

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/deleteBook/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.delete(id);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/addBook",method = RequestMethod.GET)
    public String addBook(Model model){
        model.addAttribute("bookForm",new Book());
        return "addBook";
    }
    @RequestMapping(value = "/addBook",method = RequestMethod.POST)
    public String addBook(@ModelAttribute("bookForm")Book bookForm, BindingResult bindingResult,Model model){
        bookValidator.validate(bookForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "addBook";
        }

        bookService.save(bookForm);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }
}
