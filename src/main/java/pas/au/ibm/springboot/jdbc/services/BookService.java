package pas.au.ibm.springboot.jdbc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import pas.au.ibm.springboot.jdbc.domain.Book;

import java.util.List;

@Component
public class BookService
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getAllBooks()
    {
        List<Book> books = jdbcTemplate.query("select * from books", new BeanPropertyRowMapper<Book>(Book.class));

        return books;
    }
}
