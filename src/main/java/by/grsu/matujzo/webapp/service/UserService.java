package by.grsu.matujzo.webapp.service;

import by.grsu.matujzo.webapp.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

    List<User> findAll();

    User findById(Long id);

    void delete(Long id);

    void update(User user);
}
