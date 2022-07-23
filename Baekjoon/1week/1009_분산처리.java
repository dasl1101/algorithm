//���� 1009 : 20220723 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine()); //�׽�Ʈ���̽� ����, ���ڿ��� �ҷ����� ������ ����ȯ �ؾ��Ѵ�
        
        int a , b, r;
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //���ڸ� �����ִ� Ŭ����, ������ �������� �����ش�
            
            a = Integer.parseInt(st.nextToken()); //StringTokenizer Ŭ���� ��ü���� ���� ��ū�� �д°�
            b = Integer.parseInt(st.nextToken()); //���� ���� ����
            
            r = 1;
            for(int j = 0; j < b; j++) {
                r = (r * a) % 10;  //10���� ������ ������ ���� 1�� �ڸ����� ���ϰ� �Ѵ�   
            }
            if(r == 0) {
                System.out.println(10); //�������� 0�� ��쿡�� 10�� ��ǻ��
            }else {
                System.out.println(r); 
            }
        }
        br.close();
 
    }
 
}


