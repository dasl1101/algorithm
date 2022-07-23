//백준 1009 : 20220723 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine()); //테스트케이스 개수, 문자열로 불러오기 때문에 형변환 해야한다
        
        int a , b, r;
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //문자를 나눠주는 클래스, 공백을 기준으로 나눠준다
            
            a = Integer.parseInt(st.nextToken()); //StringTokenizer 클래스 객체에서 다음 토큰을 읽는것
            b = Integer.parseInt(st.nextToken()); //공백 다음 숫자
            
            r = 1;
            for(int j = 0; j < b; j++) {
                r = (r * a) % 10;  //10으로 나눠서 제곱한 값의 1의 자리만을 곱하게 한다   
            }
            if(r == 0) {
                System.out.println(10); //나머지가 0인 경우에는 10번 컴퓨터
            }else {
                System.out.println(r); 
            }
        }
        br.close();
 
    }
 
}


