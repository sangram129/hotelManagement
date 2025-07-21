package com.NewPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteData {

	public static void main(String[] args) {

		String path = "C:\\Users\\pc\\New Text Document.txt";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			System.out.println("success!!!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}