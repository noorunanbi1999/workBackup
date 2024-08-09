package com.sonata.ControllerExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller//Use RestController if you get any error.
@RequestMapping("/hu")//This is not mandatory to be defined at class level
public class SimpleController {
	@RequestMapping("/my")
	public String data() {
		String res="Hello "+"This is an Example of String and Integer Concatanation"+12;
		return res;
		
	}
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView helloworld() {
		ModelAndView modelAndView=new ModelAndView("mypage");
		modelAndView.addObject("message1","Spring is Here bois");
		return modelAndView;
	}
	
	@RequestMapping(value="/new",method=RequestMethod.GET)//Put the value and method of request here.
	//Also remember to change the page file everytime you add a new message using object of ModelAndView.
	public ModelAndView helloji() {
		ModelAndView modelAndView=new ModelAndView("mypage");
		modelAndView.addObject("message2","We are using the value here bro");
		return modelAndView;
	}
	
	@RequestMapping(value="/what",method=RequestMethod.GET)
	public String Chetah(ModelMap modelmap){
		modelmap.addAttribute("message3","You bro glad you made it this far");
		return "mypage";
	}
	
	//Add a variable in the view or file my page using the @PathVariable
	@RequestMapping(value="/hi/{newInt}",method=RequestMethod.GET)
	public String paraMeter(@PathVariable int newInt,Model model) {
		model.addAttribute("message","This is new file simple1.jsp");
		return "simple"+newInt;
	}
	
	
}
