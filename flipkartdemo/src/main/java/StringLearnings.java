import java.util.Arrays;

public class StringLearnings {

	public static void main(String[] args) {

		String revstr = "";
		String str = "Sailesh Kumar";
		String str2 =" Weds Esther asha";

		System.out.println(str.charAt(5));
		int len = str.length();
		System.out.println(len);
		
		  
		  String[] split = str.split(" "); 
		  
		  for (int i = 0; i < split.length; i++) {
		  System.out.println(split[i]);
		   }
		  System.out.println(Arrays.toString(split));
		  
		 for (int i = 0; i < str.length(); i++) {
			revstr = str.charAt(i) + revstr;
		}
		System.out.println("The reverse string is " + revstr);
		
		String str3 = str.concat(str2);
		System.out.println(str3);
		System.out.println(str.hashCode());
		int indexOf = str.indexOf("Kumar");
		System.out.println(indexOf);
		int indexOf2 = str.indexOf('a', 8);
		System.out.println(indexOf2);
		System.out.println(str3.compareTo(str));
		String s1="S";
		String s2="K";
		String replace = str.replace(s1, s2);
		System.out.println(replace);
		System.out.println(str.toString());
		System.out.println(str.getClass());
		
		
		StringBuffer sb=new StringBuffer("My name is Sailesh");
		//System.out.println(sb.reverse());
		System.out.println();
		System.out.println(sb.charAt(8));
		System.out.println(str.compareTo(str3));
		char[] charArray = str.toCharArray();
		System.out.println(charArray.toString());
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		}
		
   
	}

}
