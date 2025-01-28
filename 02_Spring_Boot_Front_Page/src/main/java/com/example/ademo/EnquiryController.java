package com.example.ademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EnquiryController {
	@Autowired
	private EnquiryService enquiryService;
	
	@GetMapping(value = "/one")
	public String frontpage() {
		return "NewFile";
	}
	
	
	@GetMapping(value="/")
	public ModelAndView showAllEnquiresInfo() {
		System.out.println("hi controller");
		ModelAndView mav = new ModelAndView();
		mav.addObject("title", "Welcome To AshokIT Developing SpringBoot MVC Application......");
		mav.addObject("enquires", enquiryService.getAllEnquires());
		mav.setViewName("enquires");
		List<Enquiry> allEnquires = enquiryService.getAllEnquires();
		System.out.println(allEnquires);
		return mav;
	}
	
	@GetMapping(value="/homePage")
	public String showAllEnquires(ModelMap map) {
		
		map.addAttribute("title", "Welcome To AshokIT Developing SpringBoot MVC Application......");
		map.addAttribute("enquires", enquiryService.getAllEnquires());
		
		return "enquires";
	}

}
