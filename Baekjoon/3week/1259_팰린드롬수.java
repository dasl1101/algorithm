//백준 1259 : 20220801


import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String N; //주어지는 수
		
		while (true) {
			N = in.next();
			if (N.equals("0")) break;
			
			char [] charN = new char[N.length()];
			for (int i = 0; i < N.length(); i++) {
				charN[i] = N.charAt(i); //한자리에 한글자씩 배열에 넣기
			}
			boolean flag = true; //yes no 확인하는 플래그
			for (int i = 0; i < charN.length -1 -i; i++) {
				//시작하는 수와 끝나는 수 비교 (점점 가까워짐)
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