package lockedme.com;

import java.util.ArrayList;
import java.util.Scanner;

public class WelcomeScreen {
	

	ArrayList<String> options = new ArrayList<String>();
	
	public static void main(String []args){
		
		WelcomeScreen ws = new WelcomeScreen();
		
		System.out.println("");
		System.out.println("");
		System.out.println("LockedMe.com");
		System.out.println("Lockers Pvt Ltd");
		System.out.println("-----------------------------------");
		System.out.println("Developed by Ram Chandra Temani");
		System.out.println("-----------------------------------");
		System.out.println("");
		System.out.println("");
		
		ws.welcomeScreen();
		
	}
	
	public void welcomeScreen(){
		
		ShowFiles sf = new ShowFiles();
		FileMenu fm = new FileMenu();
		QuitApp qa = new QuitApp();
		
		Scanner sc = new Scanner(System.in);
		options.add("1. Show files");
		options.add("2. Show files options menu");
		options.add("3. Close application");
		
		System.out.println(" ");
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println(" ");
		System.out.println("Select an option");
		for (String i : options){
			System.out.println(i);
		}
		
		int a = sc.nextInt();
		//sc.close();
		
		switch (a){
		
		case 1: 
			sf.Showfiles();
			break;
		
		case 2:
			fm.Filemenu();
			break;
			
		case 3:
			qa.Quitapp();
			break;
			
		default:
			System.out.println("Ivalid option, please choose from options");
			break;
			
		}
		
	}
	
	
			
		
		
	


	
	
}
