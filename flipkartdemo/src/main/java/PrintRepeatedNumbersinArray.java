
public class PrintRepeatedNumbersinArray {
	
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,6,5,4,7,8,8,9,2};
		boolean flag=false;
		//output Expected={1,2,3,4,5,6,7,8,9}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					System.out.print(arr[j]);
					break;	
				}
				
			}
			
		}
	}

}
