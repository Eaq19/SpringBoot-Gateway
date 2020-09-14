/**
 * 
 */
package com.app.apiServiceEmployee.controller;

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
@RequestMapping("/api")
public class EmployeeController {

	@GetMapping("/employee/list")
	public ResponseEntity<?> list() throws Exception {
		List<String> list = Arrays.asList("Edison", "Andres");
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
}
