package io.java.springboot.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/user")
	public List<User> getUserAll() {
		return Arrays.asList(
				new User(1,"Chanpan","Chanpan07","Nuttaphon","Chanpan")
		);
	}
}
