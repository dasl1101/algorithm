//���� 1110 : 20220727

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); 
		int newN = N, cycle = 0, a = 0, b =0; //a = 10�� �ڸ�  b=1�� �ڸ�
		while(true) {
			a = newN / 10;
			b = newN % 10;
			newN = (b * 10) + (a + b) % 10;	
			cycle++;
			if(newN == N) break;
		}
		System.out.println(cycle);
	}
}

