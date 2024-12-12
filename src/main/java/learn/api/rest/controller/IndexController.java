package learn.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity index() {
		
		return new ResponseEntity<>("Hello world!", HttpStatus.OK);
		
	}
	
}
