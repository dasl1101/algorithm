//���� 1075 : 20220726

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); 
		int F = in.nextInt();
		N/=100; //N = N/100
		for(int i=0; i<100; i++) { //1�� ���ڸ� �ø�
			if((N*100+i) % F == 0) {
			System.out.printf("%02d", i); //����2�ڸ� 
			break;
			}
		}
	}
}

