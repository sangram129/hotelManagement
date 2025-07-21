package com.NewPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ToReadData { // Read data from the file

	public static void main(String[] args) {
		String path = "C:\\Users\\pc\\New_Text Document.txt";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			String s = "SangramPawar";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				fos.write(c);
			}
			System.out.println("write success!!!");

			FileInputStream fis = new FileInputStream(path);
			System.out.println("success!!!");
			int a = fis.read();
			while (a != -1) {
				System.out.println((char) a);
				a = fis.read();// stores the ascii value (i.e int)
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
