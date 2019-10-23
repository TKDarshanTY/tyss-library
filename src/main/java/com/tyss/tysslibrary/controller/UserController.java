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
import com.tyss.tysslibrary.dto.User;
import com.tyss.tysslibrary.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/register")
	public String getIndex() {
		return "registeruser";
	}
	@PostMapping("/registeruser")
	public String registerUser(User user,ModelMap model) {
		if(service.registerUser(user)) {
			return "registerhome";
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
	@PostMapping("/searchbook")
	public String searchBook1( String bName,Model map) {
		List<Book> list=service.searchBook(bName);
		map.addAttribute("list", list);
		return "searchdata";
	}
	
	
}
