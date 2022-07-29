//백준 1159 : 2022029

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //인원수
		char apb[]=new char[26]; //알파벳 순서 배열
		List<String> players = new ArrayList<>(); //이름들 담을 리스트
		for(int i = 0; i < N; i++) {
			players.add(in.next());	//이름을 리스트에 담음
		}
		for(String player : players) { //이름들을 하나씩 돌림
			int first = player.charAt(0)-'a'; //첫번째 글자 자리수
			apb[first]++; //중복글자라면 값을 늘려준다
		}
		StringBuilder group = new StringBuilder(); //문자+문자
		for(int i = 0; i < 26; i++) { //알파벳 자리에서 하나씩 꺼내기
			if (apb[i]>=5) {
			group.append((char)(i+'a')); //5가 넘으면 group에 넣는다
			}
		}			
			if (group.toString() == "") { //5가 넘는 수가 없다면?
				System.out.println("PREDAJA"); //해당 글자 출력
		}
			System.out.println(group); //5가 넘는 알파벳들을 이어서 출력한다
	}
}

