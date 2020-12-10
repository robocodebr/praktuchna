
public class Task2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFormatter strFormatter = new StringFormatter();
		String str = "olikyjfhtrgsdeawsjfnhdbgdc";
		char c = 'u';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+strFormatter.removeAllOccurences(str,c));
		str = "kijyuthrgsfedfghjdsadfghjdsafghjdsa";
		c = 'a';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+strFormatter.removeAllOccurences(str,c));
		str = "352542346246";
		c = '6';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+strFormatter.removeAllOccurences2(str,c));
		str = "ysdfydsydsydydydydydydydyd";
		c = 's';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+strFormatter.removeAllOccurences2(str,c));
		str = "text 1";
		c = ' ';
		System.out.println("string "+str+", char "+c);
		System.out.println("result "+strFormatter.removeAllOccurences(str,c));

	}
	
	
}
