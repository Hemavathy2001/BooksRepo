package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

public interface BookService {
	
	public Book addBook(Book book); 

	public List<Book> gettAllBooks();

	public void deleteBook(int id);

}
