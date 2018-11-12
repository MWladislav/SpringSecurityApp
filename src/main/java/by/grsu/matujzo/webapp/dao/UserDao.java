package by.grsu.matujzo.webapp.dao;

import by.grsu.matujzo.webapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long>{

    User findByUsername(String username);


   // public User findByUsername(String username){
   //     String sql = "SELECT * FROM users WHERE username=?";
   //     return jdbcTemplate.queryForObject(sql,new UserMapper(),username);
   // }
//
   // public void save(User user) {
   //     String sql = "INSERT INTO users (username,password,email,firstName,lastName) VALUES (?,?,?,?,?)";
   //     jdbcTemplate.update(sql, user.getUsername(), user.getPassword(),user.getEmail(),user.getFirstName(),user.getLastName());
   // }
   // public User findById(int id) {
   //     String sql = "SELECT * FROM users WHERE id=?";
   //     return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
   // }
//
   // public List<User> findAll() {
   //     String sql = "SELECT * FROM users";
   //     return jdbcTemplate.query(sql, new UserMapper());
   // }
//
   // public void update(User user) {
   //     String sql = "update users set username=?, password=?, firstName=?, lastName=?, email=? where id=?";
   //     jdbcTemplate.update(sql, user.getUsername(), user.getPassword(),user.getFirstName(),user.getLastName(),user.getEmail(), user.getId());
   // }
//
   // public void deleteById(int id){
   //     String sql = "DELETE * FROM users WHERE id=?";
   //     jdbcTemplate.update(sql,id);
   // }


}
