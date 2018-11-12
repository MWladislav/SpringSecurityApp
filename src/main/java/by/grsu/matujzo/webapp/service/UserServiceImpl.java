package by.grsu.matujzo.webapp.service;

import by.grsu.matujzo.webapp.dao.RoleDao;
import by.grsu.matujzo.webapp.dao.UserDao;
import by.grsu.matujzo.webapp.model.Role;
import by.grsu.matujzo.webapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        //user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public List<User> findAll(){ return userDao.findAll(); }

    @Override
    public void delete(Long id){
        userDao.delete(id);
    }

    @Override
    public User findById(Long id){ return userDao.getOne(id); }

    @Override
    public void update(User user){
        userDao.saveAndFlush(user);
    }
    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
