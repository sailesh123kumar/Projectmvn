
public class LargestNumbreinArray {
	
	public static void main(String[] args) {
		int arr[]= {10,8,2,3,4,5,6,7,9,1,1,10,10,13};
		int value=Integer.MIN_VALUE;
		int size,first = 0,second=0;
		size=arr.length;
		System.out.println("The size of an array is: "+size);
		for (int i = 0; i < arr.length; i++) {
				if(arr[i]>first) {
					second=first;
					first=arr[i];
				}
				else if(arr[i]>	second && arr[i]!=first) {
					second=arr[i];
					
				}	
			}
			System.out.println(second);
			System.out.println("The value is ;"+value);
		}
	}


