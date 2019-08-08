package com.accenture.dao;

import java.io.IOException;

import com.accenture.model.Contact;

public interface RegisterContactDAO {

	/**
	 * Method to register a user
	 * 
	 * @param contact
	 * @throws IOException
	 */
	void register(Contact contact) throws IOException;

	/**
	 * Method to consult if the identification already exist in database
	 * 
	 * @param identification
	 * @throws IOException 
	 */
	void validateIdentification(Integer identification) throws IOException;

}
