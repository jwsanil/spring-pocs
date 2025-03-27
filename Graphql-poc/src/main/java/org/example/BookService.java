package org.example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BooKRepository booKRepository;

    public BookService(BooKRepository booKRepository) {
        this.booKRepository = booKRepository;
    }

    public List<Book> listAllBooks(){
        return booKRepository.findAll();
    }

    public Book getBookById(Long id){

        return booKRepository.findById(id).orElse(null);
    }

    public Book addBook(String title, String author){

        return  booKRepository.save(new Book(title,author));
    }


}
