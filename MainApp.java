package com.model;
import java.util.Scanner;
import java.io.IOException;

public class MainApp {
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to LockedMe.com");
		try(Scanner sc=new Scanner(System.in)){
		FilesOprn file = new FilesImpl();
		int ch=0;
		do {
			System.out.println("   LockedMe.com menu");
			System.out.println("--------------------------");
			System.out.println("1.create a directory");
			System.out.println("2.search files");
			System.out.println("3.Delete file");
			System.out.println("4.Sort files");
			System.out.println("5.Exit");
			System.out.println("Enter your Choice : ");
			ch=sc.nextInt();
		//	String filename;
			switch(ch) {
			
			case 1 : 
					file.createFile();
					break;
			case 2 :
					Scanner o1=new Scanner(System.in);
					String fname1 = o1.nextLine();
					file.getFile(fname1);
					break;
			case 3 : 
					Scanner o2 = new Scanner(System.in);
					String fname2 = o2.nextLine();
					file.DeleteFile(fname2);
					break;
			case 4 :
					file.listAllFiles();
					break;
			case 5 :
					System.out.println("Thank you for using LockedMe");
					break;
			default :
					System.out.println("Invalid option..Try it again"); 
					break;
			}
		}while(ch!=5);
						
		
		}
		
	}

}
