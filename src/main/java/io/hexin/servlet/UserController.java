package io.hexin.servlet;

import io.hexin.bean.User;
import io.hexin.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 登录
	 */
	@RequestMapping (value = "login", method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public ResponseEntity<String> login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute User user){
		return userService.login(request, response, user);
	}
}
