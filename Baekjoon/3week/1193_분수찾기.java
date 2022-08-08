import java.util.Scanner;

//백준 1193 : 20220808

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int X = in.nextInt();

		for (int i = 1; i <= 10000000; i++) { //i = 라인 수
			if (i >= X) {
				if (i % 2 == 0) { //짝수 줄에서는 분자: X 분모: 라인수-X+1 
					System.out.println(X + "/" + (i - X + 1));
				} else {//홀수 줄에서는 분자: 라인수-X 분모: X 
					System.out.println(i - X + 1 + "/" + X);
				}
				break;
			}
			X = X - i; //입력값의 자리수를 구하기 위한 식 
		}
	}
}