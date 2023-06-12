package com.gyojincompany.exe;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gyojincompany.exe.dto.MemberDto;

@Controller
public class TestController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "home";
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		
		return "test";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	
//	@RequestMapping(value = "/loginOk")
//	public String loginOk(HttpServletRequest request, Model model) {
//		
//		String mid = request.getParameter("id");//tiger
//		String mpw = request.getParameter("pw");//12345
//		
//		model.addAttribute("memberID", mid);
//		model.addAttribute("memberPW", mpw);
//		
//		return "loginOk";
//	}	
	
	@RequestMapping(value = "/loginOk", method = RequestMethod.POST)
	public String loginOk(@RequestParam("id") String mid, @RequestParam("pw") String mpw, Model  model) {
		
//		String mid = request.getParameter("id");//tiger
//		String mpw = request.getParameter("pw");//12345
		
		model.addAttribute("memberID", mid);
		model.addAttribute("memberPW", mpw);
		
		return "loginOk";
	}

	
	@RequestMapping(value = "/join")
	public String join() {
		
		return "join";
	}	
	
//	@RequestMapping(value = "/joinOk")
//	public String joinOk(HttpServletRequest request, Model model) {
//		
//		String mid = request.getParameter("id");		
//		String mpw = request.getParameter("pw");
//		String mname = request.getParameter("name");
//		String memail = request.getParameter("email");
//		
//		MemberDto memberDto = new MemberDto();
//		memberDto.setId(mid);
//		memberDto.setPw(mpw);
//		memberDto.setName(mname);
//		memberDto.setEmail(memail);
//		
//		model.addAttribute("mDto", memberDto);		
//		
//		return "joinOk";
//	}
	
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(MemberDto memberDto, Model model) {
		
		model.addAttribute("mDto", memberDto);		
		
		return "joinOk";
	}
	
	@RequestMapping(value = "/sign/{page}")
	public String sign(@PathVariable String page, Model model) {
		
		model.addAttribute("page", page);
		
		return "signOk";
	}
	
	@RequestMapping(value = "/keyword")
	public String keyword() {
		
		return "keyword";
	}
	
	@RequestMapping(value = "/keywordOk")
	public String keywordOk(HttpServletRequest request) {
		
		String keyword = request.getParameter("keyword");
		
		if(keyword.equals("kor" )) {
			return "keywordGood";
		}
		
		return "redirect:keywordBad";
	}
	
	@RequestMapping(value = "/keywordBad")
	public String keywordBad(Model model) {
		
		model.addAttribute("keyword", "kor");
		
		return "keywordBad";
	}
	
	
	
	
	
	
	
}
