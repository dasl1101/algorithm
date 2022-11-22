import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//221122 백준 10828 스택
class Main{ 
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = in.nextInt();
		int stack[] = new int[N];
		int size = 0;
		for(int i=0; i<N; i++) {
			String cmd = in.next();
			
			if(cmd.equals("push")) {
				int num = Integer.parseInt(in.next());
				stack[size++] = num;
				
			}else if (cmd.equals("top")) {
				if(size == 0) {
					bw.write("-1\n");
				}else {
					bw.write(stack[size-1]+"\n");
				}
				
			}else if(cmd.equals("size")) {
				bw.write(size+"\n");
				
			}else if(cmd.equals("empty")) {
				if(size == 0) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
				
			}else if(cmd.equals("pop")) {
				if(size == 0) {
					bw.write("-1\n");
				}else {
					bw.write(stack[size-1]+"\n");
					size-=1;
				}
			}
		}
		bw.flush();
		
	}
}	