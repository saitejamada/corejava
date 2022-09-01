package com.filehandling_examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random_Accessfile {

	public static void main(String[] args) throws IOException {
	
		BufferedWriter bw=new BufferedWriter(new FileWriter ("C:/java2/sample1.txt"));
		bw.write("The Ramayana is a story of Lord Rama written by the SageValmiki. Lord Rama, the prince of Ayodhya, in order to help his father Dasharatha went to exile for fourteen years.");
		bw.flush();
		bw.close();
		RandomAccessFile file=new RandomAccessFile("C:/java2/sample1.txt","r");
		RandomAccessFile file1=new RandomAccessFile("C:/java2/sample1.txt","rw");
		file.seek(50);
		file1.seek(60);
		file1.write("ABcD".getBytes());
		int bte;
		while((bte = file.read()) !=-1)
		{
			System.out.print((char)bte);
		}
		int bte1;
		while((bte1 = file1.read()) !=-1)
		{
			System.out.print((char)bte1);
		}
		
		
	}
}
