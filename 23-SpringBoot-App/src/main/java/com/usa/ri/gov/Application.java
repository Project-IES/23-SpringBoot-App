package com.usa.ri.gov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private Map<String, Object> cache = new HashMap<String, Object>();
	private static final String REST_URL = "hhtp://www.equifax.com/getScore";
	public static void main(String[] args) {
		ConfigurableApplicationContext run1 = SpringApplication.run(Application.class, args);
				int a =10;
  }
	//IES-301 changes
	public void load DatatoCache(){
		//logic
  }
	
}
