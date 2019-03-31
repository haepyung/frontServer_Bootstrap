package com.tangerine.homepage.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/sales.html")
	public String sales() {
		return "sales";
	}

	@RequestMapping("/mans.html")
	public String mans() {
		return "mans";
	}

	@RequestMapping("/womans.html")
	public String womans() {
		return "womans";
	}

	@RequestMapping("/member")
	public String login() {
		return "member";
	}
}
