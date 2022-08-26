import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//이코테 20220826 - 큰 수의 법칙
public class Main {
	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     StringTokenizer st = new StringTokenizer(br.readLine()); 
	     //StringTokenizer : 띄어쓰기 기준으로 문자열 분리
	     int N = Integer.parseInt(st.nextToken());
	     int M = Integer.parseInt(st.nextToken());
	     int K = Integer.parseInt(st.nextToken());
	     
	     int[] arr = new int[N]; //변수들을 담을 배열
	     
	     for(int i=0; i<N; i++) {
	    	 arr[i] = Integer.parseInt(st.nextToken());
	     }
	     Arrays.sort(arr); //오름차순 정렬
		
	     int big = arr[N-1]; //가장 큰 수
	     int big2 = arr[N-2]; //두번째로 큰 수
	     int result = 0;
	     while(M != 0) { //M번만큼 반복
	    	 for(int i = 0; i < K; i++) {
	    		 result += big; //가장 큰 수 K번만큼 더함
	    		 M--;
	    	 }
	    	 result += big2; //두번째로 큰 수 더함
	    	 M--;
	     }
	     System.out.println(result);
	}
}