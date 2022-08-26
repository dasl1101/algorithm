import java.util.Scanner;
//이코테 20220826 - 거스름돈
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int[] coin =  {500, 100, 50, 10}; //동전의 종류
		int N = in.nextInt(); //받는 돈
		int count = 0; //동전 개수
		for(int i=0; i<coin.length; i++) {
			count+= N / coin[i]; //큰 수부터 나눈 값을 동전 개수에 더한다
			N %= coin[i]; //나머지를 다시 N에 대입한다
		}
		System.out.println(count);
	}
}