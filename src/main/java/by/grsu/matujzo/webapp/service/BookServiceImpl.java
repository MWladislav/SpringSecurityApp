package by.grsu.matujzo.webapp.service;

import by.grsu.matujzo.webapp.model.Book;
import by.grsu.matujzo.webapp.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {


        @Autowired
        private BookDao bookDao;

        @Override
        public List<Book> findAll() {
            return bookDao.findAll();
        }

        @Override
        public Book findByName(String name){ return bookDao.findByName(name); }

        @Override
        public void save(Book book) {
            try {
                List<Book> books=findAll();
               // if(books.contains(book))
               //     throw new IllegalArgumentException();
                bookDao.save(book);
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

        @Override
        public Book getById(int id) {
            return bookDao.getById(id);
        }

        @Override
        public void update(Book book) {
            bookDao.saveAndFlush(book);
        }

        @Override
        public void delete(Long id) {
        bookDao.delete(id);
    }
}
