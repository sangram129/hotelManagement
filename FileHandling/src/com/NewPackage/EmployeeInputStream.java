package com.NewPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeInputStream {
	public static void main(String[] args) {
		String path = "C:\\Users\\pc\\New Text Document.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);

			ois.readObject();
			Object obj = ois.readObject();
			EmployeeObjectStream e = (EmployeeObjectStream) obj;
			System.out.println(e.getName());
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException ioe) {
			ioe.printStackTrace();
		}

	}

}
