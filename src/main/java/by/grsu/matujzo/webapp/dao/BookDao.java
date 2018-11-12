package by.grsu.matujzo.webapp.dao;

import by.grsu.matujzo.webapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {

    Book getById(int id);

    Book findByName(String name);

    /*@Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Book book) {
        String sql = "insert into books (name,author,genre) values (?,?,?)";
        jdbcTemplate.update(sql, book.getName(), book.getAuthor(), book.getGenre());
    }

    public Book getById(int id) {
        String sql = "SELECT * FROM books WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BookMapper(), id);
    }

    public List<Book> findAll() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookMapper());
    }

    public void update(Book book) {
        String sql = "update books set name=?, author=?, genre=? where id=?";
        jdbcTemplate.update(sql, book.getName(), book.getAuthor(), book.getGenre(), book.getId());
    }

    public void delete(int id) {
        String sql = "delete from books where id=?";
        jdbcTemplate.update(sql, id);
    }*/
}