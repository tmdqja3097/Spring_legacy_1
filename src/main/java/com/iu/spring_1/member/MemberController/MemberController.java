package com.iu.spring_1.member.MemberController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {
	
	@RequestMapping(value="memberJoin", method = RequestMethod.GET)
	public String memberJoin() {
		return "member/memberJoin";
	}
	
	@RequestMapping(value="memberJoin", method = RequestMethod.POST)
	public String memberJoin2() {
		System.out.println("MemberJoin Post");
		return "member/memberJoin";
	}
	
	@RequestMapping(value="memberLogin", method = RequestMethod.GET)
	public String memberLogin() {
		return "member/memberLogin";
	}
	
	@RequestMapping(value="memberLogin", method = RequestMethod.POST)
	public String memberLogin2() {
		System.out.println("MemberLogin Post");
		
		return "redirect:../";
	}
	
	@RequestMapping(value="memberPage", method = RequestMethod.GET)
	public String memberPage() {
		return "member/memberPage";
	}
	
	@RequestMapping(value="memberDelete", method = RequestMethod.GET)
	public String memberDelete() {
		System.out.println("Member Delete");
		return "member/memberDelete";
	}
	
	@RequestMapping(value="memberLogout", method = RequestMethod.GET)
	public String memberLogout() {
		return "member/memberLogout";
	}
	
	@RequestMapping(value="memberUpdate", method = RequestMethod.GET)
	public String memberUpdate() {
		return "member/memberUpdate";
	}
	
	@RequestMapping(value="memberUpdate", method = RequestMethod.POST)
	public String memberUpdate2() {
		System.out.println("MemberUpdate Post");
		return "member/memberUpdate";
	}
	
	
}
