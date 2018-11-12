package by.grsu.matujzo.webapp.service;

import by.grsu.matujzo.webapp.dao.UserDao;
import by.grsu.matujzo.webapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        return user;
        //Set<GrantedAuthority> grantedAuthorities =new HashSet<>();
        //for (Role role : user.getRoles()) grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        //return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
