import java.util.Scanner;

//น้มุ 1267 : 20220820

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int Y  = 0;
		int M  = 0;
		int N = in.nextInt();
		int fee[] = new int [N];
		for(int i=0; i<N; i++) {
			fee[i] = in.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			Y+=(fee[i]/30+1)*10;
			M+=(fee[i]/60+1)*15;
		}
		
		if(Y > M) {
			System.out.println("M "+M);
		}else if(Y < M) {
			System.out.println("Y "+Y);
		}else {
			System.out.println("Y M "+Y);
		}
	}
}