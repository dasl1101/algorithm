//���� 1173 : 20220804


import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //��ð�
		int m = in.nextInt(); //�ʱ�ƹ�
		int M = in.nextInt(); //�ִ�ƹ�
		int T = in.nextInt(); //1�� � �� ���� �ƹ�
		int R = in.nextInt(); //1�� �޽� �� �������� �ƹ�
		int min = m;//�ּҸƹ�
		int count = 0; //�+�޽��� �ð�
		
		if((M-m) < T) { //� �ð��� 1�� �̸��� ��� 
			System.out.println(-1);
		}else {
			while(true) {
				if((m + T) <= M) {
					m += T; //�ƹ��� �и��� ��½�Ŵ
					N--; //��� ������ 1�о� ����(0�Ǹ� ��)
				}else {
					m = m - R; //�ִ�ƹ��� �Ǹ� �޽��ؼ� �ƹ� ����Ʈ��
				}
				if(m < min) {
					m = min;
				}
				count++;
				if(N == 0) break;
			}
			System.out.println(count);
		}
	
		
			
	}

}