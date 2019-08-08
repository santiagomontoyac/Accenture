package com.accenture.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Repository;

import com.accenture.dao.RegisterContactDAO;
import com.accenture.model.Contact;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class RegisterContactDAOImpl implements RegisterContactDAO {

//	final FirebaseDatabase database = FirebaseDatabase.getInstance();
//	DatabaseReference ref = database.getReference("server/saving-data/fireblog");

	/**
	 * Method to register a user
	 */
	@Override
	public void register(Contact contact) throws IOException {
		String url = "https://testbankapi.firebaseio.com/clients.json";
		System.out.println(contact);
		System.out.println("DATABASE CONNECTION AND SAVE DATA");
		ObjectMapper Obj = new ObjectMapper();
		String jsonInputString = Obj.writeValueAsString(contact);
		URL obj = new URL(url);
		HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		postConnection.setRequestMethod("POST");
//		postConnection.setRequestProperty("userId", "a1bcdefgh");
		postConnection.setRequestProperty("Content-Type", "application/json");
		postConnection.setRequestProperty("Accept", "application/json");
		postConnection.setDoOutput(true);
		OutputStream os = postConnection.getOutputStream();
		os.write(jsonInputString.getBytes("utf-8"), 0, jsonInputString.getBytes("utf-8").length);
		os.flush();
		os.close();
		StringBuffer response = new StringBuffer();
		int responseCode = postConnection.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(postConnection.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		// print result
		System.out.println(response.toString());
		System.out.println("END");
	}

	/**
	 * Method to consult if the identification already exist in database
	 * 
	 * @throws IOException
	 */
	@Override
	public void validateIdentification(Integer identification) throws IOException {
		String url = "https://testbankapi.firebaseio.com/clients.json";
		System.out.println(url);
		System.out.println(identification);
		System.out.println("DATABASE CONNECTION AND CONSULT DATA");

		URL urlForGetRequest = new URL(url);
		String readLine = null;
		HttpURLConnection getConnection = (HttpURLConnection) urlForGetRequest.openConnection();
		getConnection.setRequestMethod("GET");
//		getConnection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
		int responseCode = getConnection.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(getConnection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();
			// print result
			System.out.println("JSON String Result " + response.toString());
			// GetAndPost.POSTRequest(response.toString());
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

		} else {
			System.out.println("GET NOT WORKED");
		}

//		final FirebaseDatabase database = FirebaseDatabase.getInstance();
//		DatabaseReference ref = database.getReference(url);
//		FirebaseOptions options = new FirebaseOptions.Builder()
//				.setCredentials(GoogleCredentials.getApplicationDefault()).setDatabaseUrl(url).build();
//		FirebaseApp.initializeApp();
//		FirebaseApp.initializeApp(options);
//		Query q = FirebaseDatabase.getInstance().getReference().child("user");
	}

}
