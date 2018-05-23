package com.gullu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gullu.bean.Customer;
 
@Controller
public class SimpleFormController {
	
 
    Logger log = LoggerFactory.getLogger(this.getClass());
    
    @RequestMapping("/index")
    public String indexPage() {
    	return "index";
    }
    
    @RequestMapping("/welcome.html")
    public String welcomePage() {
    	return "welcome";
    }
     
    @RequestMapping(value="/form.html", method=RequestMethod.GET)
    public String customerForm(@ModelAttribute("custCmd") Customer customer){
        return "form";
    }
 
    @RequestMapping(value="/form.html", method=RequestMethod.POST)
    public String customerSubmit(@ModelAttribute("custCmd") Customer customer) {
    	String name=customer.getFirstname();
    	String fname=customer.getLastname();
    	return name+fname;
         
    }
 
}