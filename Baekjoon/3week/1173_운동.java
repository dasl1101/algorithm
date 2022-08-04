//백준 1173 : 20220804


import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //운동시간
		int m = in.nextInt(); //초기맥박
		int M = in.nextInt(); //최대맥박
		int T = in.nextInt(); //1분 운동 후 증가 맥박
		int R = in.nextInt(); //1분 휴식 후 떨어지는 맥박
		int min = m;//최소맥박
		int count = 0; //운동+휴식한 시간
		
		if((M-m) < T) { //운동 시간이 1분 미만일 경우 
			System.out.println(-1);
		}else {
			while(true) {
				if((m + T) <= M) {
					m += T; //맥박을 분마다 상승시킴
					N--; //운동할 때마다 1분씩 줄임(0되면 끝)
				}else {
					m = m - R; //최대맥박이 되면 휴식해서 맥박 떨어트림
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