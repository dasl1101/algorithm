import java.util.Scanner;

//���� 1225 : 20220809

public class Main {
	public static void main(String[] args) throws Exception{
		String A, B;
		Scanner in = new Scanner(System.in);
		A = in.next();
		B = in.next();
		long result = 0; //int�� ���� ����ʰ��� �Ǿ� long���� ���� 
		for(int i=0; i<A.length(); i++) {	
			for(int j=0; j<B.length(); j++) {
				result += Long.parseLong(A.charAt(i)+"") * Long.parseLong(B.charAt(j)+"");
				//char+""���� String���� ��ȯ�Ѵ�
				//��� �ʰ� ���������� Long���� ��ȯ�Ѵ�
			}	
		}
		System.out.println(result);
	}
}