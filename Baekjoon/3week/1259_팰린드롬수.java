//���� 1259 : 20220801


import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String N; //�־����� ��
		
		while (true) {
			N = in.next();
			if (N.equals("0")) break;
			
			char [] charN = new char[N.length()];
			for (int i = 0; i < N.length(); i++) {
				charN[i] = N.charAt(i); //���ڸ��� �ѱ��ھ� �迭�� �ֱ�
			}
			boolean flag = true; //yes no Ȯ���ϴ� �÷���
			for (int i = 0; i < charN.length -1 -i; i++) {
				//�����ϴ� ���� ������ �� �� (���� �������)
				if (charN[i] != charN[charN.length -(1 + i)]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}