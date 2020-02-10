package com.cts.file.ui;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		FileReader fr=null;
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter filename");
			String name=scan.nextLine();
			fr=new FileReader(name);
			int ch;
			while(true) {
				ch=fr.read();
				if(ch==-1)
					break;
				System.out.println((char)ch);
			}
		}catch(IOException exep) {
			System.out.println(exep.getMessage());
		}finally {
			try {
				fr.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
