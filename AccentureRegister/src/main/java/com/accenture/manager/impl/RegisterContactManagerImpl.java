package com.accenture.manager.impl;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.dao.RegisterContactDAO;
import com.accenture.manager.RegisterContactManager;
import com.accenture.model.Contact;
import com.accenture.model.ResponseDTO;

@Service
public class RegisterContactManagerImpl implements RegisterContactManager {

	@Autowired
	public RegisterContactDAO registerContactDAO;

	/**
	 * Method to register a user
	 */
	@Override
	public ResponseDTO registerContact(Contact contact) throws IOException {
		ResponseDTO responseDTO = new ResponseDTO();
//		try {

			registerContactDAO.register(contact);
			responseDTO.setIdDescription(1);
			responseDTO.setCode(1);
			responseDTO.setDescription("Success");
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "There is some error and the contact has not been saved");
//		}
		return responseDTO;
	}

	/**
	 * Method to consult if the identification already exist in database
	 */
	@Override
	public ResponseDTO validateIdentification(Integer identification) {
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			registerContactDAO.validateIdentification(identification);
			responseDTO.setIdDescription(1);
			responseDTO.setCode(1);
			responseDTO.setDescription("Success");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Identifiction already exists");
		}
		return responseDTO;
	}

}
