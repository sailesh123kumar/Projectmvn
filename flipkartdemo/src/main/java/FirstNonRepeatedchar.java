import java.util.Iterator;

public class FirstNonRepeatedchar {

	public static void main(String[] args) {
		String str="Sailesh Kumar";
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			char ch=str.toLowerCase().charAt(i);
			boolean repeat =false;
			for (int j = i+1; j < str.length(); j++) {
				if(ch==str.charAt(j)) {
					repeat=true;
					//System.out.println("The repeated char is "+ch);
					break;
				}
			}
			if(repeat==false) {
				System.out.println("The first non repeated char is "+ch);
				break;
			
		}
			
		}

			}
}
