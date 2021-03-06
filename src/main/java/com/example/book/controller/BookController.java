package com.example.book.controller;

import java.util.List;

import com.example.book.model.Book;
import com.example.book.model.Film;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class BookController {
    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("name", "Bill Gates");
        return "index";
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        List<Book> books = List.of(new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài"),
                new Book("Nhật Ký Trong Tù", "Hồ Chí Minh"), new Book("Tắt Đèn", "Ngô Tất Tố"));
        model.addAttribute("books", books);
        return "book";
    }

    
}
