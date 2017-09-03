package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControlle {
	// requestMapping��ʾ���ĸ�url����Ӧ
	@RequestMapping({"/hello","/"})
	public String Hello(String user, Model model){
		System.out.println("hello" + user);
		model.addAttribute("name","������");
		
		//Ĭ��ʹ�ö����������Ϊkey
		// һ���ڷ��ض������͵�ʱ��ʹ��
		// model.addAttribute(new User(xx,xxx,xxx));
		return "hello";
	}
	
	@RequestMapping(value={"welcome","we"})
	public String welcome(){
		return "welcome";
	}
}
