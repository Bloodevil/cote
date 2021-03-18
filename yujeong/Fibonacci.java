package yujeong;

public class Fibonacci {
	public static int fib(int n) {
		/*
		 	F (0) = 0, F (1) = 1
			F (n) = F (n-1) + F (n-2), n> 1
			0 <= n <= 30
		 */
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		System.out.println(fib(30)); //832040
		//지금의 방식은 30일 경우 30번 다시 계산해야 한다... 엄청 비효율적인 방법인데 더 나은 방법을 모르겠다
	}

}
