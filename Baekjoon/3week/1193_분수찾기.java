import java.util.Scanner;

//���� 1193 : 20220808

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int X = in.nextInt();

		for (int i = 1; i <= 10000000; i++) { //i = ���� ��
			if (i >= X) {
				if (i % 2 == 0) { //¦�� �ٿ����� ����: X �и�: ���μ�-X+1 
					System.out.println(X + "/" + (i - X + 1));
				} else {//Ȧ�� �ٿ����� ����: ���μ�-X �и�: X 
					System.out.println(i - X + 1 + "/" + X);
				}
				break;
			}
			X = X - i; //�Է°��� �ڸ����� ���ϱ� ���� �� 
		}
	}
}