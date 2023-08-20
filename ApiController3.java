package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {
	
	@Value("${rav}")
	private String yourFavColor;
	
	@GetMapping("favcol")
	
	private String getMyFav()
	{
		return "My favourite color is "+yourFavColor;
	}

}
