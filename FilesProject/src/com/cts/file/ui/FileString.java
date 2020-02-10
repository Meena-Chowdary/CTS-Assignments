package com.cts.file.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileString {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		//FileWriter fw=null;
		Scanner scan=null;
		try {
			scan=new Scanner(System.in);
			System.out.println("Enter filename");
			String filename=scan.nextLine();
			System.out.println("Enter string");
			String word=null;
			word=scan.nextLine();
			fr=new FileReader(filename);
			br=new BufferedReader(fr);
			//fw=new FileWriter("Search-string.txt");
			while(true) {
				String line=br.readLine();
				if(line==null)
					break;
				String[] names=line.split(" ");
				for(String name : names) {
					if(word.equals(name))
						//fw.write(line+"\n");
						System.out.println(line);
				}
			}
		}catch(IOException exep) {
			System.out.println(exep.getMessage());
		}finally {
			try {
			fr.close();
			br.close();
			//fw.close();
			scan.close();
		}catch(IOException exep) {
			System.out.println(exep.getMessage());
		}

	}
	}
}


