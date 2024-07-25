package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.book.service.Book;
import com.book.service.BookService;

@Controller
public class BookController {

    private final BookService BookService;
    
    @GetMapping("/search")
    public String search() {
    	return "search";
    }
    
    @Autowired
    public BookController(BookService BookService) {
        this.BookService = BookService;
    }

    @GetMapping("/searchBooks")
    public String searchBooks(@RequestParam("query") String query, Model model) {
        Book[] books = BookService.searchBooks(query);
        model.addAttribute("books", books);
        return "searchResult";
    }
    
    @GetMapping("/wishList")
    public String wishList() {
    	return "wishList";
    }
    
}