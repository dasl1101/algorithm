//백준 1037 : 20220725

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); //약수의 개수
		int num[] = new int[a];//약수들 받을 배열
		
		for(int i=0; i<a; i++) {
			num[i] = in.nextInt(); //배열 안에 약수들 넣기
		}
		Arrays.sort(num);//오름차순 정렬
		System.out.println(num[0]*num[a-1]);//가장 작은 수*가장 큰 수=N
		
	}

}

