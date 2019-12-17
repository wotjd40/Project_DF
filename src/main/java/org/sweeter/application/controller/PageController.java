package org.sweeter.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/members/login")
	public String login() {
		return "members/login";
	}

	@GetMapping("/members/register")
	public String register() {
		return "members/register";
	}

	@GetMapping("/members/modify")
	public String info() {
		return "members/modify";
	}

	@GetMapping("/post/list")
	public String postList() {
		return "posts/list";
	}

	@GetMapping("/post/write")
	public String postWrite() {
		return "posts/write";

	}

	@GetMapping("/post/modify")
	public String postModify() {
		return "posts/modify";

	}

	@GetMapping("/post/read")
	public String postRead() {
		return "posts/read";
	}

}
