package ass_21_nov_23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionHandling {
	
	public void test() throws IOException {
		
		
		//checked exception
		
		//writing to the file
		File f=new File("C:\\Users\\admin\\eclipse-workspace\\AssignmentTasks\\simple.txt");
		
		FileOutputStream fout=new FileOutputStream(f);
		
		String textToBeWrite="Hello this is devi kalyani";
		fout.write(textToBeWrite.getBytes());
		
		fout.flush();
		
		fout.close();
		
		//reading the file
		FileInputStream fin=new FileInputStream(f);
		
		int i=fin.read();  //first letter ASCII value 
		
		while(!(i==-1)) {    //loop until null value
			char ch=(char)i;
			System.out.print(ch);
			i=fin.read();
		}
		
	}

	public static void main(String[] args) throws IOException {
				
		
		//unchecked Exceptions
		try {
		System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(10/2);
		}
		
		ExceptionHandling eh=new ExceptionHandling();
		eh.test();

	}

}
