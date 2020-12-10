
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "olikyjfhtrgsdeawsjfnhdbgdc";
		char c = 'u';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+removeAllOccurences(str,c));
		str = "kijyuthrgsfedfghjdsadfghjdsafghjdsa";
		c = 'a';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+removeAllOccurences(str,c));
		str = "352542346246";
		c = '6';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+removeAllOccurences2(str,c));
		str = "ysdfydsydsydydydydydydydyd";
		c = 's';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+removeAllOccurences2(str,c));
		str = "text 1";
		c = ' ';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+removeAllOccurences(str,c));

	}
	
	public static String removeAllOccurences(String str, char ch) {
		return str.replaceAll(ch+"", "");
	}
	public static String removeAllOccurences2(String str, char ch) {
		String result="";
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c != ch) result+=c;
		}
		return result;
	}
}
