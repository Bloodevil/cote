public class DivisorGame1025 {
	public static void main(String[] args) {
		System.out.println(divisorGame(3));
	}

    public static boolean divisorGame(int N) {
    	boolean win = false;
    	int count = 0;

    	//매번 배열로 만들어야 하나 ?
    	int [] x = new int [N-1];

    	//x는 1부터 N-1까지의 정수집합
		for(int i=0;i<N-1;i++) {
			x[i] = 1+i;
			System.out.println("x[i]="+x[i]);
			if(N%x[i]==0) {	//중 나눠서 0이되는 수 : 즉 N의 약수
				count++;
			}
		}

    	//x값은 N의 약수 중 N을 제외 한 N의 약수

    	// 만족하는 전체 x의 개수가 홀수일때 Alice 승리
    	// 한번 더 돌때 의 경우를 생각하지 못했음
    	if(count%2==1) {
    		win=true;
    	}

    	return win;
    }
}
