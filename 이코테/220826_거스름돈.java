import java.util.Scanner;
import java.util.ArrayList;
//백준 1292 : 20220823

public class Main {
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= B; i++) {
			for(int j = 0; j < i; j++) {
				if(arr.size() == B) {
					break;
				}
				arr.add(i);
			}
		}
		for(int i = A-1; i <= B-1; i++) {
			sum = sum + arr.get(i);
		}
		System.out.println(sum);
	}
}