package com.sonata.ControllerExample;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sho")
public class NewSimpleController {
	@RequestMapping("/no")
	public String datas(int x) {
		String res="Hello "+"This is an Example of Integer Parameter "+x;
		return res;
		
	}
	
}
