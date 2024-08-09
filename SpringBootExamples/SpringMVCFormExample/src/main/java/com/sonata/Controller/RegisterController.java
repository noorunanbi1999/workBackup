package com.sonata.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sonata.Model.User;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		User userform = new User();
		model.put("userform", userform);
		
		List<String> professionList = new ArrayList<>();
		professionList.add("Developer");
		professionList.add("Designer");
		professionList.add("IT Manager");
		model.put("professionList", professionList);
		
		return "Registration";
	}
	@RequestMapping(method=RequestMethod.POST)
		public String processRegistration(@ModelAttribute("userform") User user,
				Map<String, Object> model) {
			return "RegistrationSuccess";
		}
}