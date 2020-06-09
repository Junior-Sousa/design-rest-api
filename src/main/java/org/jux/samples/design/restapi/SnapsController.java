package org.jux.samples.design.restapi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnapsController {

	@GetMapping("/snaps")
	List<Snap> all() {
		return null;
	}
	
	@PostMapping("/snaps")
	Snap add(@RequestBody Snap newSnap) {
		return null;
	}
	
	@GetMapping("/snaps/{id}")
	Snap get(@PathVariable Long id) {
		return null;
	}
	
	@PutMapping("/snaps/{id}")
	Snap replace(@RequestBody Snap newSnap, @PathVariable Long id) {
		return null;
	}
	
	@DeleteMapping("/snaps/{id}")
	void delete(@PathVariable Long id) {
		
	}
}
