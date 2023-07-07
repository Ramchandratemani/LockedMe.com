package lockedme.com;

import java.io.File;
import java.util.Arrays;

public class ShowFiles {

	
	
	public void Showfiles(){
		
		WelcomeScreen ws = new WelcomeScreen();
		
		File rootfolder = new File(".");
		File[] fileslist = rootfolder.listFiles();
		Arrays.sort(fileslist);
		int c =0;
		System.out.println("List of files in Root Directory");
		for(File file: fileslist){
			if(file.isFile()){
				System.out.println("File "+ ++c + " : " + file.getName());
				System.out.println("");
			}
			else if(file.isDirectory()){
				System.out.println("Directory "+ ++c + " : " + file.getName());
				System.out.println("");
			}
			else{
				System.out.println("The root Directory is empty.");
				System.out.println(" ");
			}
			
		}
		ws.welcomeScreen();
	}
}
