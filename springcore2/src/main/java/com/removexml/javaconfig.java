package com.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.removexml")
public class javaconfig {
	
	@Bean
	public stadium stt() {
		return new stadium();
	}

	@Bean
	public bean nitin() {
		bean bb=new bean(stt());
		return bb;
	}
}
