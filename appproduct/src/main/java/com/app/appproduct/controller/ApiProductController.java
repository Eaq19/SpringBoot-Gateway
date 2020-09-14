/**
 * 
 */
package com.app.appproduct.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eandr
 *
 */
@RestController
@RequestMapping("/product")
public class ApiProductController {

	@GetMapping("/list")
	public ResponseEntity<?> list() throws Exception {
		List<String> list = Arrays.asList("Casa", "Carro");
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> get() throws Exception {
		return new ResponseEntity<>("Este es el microservicio de producto", HttpStatus.OK);
	}
}
