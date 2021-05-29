package com;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileBufferOutputTest 
{
	public static void main(String[] args) throws IOException {
		FileOutputStream fo=null;
		BufferedOutputStream bo=null;
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		try 
		{
			fo=new FileOutputStream("d:/newFile.txt");
			bo=new BufferedOutputStream(fo);
			byte[] buffer=new byte[1000];
			buffer=("Welcome "+name+" your employee id is "+id).getBytes();
			bo.write(buffer);
			bo.close();
			fo.close();
		
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}