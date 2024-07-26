package com.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import com.book.service.Book;
import com.book.service.BookService;

//import com.book.model.WishList;
//import com.book.service.WishListService;

@Controller
public class BookController {
 //------------------- 도서 검색 api -------------
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
        model.addAttribute("query",query);
        return "searchResult";
    } 
  //----------------------- 끝 ---------------------  
    
    
    
}
    
