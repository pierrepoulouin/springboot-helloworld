package co.simplon.springboot.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {
	
	@RequestMapping("/hello") //Le nom de notre page "localhost:8080/hello" Comme les Servlets
	@ResponseBody
	public String hello()
	{
		return "Hello World"; // La page nous retournera "Helloworld"
	}
}