package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;



@RestController
public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book){
		return bookService.addBook(book);
	}
	

	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookService.gettAllBooks();
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);	
		return "Book " + id + " Deleted Successfully";
	}

}