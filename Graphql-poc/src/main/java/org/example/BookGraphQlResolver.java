package org.example;

import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookGraphQlResolver {

    private final BookService service;


    public BookGraphQlResolver(BookService service) {
        this.service = service;
    }

    @QueryMapping
    public List<Book> bookList(){

       return service.listAllBooks();
    }

    @QueryMapping
    public  Book book(Long id){

        return service.getBookById(id);
    }

    @MutationMapping
    public  Book addBook(String titel, String author){


        return  service.addBook(titel,author);
    }

}
