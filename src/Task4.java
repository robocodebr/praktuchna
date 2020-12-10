import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String str = getTextFromFile();
		System.out.println("is phrase \"text\" in text.txt: "+findPhrase(str, "text"));
		System.out.println("is phrase \"text2\" in text.txt: "+findPhrase(str, "text2"));
		System.out.println("is phrase \"asv\" in text.txt: "+findPhrase(str, "asv"));
		System.out.println("is phrase \"Lorem\" in text.txt: "+findPhrase(str, "Lorem"));
	}
	
	
	public static boolean findPhrase(String str, String phrase) {
		return str.contains(phrase);
	}
	public static String getTextFromFile() {
		String result = "";
		try
        {
			File myObj = new File(Paths.get(".").toString()+"\\src\\text.txt");
		     Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        result+=data;
		      }
		      myReader.close();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }  
		return result;
	}

}
