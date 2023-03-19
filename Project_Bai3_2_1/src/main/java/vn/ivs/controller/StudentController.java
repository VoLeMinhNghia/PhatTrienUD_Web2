package vn.ivs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.ivs.beans.Student;
@Controller
public class StudentController {
	@RequestMapping("edit")
	public String suaSinhVien(ModelMap model) {
		Student sv = new Student("Minh Nghĩa", 8.5, "Java Web 2");
		//chú ý rằng, thực tế SV này đươc lấy từ CSDL theo định danh (vd: id)
		//đưa sang view
		model.addAttribute("student", sv);
		return "edit";
	}
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String capNhatSinhVien(@ModelAttribute("student") Student sinhVien, ModelMap model) {
		//ở trên, dữ liệu từ form được đổ vào biến sinhVien thông qua chú thích @ModelAttribute("student")
		//ta sẽ xử lý cập nhật ở đây
		
		//return 1 view nào đó, ví dụ: studentUpdatedData
		model.addAttribute("svCapNhat", sinhVien);
		return "studentUpdatedData";
	}
}
