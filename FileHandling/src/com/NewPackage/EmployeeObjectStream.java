package com.NewPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeObjectStream implements Serializable {
	private int id;
	private String name;

	public EmployeeObjectStream(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		EmployeeObjectStream e = new EmployeeObjectStream(4, "rushi");
		String path = "C:\\Users\\pc\\New Text Document.txt";

		try {
			FileOutputStream fos = new FileOutputStream(path);

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);

			System.out.println("success!!!");
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
