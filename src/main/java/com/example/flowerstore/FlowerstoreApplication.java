package com.example.flowerstore;

import com.example.flowerstore.items.CactusFlower;
import com.example.flowerstore.items.Flower;
import com.example.flowerstore.items.RomashkaFlower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FlowerstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerstoreApplication.class, args);
	}
	@Autowired
	private String data;

	@GetMapping
	public String hello() {
		return data;
	}

//	@GetMapping
//	public List<Flower> hello2() {
//		return List.of(new RomashkaFlower("yellow", 25),
//				new RomashkaFlower( "white", 30),
//				new CactusFlower("green", 50));
//	}
}
