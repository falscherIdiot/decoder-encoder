package de.MissingNameException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Encrypt {
	
	static File f;
	
	public static void encrypt() throws IOException {
		if(f != null) {
			BufferedReader r = new BufferedReader(new FileReader(f));
			ArrayList<String> lines = new ArrayList<String>();
			
			String line = r.readLine();
			
			while(line != null) {
				lines.add(line);
				line = r.readLine();
			}
			r.close();
			
			System.out.println("LINES >> " + lines.size());
			for (int i = 0; i < lines.size(); i++) {
				System.out.println(lines.get(i));
			}
		} else {
			System.out.println("Please choose the file with [ setFilePath(String path) ]");
			System.exit(0);
		}
	}
	
	public static void setFilePath(String path) {
		f = new File(path);
		if(!f.exists()) {
			System.out.println("File does not exists [ " + path + " ] ");
			System.exit(0);
		}
	}
}
