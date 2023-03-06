package vn.ivs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/")
public class HomeController {
	@RequestMapping("/index")
	public String trangChu() {
		//----
		// do sth
		//tra ve view
		return "home/index";
	}
	@RequestMapping("/about")
	public String gioithieu() {
		//----
		// do sth
		//tra ve view
		return "home/about";
	}
	@RequestMapping("/contact")
	public String lienHe() {
		//----
		// do sth
		//tra ve view
		return "home/contact";
	}
	@RequestMapping("/feddback")
	public String phanHoi() {
		//----
		// do sth
		//tra ve view
		return "home/feddback";
	}
	@RequestMapping("/faq")
	public String faqStr() {
		//----
		// do sth
		//tra ve view
		return "home/fag";
	}
	@RequestMapping("/admincp/index")
	public String admin() {
		//----
		// do sth
		//tra ve view
		return "home/admincp/index";
	}
}
