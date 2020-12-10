import java.io.*;
import java.util.*;
import java.nio.file.Paths;

public class Task3 {

	public static void main(String[] args) {
		try
        {
			 //File myObj = new File(System.getProperty("user.dir")+"\\src\\text.txt");
			File myObj = new File(Paths.get(".").toString()+"\\src\\text.txt");
		     Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }  
	}

}
