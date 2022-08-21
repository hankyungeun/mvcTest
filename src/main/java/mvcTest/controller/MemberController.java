package mvcTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("msg", "Member List 입니다.");
		return "/member/list";
	}
}