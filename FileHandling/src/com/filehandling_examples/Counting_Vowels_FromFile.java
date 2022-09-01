package com.filehandling_examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Counting_Vowels_FromFile {

	public static void main(String[] args) throws IOException  {
		
		int vcount=0,ccount=0,scount=0,dcount=0;
		
		File f=new File("C:/java2/sample/abc.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("abcdefghijklmnopqrstuvwxyz");
		fw.write("Saiteja");
		fw.write("Mada");
		fw.write('0');
		fw.write("!@#$%");
		fw.flush();
		
		
		FileReader fr=new FileReader(f);
		char []c=new char[50];
		fr.read(c);
		
		for (char d : c) {
			if(d=='a' || d=='e' || d=='i' || d=='o' || d=='u')
			{
				vcount++;
			}
			else if(d=='!' || d=='@' || d=='#' || d=='$' || d=='%' || d=='&'|| d=='*')
			{
				scount++;
			}
			else if(d=='0'||d=='1'||d=='2'||d=='3'||d=='4'||d=='5'||d=='6'||d=='7'||d=='8'||d=='9')
			{
				dcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println("Number Of  Vowels Present In File Are "+vcount);
		System.out.println("Number Of  Contants Present In File Are "+ccount);
		System.out.println("Number Of  Numbers Present In File Are "+dcount);
		System.out.println("Number Of  Special Characters Present In File Are "+scount);
		fr.close();
	}
}
