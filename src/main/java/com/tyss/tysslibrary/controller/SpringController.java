package com.tyss.tysslibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.tysslibrary.dto.Book;
import com.tyss.tysslibrary.services.BookService;

@Controller
@RequestMapping("/book")
public class SpringController {
	@Autowired
	private BookService service;

	@GetMapping("/add")
	public String getIndex() {
		return "addbook";
	}

	@PostMapping("/addbook")
	public String addBook(Book book,ModelMap model) {
		
		if(service.addBook(book)) {
			
			return "home";
		}
		return "error";
	}
	@GetMapping("/getall")
	public String getAllBook(ModelMap model) {
		List<Book> list=service.getAllBook();
		model.addAttribute("list", list);
		return "getallbook";
	}
	@GetMapping("/search")
	public String searchBook() {
		return "searchbook";
	}
	@PostMapping("/search")
	public String searchBook1( String bName,Model map) {
		List<Book> list=service.searchBook(bName);
		map.addAttribute("list", list);
		return "searchdata";
	}
}
