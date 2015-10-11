package pas.au.ibm.springboot.jdbc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pas.au.ibm.springboot.jdbc.domain.Book;
import pas.au.ibm.springboot.jdbc.services.BookService;

import java.util.List;

@RestController
public class BookRest
{
    @Autowired
    BookService bookService;

    @RequestMapping("/allbooks")
    public List<Book> allbooks()
    {
        return bookService.getAllBooks();
    }
}
