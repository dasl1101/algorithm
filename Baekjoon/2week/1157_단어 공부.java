//���� 1157 : 20220728

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int alphabet[] = new int[26]; //���ĺ� ������ �迭
		String str = in.next(); //���� �ޱ�
		str = str.toUpperCase(); //��� �빮�ڷ� �ٲٱ�
		for(int i=0; i<str.length(); i++) { 
			alphabet[str.charAt(i)-'A']++;
			//���� �ϳ��� ���� A �� ���� = ���ĺ� ���� �ڸ��� ��(A=0, B=1��° �ڸ�)
			//���� �ߺ����� �ִٸ� alphabet[str.charAt(i)-'A']�� ���� �þ��
		}
		int max = 0, result = 0; 
		//max = ���� �ȿ� �� �ش� ���ĺ��� ����(�ߺ��� ���� ���� ���ĺ��� ������ �ٲ�� ��) / result = �ش� ���ĺ� 
		for(int i=0; i<alphabet.length; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i]; //�� �ߺ� ���� ������ �ٲ�
				result = i;
			}
			else if(max == alphabet[i]) { //���� ū ���� �ߺ�
				result = -2; // ?�� �ƽ�Ű�ڵ尪�� 63�̶� A���� 2 �۴�
			}
		}
		System.out.printf("%s" , Character.toString((char)(result+'A')));		
		//%s = ���ڿ��̱� ������ char���� String���� ����ȯ�ؾ� �Ѵ�.
	}
	
}

