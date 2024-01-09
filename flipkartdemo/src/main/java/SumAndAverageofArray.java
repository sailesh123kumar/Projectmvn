
public class SumAndAverageofArray {
	
	public static void main(String[] args) {
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		double sum=0;
	    double avg=0;
		for (int n : numbers) {
			sum=n+sum;
		}
		System.out.println(sum);
		double len=numbers.length;
		avg=sum/len;
		System.out.println(avg);
	}

}
