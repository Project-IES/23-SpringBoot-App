package com.usa.ri.gov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private Map<String, Object> cache = new HashMap<String, Object>();
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run1 = SpringApplication.run(Application.class, args);
		
		//IES-301 changes
		public void load DatatoCache(){
			//logic
		}
	}

}
