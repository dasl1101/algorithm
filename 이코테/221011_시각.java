import java.util.Scanner;

//이코테 20221011-시각
public class Main {
	public static void main(String[] args) throws Exception{
		 Scanner in = new Scanner(System.in);
		 int N = in.nextInt(); //입력받는 시각
		 int count = 0;
		 for(int i=0; i<=N; i++) {
			 for(int j=0; j<60; j++) {
				 for(int k=0; k<60; k++) {
					 if (i%10 == 3 || j/10 == 3 || j%10 == 3 || k/10 == 3 || k%10 == 3){
						 count++;
					 }
				 }
			 }
		 }
		System.out.println(count);
	}
}