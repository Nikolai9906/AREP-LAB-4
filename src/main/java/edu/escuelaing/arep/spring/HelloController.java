
package edu.escuelaing.arep.spring;

/**
 *
 * @author Nikolai Bermudez
 */
public class HelloController {
	@RequestMapping("/hola")
	static public String hola() {
		return "Saludos desde Micro Spring Boot!";
	}

	@RequestMapping("/hello")
	static public String hello(){
		return "Greetings from Micro Spring Boot!";
	}
}
