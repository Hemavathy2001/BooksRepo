package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired 
	BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> gettAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public void deleteBook(int id) {
		bookRepository.deleteById(id);		
	}

}
