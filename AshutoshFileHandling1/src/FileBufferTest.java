package com;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileBufferTest {
	public static void main(String[] args) {
		FileInputStream f=null;
		BufferedInputStream b=null;
		try 
		{
			f=new FileInputStream("d:/Data.txt");
			b=new BufferedInputStream(f);
			byte[] buff=new byte[100];
			f.read(buff);
			String data=new String(buff);
			System.out.println("The content of file read using BufferedInputStream is "+data);

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
