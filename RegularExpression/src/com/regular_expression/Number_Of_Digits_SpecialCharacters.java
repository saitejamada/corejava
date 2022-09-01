package com.regular_expression;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number_Of_Digits_SpecialCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		
		File f=new File("C:/java2/sample/abcd1.txt");
		f.createNewFile();
		File newf=new File("C:/java2/sample/abcd2.txt");
		newf.createNewFile();
		FileWriter fw1=new FileWriter(newf);
		FileWriter fw=new FileWriter(f);
		fw.write("abcd!@#$%efghijk141564lmnopqrstuvwxyz");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader("C:/java2/sample/abcd1.txt");
		FileReader fr1=new FileReader("C:/java2/sample/abcd2.txt");
		BufferedReader bf=new 	BufferedReader(fr);
		String str=bf.readLine();
		
		System.out.println(" string is "+str);
		Pattern p=Pattern.compile("[0-9,!,@,#,$,%,&]");
		Matcher m=p.matcher(str);
		
		while(m.find())
		{
			
			fw1.write(str.charAt(m.start()));
			
		}
		fw1.flush();
		bf=new 	BufferedReader(fr1);
		str=bf.readLine();
		System.out.println(" New File Is "+str);
	}

}
