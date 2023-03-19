package vn.ivs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.ivs.beans.User;
@Controller
public class User3Controller {
	@RequestMapping(value = "login3", method = RequestMethod.GET)
	public String loginGet() {
		return "login3";
	}
	@RequestMapping(value = "login3", method = RequestMethod.POST)
	public String loginPost(ModelMap model, User usr) 
	{
		if (usr.getId().equals("admin") && usr.getPwd().equals("62cnttclc")) {
			//đăng nhập thành công
			return "redirect: adminCP/index.html";
		}else {
			//gửi báo lỗi ra trang đăng nhập
			//??
			//đăng nhập thất bại
			model.addAttribute("thongbaoLoi", "Thông tin đăng nhập không đúng");
			return "login3";
		}
	}
	//test trả về một chuỗi
	@ResponseBody
	@RequestMapping("/xinChuoi")
	public String testChuoi() {
		return "Đây là chuỗi tôi cho bạn";
	}
}

