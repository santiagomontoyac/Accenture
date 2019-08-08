package com.accenture.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.manager.RegisterContactManager;
import com.accenture.model.Contact;
import com.accenture.model.ResponseDTO;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/api" })
public class RegisterContactService {

	@Autowired
	private RegisterContactManager registerContactManager;

	@PostMapping(value = "/register")
	public ResponseDTO registerContact(@RequestBody Contact contact) throws IOException {
		return registerContactManager.registerContact(contact);
	}

	@GetMapping(path = { "/validateIdentification" })
	public ResponseDTO validateIdentification(Integer identification) {
		return registerContactManager.validateIdentification(identification);
	}

}
