package com.cts.controller;

import com.cts.entity.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.service.BookService;

@Controller
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	BookService bs;
	
	
//	@RequestMapping(value="list",method=RequestMethod.GET)
//	public ModelAndView listAllBookFromLogin(@RequestParam("username") String username, @RequestParam("password") String password){
//		ModelAndView mv1=new ModelAndView("listBook");
//		mv1.addObject("username",username);
//		mv1.addObject("password",password);
//		return mv1;
	
	@GetMapping("/list")
	public String listAllBooks(Model model){
		System.out.println("Entered in List abook");
		List<Book> lb=bs.listAllBook();
		System.out.println("Booklist:" +lb);
		model.addAttribute("books",lb);
		System.out.println("Return string");
		return "listBook";
	
	}
		
	
}

