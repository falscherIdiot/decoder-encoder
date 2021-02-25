package de.MissingNameException;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		Encrypt.setFilePath("/home/sam/Documents/x");
		Encrypt.encrypt();
	}
	
}
