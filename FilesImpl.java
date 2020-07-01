package com.model;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FilesImpl implements FilesOprn{
	
	@Override
	public File createFile() throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file name : ");
		String name = sc.nextLine();
		String filename = "C:\\user" + "\\" + name;
		File file = new File(filename);
		if(!file.exists()) {
			try {
			file.createNewFile();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			System.out.println("Enter the contents in the file ");
			FileWriter fw=new FileWriter(name);
			fw.write(sc.nextLine());
			fw.close();
			return file;
		}
		else {
			System.out.println("File name already exists,Please enter other name ");
		}
		return null;
	}

	@Override
	public List<File> listAllFiles() {
		
		File filesDir = new File("C:\\user");
		List<File>  lfile = Arrays.asList(filesDir.listFiles());
		if(lfile != null) {
			Collections.sort(lfile);
			System.out.println(lfile);
		}
		return null;
	}

	@Override
	public void DeleteFile(String filename) {
		File file=new File("C:\\user" + "\\" + filename);
		try {
			
		if(filename.equals(file.getCanonicalFile().getName())) 
			{
				if(file.delete()) {
			System.out.println("File deletion success");
			System.out.println("Deleted the file: "+filename);
			
			}
			else {
				System.out.println("No such file exist");
			}
		}
				
			else {
				System.out.println("File not found");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		}


	@Override 
	public File getFile(String filename) {
		File file = new File("C:\\user" + "\\" + filename);
		try {
		if(filename.equals(file.getCanonicalFile().getName()) && file.exists())
		{
			//return file;
			System.out.println(filename);
		}
		else
		{
			System.out.println("File not found");
		}
	}catch(IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
		
		
	}
	


