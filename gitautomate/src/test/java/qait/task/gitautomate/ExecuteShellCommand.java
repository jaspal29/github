package qait.task.gitautomate;

import java.io.IOException;


public class ExecuteShellCommand {
	
	public static void push(String Link,String Directory,String Repository,String Message) throws IOException, InterruptedException {
		 Process pi = Runtime.getRuntime().exec("chmod +x /home/jaspalchandramola/Desktop/pit.sh");
		 pi.destroy();		
		  Process p = new ProcessBuilder("/home/jaspalchandramola/Desktop/pit.sh",Link,Directory,Repository,Message).start();
	        int rc = p.waitFor();
	        System.out.printf("Script executed with exit code %d\n", rc);
	       


	   
	  
	}

	
	
	
	
	

}
