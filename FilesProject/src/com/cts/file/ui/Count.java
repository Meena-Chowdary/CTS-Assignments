package com.cts.file.ui;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {
	public static void main(String[] args) {
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("Count.txt");
			br=new BufferedReader(fr);
			String curLine=br.readLine();
			while(curLine!=null) {
				lineCount++;
				String[] words=curLine.split(" ");
				wordCount+=words.length;
				for(String word: words)
					charCount+=word.length();
				curLine=br.readLine();
			}
			System.out.println("Number of characters in line"+charCount);
			System.out.println("Number of wordss in line"+wordCount);
			System.out.println("Number of lines"+lineCount);
		}catch(IOException exep) {
			exep.printStackTrace();
		}finally {
				try {
					fr.close();
					br.close();
				}catch(IOException exep) {
					exep.printStackTrace();
				}
			}
		}
	}


