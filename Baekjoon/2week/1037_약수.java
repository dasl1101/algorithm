//���� 1037 : 20220725

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); //����� ����
		int num[] = new int[a];//����� ���� �迭
		
		for(int i=0; i<a; i++) {
			num[i] = in.nextInt(); //�迭 �ȿ� ����� �ֱ�
		}
		Arrays.sort(num);//�������� ����
		System.out.println(num[0]*num[a-1]);//���� ���� ��*���� ū ��=N
		
	}

}

