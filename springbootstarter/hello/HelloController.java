package io.javabrains.springbootstarter.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.Hello;

@RestController
public class HelloController {
	
@RequestMapping("/hello")
	public List<Hello> getHello() {
		return Arrays.asList(
				new Hello("Toyota","Spring Framework"),
				new Hello("Corolla","Spring Framework")
				);
	}
}
