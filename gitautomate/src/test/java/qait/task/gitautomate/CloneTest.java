package qait.task.gitautomate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CloneTest {
	File file = new File("/home/jaspalchandramola/Desktop/jaspal");
	@BeforeTest
	public void setup() throws IOException
	{
		
		//file where data is to be put
	
		file.mkdir();
		String result="cd /home/jaspalchandramola/Desktop/jaspal \n";
		result=result+" git clone https://github.com/jaspal29/Advance.git";
		FileOutputStream fos = new FileOutputStream(file+"/cl.sh");
		fos.write(result.getBytes());
		fos.flush();
		fos.close();
		Process p2=Runtime.getRuntime().exec("chmod +rwx  /home/jaspalchandramola/Desktop/jaspal/cl.sh");
	    p2.destroy();
		
		
		
	}
  @Test
	public void Test() throws IOException, InterruptedException 
	{
	
		
	    
	  ProcessBuilder processBuilder = new ProcessBuilder("./cl.sh");
	    processBuilder.directory(file);
	  //sets the working directory of process to this folder
	    Process p=processBuilder.start(); 
		
		int x=p.waitFor();
		
		if(x==0){
		
		int sizeoffile=file.list().length-1;
		
		Assert.assertFalse(sizeoffile==0);
		
	}

	
	
	

	}
}



