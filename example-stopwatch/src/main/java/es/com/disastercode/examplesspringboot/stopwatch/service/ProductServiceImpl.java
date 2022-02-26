package es.com.disastercode.examplesspringboot.stopwatch.service;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	public String findNameProductById(Integer id) throws InterruptedException {
		Thread.sleep(2000);
		return "name " + id;
	}

}
