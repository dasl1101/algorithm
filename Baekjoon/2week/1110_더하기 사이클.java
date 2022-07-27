//백준 1110 : 20220727

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); 
		int newN = N, cycle = 0, a = 0, b =0; //a = 10의 자리  b=1의 자리
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

