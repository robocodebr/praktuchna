import java.util.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = "";
		System.out.println("insert the number: ");
		do { 
			inputString += scanner.next();
		} while(!inputString.contains("0"));
		try {  
			String onlyNumber = "";
			for(int i = 0; i<inputString.length(); i++) {
				char c = inputString.charAt(i);
				if(Character.isDigit(c) && !(c=='0' && onlyNumber.isEmpty())){
					onlyNumber += c;
				}
			}
			 String result = "";
			 for( int j = onlyNumber.length()-1, counter = 0;j>=0; j--,counter++) {
				if(counter%3 == 0 && j!=onlyNumber.length()-1) {
					result = ","+result;
				}
				result = onlyNumber.charAt(j)+result;
			 }
			 System.out.println("result: "+result);
		} catch(Exception e){ 
			System.out.println("can't parse this string "+inputString);
		} 
	}

}
