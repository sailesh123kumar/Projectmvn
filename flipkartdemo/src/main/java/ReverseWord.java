
public class ReverseWord {
	public static void main(String[] args) {
		String str="java is a object oriented programming language";
		String output="";
		String[] split = str.split(" ");
		for (String word : split) {
			String rev="";
			for (int i = word.length()-1; i >=0; i--) {
				rev=rev+word.charAt(i);
			}	
			output =rev+" "+output;
			
			}
		System.out.println(output);	
		}
		
		
		
//		StringBuffer sb=new StringBuffer(str);
//		System.out.println(sb.reverse());
//		
	}


