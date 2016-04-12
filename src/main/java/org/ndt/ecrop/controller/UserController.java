package org.ndt.ecrop.controller;

import java.util.List;

import org.ndt.ecrop.model.User1;
import org.ndt.ecrop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController 
{
  @Autowired	
  UserService userLoginService;
  
  @RequestMapping(value="/login1",method=RequestMethod.POST)
	public String login(@ModelAttribute("user") User1 u )
	 {
	 System.out.println("b");
		if(userLoginService.userLogin(u.getUserName(),u.getPassword()))
		{
			return "home";
		}
		else
		{
			return "home1";
		}
	 }
  
 
    @RequestMapping(value="/user/{userName}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<User1> getUser(@PathVariable("userName") String userName)
   {
	   System.out.println("Username:"+userName);
	   User1 usr=userLoginService.getuser(userName);
	   System.out.println("llll");
	   System.out.println(usr);
	   if (usr == null) {
			System.out.println("User with username " +userName  + " not found");
			return new ResponseEntity<User1>(HttpStatus.NOT_FOUND);
		}
	   return new ResponseEntity<User1>(usr,HttpStatus.OK);
   }
  
  /* @RequestMapping(value="/user/{userName}",method=RequestMethod.GET)
    public User1 getUser(@PathVariable("userName") String userName)
    {
 	   System.out.println("Username:"+userName);
 	   User1 usr=userLoginService.getuser(userName);
 	   System.out.println(usr);
 	   if (usr == null) {
 			System.out.println("User with username " +userName  + " not found");
 			return new ResponseEntity<User1>(HttpStatus.NOT_FOUND);
 		}
 	   return usr;
    }*/
  @RequestMapping(value="/home",method=RequestMethod.GET)
	 public String studentAdmission1()
	 {
		// ModelAndView mv = new ModelAndView();
		// System.out.println("a");
	    // mv.addObject("command", new User1());
	     return "home1";
		 
	 }
    
	@RequestMapping(value="/login1",method=RequestMethod.GET)
	 public ModelAndView studentAdmission()
	 {
		 ModelAndView mv = new ModelAndView();
		 System.out.println("a");
	     mv.addObject("command", new User1());
	     return mv;
		 
	 }
  
}
