import java.util.*;
//https://www.acmicpc.net/problem/2739

public class googoo {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i = 1; i <=9; i++ ) {
			System.out.println(N+" " + "*"+" " + i +" "+ "="+" " + N * i );
			
		}
		
	}
}

