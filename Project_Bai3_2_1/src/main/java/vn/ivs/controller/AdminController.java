package vn.ivs.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("/adminCP/index")
	public String trangChuQuanTri() {
		//----
		// do sth
		//tra ve view
		return "adminCP/index";
	}
}
