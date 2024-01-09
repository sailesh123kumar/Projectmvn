import java.util.Arrays;

public class StringRepeatedWordsprint {

	public static void main(String[] args) {
		
		String str="My life My Way No one can Interrupt My world and No body can follow my path";
		String str1="";
		
		//String duplicate words print
		//Convert it into an array
		//Convert it in to a lowercase
		//iterate through str and print the duplicate if it matches with
		
		String[] split = str.toLowerCase().split(" ");
		for (int i = 0; i < split.length; i++) {
			int count=1;
			for (int j = i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					count++;
					split[j]="0";
					
				}
				
			}
			if(count>1 && split[i]!="0") {
				System.out.println(split[i]+ " The count of word is : "      +count);
			}
			
		}
		
			}

}
