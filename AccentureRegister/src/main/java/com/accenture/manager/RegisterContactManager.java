package com.accenture.manager;

import java.io.IOException;

import com.accenture.model.Contact;
import com.accenture.model.ResponseDTO;

public interface RegisterContactManager {

	/**
	 * Method to register a user
	 * 
	 * @param contact
	 * @return
	 * @throws IOException
	 */
	ResponseDTO registerContact(Contact contact) throws IOException;

	/**
	 * Method to consult if the identification already exist in database
	 * 
	 * @param identification
	 * @return
	 */
	ResponseDTO validateIdentification(Integer identification);

}
