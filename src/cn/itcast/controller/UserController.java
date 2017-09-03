package cn.itcast.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.itcast.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	private Map<String, User> users = new HashMap<String, User>();
	
	public UserController(){
		users.put("sdy",new User("sdy", "123", "宋冬玲", "sdy@qq.com"));
		users.put("lsc",new User("lsc", "123", "里生存", "lsc@qq.com"));
		users.put("zxl",new User("zxl", "123", "在心里", "xzl@qq.com"));
		users.put("wt",new User("wt", "123", "问题", "wt@qq.com"));
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("users", users);
		return "user/list";
	}
	
	// 链接到add页面时，是get请求，会访问这段代码
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("user", new User());
		return "user/add";
	}
	
	// 在具体添加用户时，是post请求，会访问这段代码
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(User user){
		users.put(user.getUserName(), user);
		// 客户端跳转
		return "redirect:/user/users";
	}
}
