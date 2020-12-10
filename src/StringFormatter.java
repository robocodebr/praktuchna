
public class StringFormatter{
		public  String removeAllOccurences(String str, char ch) {
			return str.replaceAll(ch+"", "");
		}
		public String removeAllOccurences2(String str, char ch) {
			String result="";
			for(int i = 0; i<str.length(); i++) {
				char c = str.charAt(i);
				if(c != ch) result+=c;
			}
			return result;
		}	
	}
