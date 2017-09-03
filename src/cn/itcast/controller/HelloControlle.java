package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControlle {
	// requestMapping表示用哪个url来对应
	@RequestMapping({"/hello","/"})
	public String Hello(String user, Model model){
		System.out.println("hello" + user);
		model.addAttribute("name","李生川");
		
		//默认使用对象的类型作为key
		// 一般在返回对象类型的时候使用
		// model.addAttribute(new User(xx,xxx,xxx));
		return "hello";
	}
	
	@RequestMapping(value={"welcome","we"})
	public String welcome(){
		return "welcome";
	}
}
