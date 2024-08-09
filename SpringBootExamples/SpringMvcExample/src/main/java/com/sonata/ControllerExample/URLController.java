package com.sonata.ControllerExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/")
public class URLController {
//	@RequestMapping("/no")
//	public String datas(int x) {
//		String res="Hello "+"This is an Example of Integer Parameter "+x;
//		return res;
//}
	 @RequestMapping(method=RequestMethod.GET)
	  public String helloWorld(ModelMap modelmap) {
		return "index";
	}
	 
	 @RequestMapping(value="/hello/{helloId}",method=RequestMethod.GET)
		public String helloURIparams(@PathVariable int helloId,@RequestParam("myCity") String city, Model model)
		
		{
			model.addAttribute("message6", "I live in"+city);
			
			return "mypage";
			
		}
	 
	 @RequestMapping(value="/tomorrow",method=RequestMethod.GET)
		public String tommorow(ModelMap modelmap)
		
		{	
			modelmap.addAttribute("message6", "I live in"+city);
			
			return "tomorrow";
			
		}
	 
	 
	 }

