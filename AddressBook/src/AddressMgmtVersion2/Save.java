
package com.example.libs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class Save {
	private ArrayList<Person> list;
	private String path;
	private ObjectOutputStream oos;
	private boolean flag;
	
	Save(ArrayList<Person> list, String path){
		this.list = list;
		this.path = path;
		File file = new File(this.path);
		try {
			this.oos = new ObjectOutputStream(new FileOutputStream(file));
			this.oos.writeObject(this.list);
			flag = true;
		} catch (IOException e) {
			System.out.println("���� �߻� : "+e.getMessage());
			flag = false;
		}
	}
	
	void backup() {
		if(this.flag) System.out.println("Save Success");
		else System.out.println("Save Failure");
	}
	
	
	
}
