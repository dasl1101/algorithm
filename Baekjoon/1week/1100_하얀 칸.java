//���� 1100 : 20220724 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;	//���� ��
		for(int i = 0; i < 8; i++) {
			String chess = br.readLine();
			for(int j = 0; j < 8; j++) {			
				if(i % 2 == 0) { //¦����ǥ
					if(j % 2 == 0) { //¦�� = ¦��(���)
						if(chess.charAt(j) == 'F') result++; //result�� �߰����ش�. 
					}
				}else {
					if(j % 2 != 0) { //Ȧ����ǥ,Ȧ����ǥ =¦��(���)
						if(chess.charAt(j) == 'F') result++; //result�� �߰����ش�.
					}
				}
			}
		}
		System.out.println(result);
	}

}

