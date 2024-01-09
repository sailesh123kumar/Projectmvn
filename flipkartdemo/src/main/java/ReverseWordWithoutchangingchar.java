
public class ReverseWordWithoutchangingchar {
	public static void main(String[] args) {
		String str="java is a object oriented programming language";
		String output="";
		String rev="";
		String[] split = str.split(" ");
			for (int i = split.length-1; i >=0; i--) {
				rev=rev+split[i]+" ";
				
			}
			output =output+rev;
			
			
			System.out.println(output);
		}
	
}
		
		
//		StringBuffer sb=new StringBuffer(str);
//		System.out.println(sb.reverse());
//		
	


