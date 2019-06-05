/**
 *
 */
package org.simon.pascal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nsimonin1
 *
 */
@RestController
public class HelloController {

	@GetMapping("/salut")
	public String bonjour(@RequestParam String name) {
		return "Bonjour "+name;
	}
}
