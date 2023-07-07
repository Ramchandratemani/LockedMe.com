package lockedme.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileMenu {
	
	File rootfolder = new File(".");
	
	ArrayList<String> options = new ArrayList<String>();

	public void Filemenu(){
		
		//FileMenu fm =new FileMenu();
		WelcomeScreen ws = new WelcomeScreen();
		Scanner sc = new Scanner(System.in);
		options.add("1. Add a file");
		options.add("2. Delete a file");
		options.add("3. Search for file");
		options.add("4. Return to Main Menu");
			
		int b=0;
		
		while(b!= 4){
		
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("");
		System.out.println("Select options from below");
		for (String i : options){
			System.out.println(i);
		}
		b = sc.nextInt();
		//sc.close();
	
		switch(b){
		
			case 1:
				Add();
				break;
			
			case 2:
				Delete();
				break;
				
			case 3:
				Search();
				break;
				
			case 4:
				ws.welcomeScreen();
				break;
			
			default:
				System.out.println("Invalid option, Please choose from options");
				
				break;
		}
		}
		
			
		
		
		
	}

	private void Search() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of file you want to search: ");
		String fileName1 = sc.nextLine();
		//sc.close();
		
		File searchFile = new File(rootfolder.getPath() + "/" + fileName1);
		
		
		if(searchFile.exists()){
			System.out.println("File found: " + searchFile.getName());
		}
		else{
			System.out.println("File not found.");
		}
		//Filemenu();
	}

	private void Delete() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of file you want to delete: ");
		String fileName2 = sc.nextLine();
		//sc.close();
		
		File deleteFile = new File(rootfolder.getPath() + "/" + fileName2);
		
		if(deleteFile.delete()){
			System.out.println("File deleted: " + deleteFile.getName());
		}
		else{
			System.out.println("Failed to delete file.");
		}
		//Filemenu();

	}

	public void Add(){
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of file you want to add: ");
		String fileName = sc.nextLine();
		//sc.close();
		
		File newFile = new File(rootfolder.getPath() + "/" + fileName);
		try{
			boolean created = newFile.createNewFile();
			if (created){
				System.out.println("New file has been created: " + newFile.getName());
			}
			else{
				System.out.println("File already exists with same name");
			}
		}
		catch(IOException e){
			System.out.println("An error occurred!");
		}
		
	}
	
	
}
