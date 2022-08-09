import java.util.Scanner;

//백준 1225 : 20220809

public class Main {
	public static void main(String[] args) throws Exception{
		String A, B;
		Scanner in = new Scanner(System.in);
		A = in.next();
		B = in.next();
		long result = 0; //int로 쓰면 출력초과가 되어 long으로 수정 
		for(int i=0; i<A.length(); i++) {	
			for(int j=0; j<B.length(); j++) {
				result += Long.parseLong(A.charAt(i)+"") * Long.parseLong(B.charAt(j)+"");
				//char+""으로 String으로 변환한다
				//출력 초과 문제때문에 Long으로 변환한다
			}	
		}
		System.out.println(result);
	}
}