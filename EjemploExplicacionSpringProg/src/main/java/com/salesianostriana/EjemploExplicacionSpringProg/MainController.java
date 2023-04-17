package com.salesianostriana.EjemploExplicacionSpringProg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@Autowired
	private DummyService service;
	
	@GetMapping({"/","/welcome"})
	public String welcome (@RequestParam(name="nombre", required = false,defaultValue = "Mundo"));
}
}

	

