package lang;

public class MathMain {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		double r = Math.random();
		
		int idx = (int)(r*100)%6;
		
		System.out.printf("ar[%d] : %d" , idx, arr[idx]);

	}

}
