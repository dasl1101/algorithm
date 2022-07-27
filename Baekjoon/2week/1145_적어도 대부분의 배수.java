//น้มุ 1145 : 20220727

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num[] = new int[5];
		for(int i=0; i<5; i++) {
			num[i] = in.nextInt(); 
		}
		int result = 1;
		while(true) {
			int count = 0;
			for(int i=0; i<5; i++) {
				if (result % num[i] == 0) {
					count++;
				}
				if (count >=3) {
					System.out.println(result);
					return;
				}
			}
			result++;
		}
	}
	
}

