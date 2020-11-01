package com.example.hotel.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.hotel.dao.AdminPage;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("message", "sssssesfokok");
		return "home";
	}

	@RequestMapping("adminpage.do")
	public ModelAndView mav() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("admin", new AdminPage("8월", 1000000));
		// modelandview(url, key, value)
		return new ModelAndView("test/admin", "map", map);
	}

	@RequestMapping("ajax.do")
	public String ajax() {
		return "test/ajax";
	}

	// { "key" : "value"}
	// {"7월", 500000"
	@RequestMapping("background.do")
	public @ResponseBody AdminPage background() {
		AdminPage adminpage = new AdminPage("7월", 500000);
		return adminpage; // 객체에 저장된 데이터를 넘김
	}

	@RequestMapping("login.do")
	public String login() {
		return "test/login";
	}

	@RequestMapping("login_result.do")
	public String login_result(@RequestParam String id, @RequestParam String pw, Model model) {
		String result = "";
		if (id.equals("kim") && pw.equals("1234")) {
			result = "환영합니다.";
		} else {
			result = "아이디 또는 비밀번호가 틀렸습니다.";
		}
		model.addAttribute("result", result);
		return "test/login_result";
	}

	@RequestMapping("ajax_gugu.do")
	public String ajax_gugu() {
		return "test/ajax_gugu";
	}

	@RequestMapping("ajax_gugu_result.do")
	public String ajax_gugu_result(@RequestParam(defaultValue = "3") int dan, Model model) {
		String result = "";
		for (int i = 1; i <= 9; i++) {
			result += dan + "x" + i + "=" + dan * i + "<br>";
		}
		model.addAttribute("result", result);
		return "test/ajax_gugu_result";
	}

}
