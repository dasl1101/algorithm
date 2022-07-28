//백준 1157 : 20220728

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int alphabet[] = new int[26]; //알파벳 저장할 배열
		String str = in.next(); //문자 받기
		str = str.toUpperCase(); //모두 대문자로 바꾸기
		for(int i=0; i<str.length(); i++) { 
			alphabet[str.charAt(i)-'A']++;
			//문자 하나씩 떼서 A 뺀 숫자 = 알파벳 순서 자리에 들어감(A=0, B=1번째 자리)
			//만약 중복값이 있다면 alphabet[str.charAt(i)-'A']의 값이 늘어난다
		}
		int max = 0, result = 0; 
		//max = 문자 안에 들어간 해당 알파벳의 개수(중복이 가장 많은 알파벳의 개수로 바뀌게 됨) / result = 해당 알파벳 
		for(int i=0; i<alphabet.length; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i]; //더 중복 많은 개수로 바뀜
				result = i;
			}
			else if(max == alphabet[i]) { //가장 큰 수가 중복
				result = -2; // ?의 아스키코드값이 63이라 A보다 2 작다
			}
		}
		System.out.printf("%s" , Character.toString((char)(result+'A')));		
		//%s = 문자열이기 때문에 char형을 String으로 형변환해야 한다.
	}
	
}

