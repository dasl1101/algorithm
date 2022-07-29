//���� 1159 : 2022029

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //�ο���
		char apb[]=new char[26]; //���ĺ� ���� �迭
		List<String> players = new ArrayList<>(); //�̸��� ���� ����Ʈ
		for(int i = 0; i < N; i++) {
			players.add(in.next());	//�̸��� ����Ʈ�� ����
		}
		for(String player : players) { //�̸����� �ϳ��� ����
			int first = player.charAt(0)-'a'; //ù��° ���� �ڸ���
			apb[first]++; //�ߺ����ڶ�� ���� �÷��ش�
		}
		StringBuilder group = new StringBuilder(); //����+����
		for(int i = 0; i < 26; i++) { //���ĺ� �ڸ����� �ϳ��� ������
			if (apb[i]>=5) {
			group.append((char)(i+'a')); //5�� ������ group�� �ִ´�
			}
		}			
			if (group.toString() == "") { //5�� �Ѵ� ���� ���ٸ�?
				System.out.println("PREDAJA"); //�ش� ���� ���
		}
			System.out.println(group); //5�� �Ѵ� ���ĺ����� �̾ ����Ѵ�
	}
}

