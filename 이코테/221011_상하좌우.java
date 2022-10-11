import java.util.Scanner;

//이코테 20221011-상하좌우
public class Main {
	public static void main(String[] args) throws Exception{
		 Scanner in = new Scanner(System.in);
		 int N = in.nextInt(); //공간의 크기
		 in.nextLine();
		 String plan = in.nextLine(); //이동할 계획을 받음
		 String[] plans = plan.split(""); //받은 계획을 하나씩 쪼개서 배열에 넣는다.
		 int x = 1;
		 int y = 1;//x축, y축
		 for(int i=0; i<plans.length; i++) {
			 if ("L".equals(plans[i])) { 
				 y-=1;				//L을 받으면 y축을 -1한다.
				 if(y==0)y+=1;		//y축이 0이 되면 1로 돌려놓는다.
			 }else if("R".equals(plans[i])) {
				 y+=1;
				 if(y==N+1)y-=1;
			 }else if("U".equals(plans[i])) {
				 x-=1;
				 if(x==0)x+=1;
			 }else if("D".equals(plans[i])){
				 x+=1;
				 if(x==N+1)x-=1;
			 }
		 }
		 
		 System.out.printf("%d %d",x,y);
		 
	}
}