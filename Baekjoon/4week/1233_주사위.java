import java.util.Scanner;

//백준 1233 : 20220811

public class Main {
	public static void main(String[] args) throws Exception{
		int S1, S2, S3;
		Scanner in = new Scanner(System.in);
		S1 = in.nextInt();
		S2 = in.nextInt();
		S3 = in.nextInt();
		int num1[] = new int[S1];
		int num2[] = new int[S2];
		int num3[] = new int[S3];
		int num4[] = new int[S1*S2*S3];
		
		for(int i = 0; i < 40; i++) { //각 배열에 값 넣기
			if(num1.length >= i + 1) {
				num1[i] = i + 1;}
			if(num2.length >= i + 1) {
				num2[i] = i + 1;}
			if(num3.length >= i + 1) {
				num3[i] = i + 1;}
		}
		int sum = 0;
		for(int i = 0; i<num1.length; i++) {
			for(int j = 0; j<num2.length; j++) {
				for(int k = 0; k<num3.length; k++) {
					sum = num1[i]+num2[j]+num3[k];
					num4[sum]++; //모든 경우의 수 더하기(완전탐색)
				}
			}
		}
		
		int key = 0, result = 0;
		for(int i = 0; i<num4.length; i++) {
			key = Math.max(key, num4[i]);//더 많이 나온 수를 key에 저장
		}
		for(int i = 0; i<num4.length; i++) { //작은 수를 꺼내기 위해 for문을 다시 돌림
			if (key == num4[i]) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		in.close();
	}
}