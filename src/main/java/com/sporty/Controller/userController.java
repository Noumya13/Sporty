package com.sporty.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
@GetMapping("/userpass")
public static String userpass()
{
	return "hellohi";
}
@GetMapping("/dashboard")
public String dash()
{
	return "dashboard";
}
@GetMapping("/changepass")
public String changepass()
{
	return "changepass";
}
@GetMapping("/products")
public String manageproduct()
{
	return "products";
}
@GetMapping("/users")
public String manageuser()
{
	return "user";
}
@GetMapping("/purchase")
public String purchasereport()
{
	return "purchasereport";
}
}
