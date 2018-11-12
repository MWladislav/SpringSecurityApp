package by.grsu.matujzo.webapp.service;

import by.grsu.matujzo.webapp.model.Book;

import java.util.List;

public interface BookService {
        List<Book> findAll();

        void save(Book book);

        Book findByName(String name);

        Book getById(int id);

        void update(Book book);

        void delete(Long id);
}

