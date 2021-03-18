package heejeong;

class FibonacciNum509 {
  public static void main(String[] args) {
  		System.out.println("피보나치 수열");
  		int n = 31;
  		System.out.println("n="+fib_DP(n));
  		System.out.println("n="+fib_rec(n));
  		System.out.println("n="+fib_Bottom_Up(n));
  		System.out.println("n="+fib_Top_Down(n));
  	}

  	  //DP
      public static int fib_DP(int n) {
          int [] arr = new int [n+1];

          arr[0] = 0;
          arr[1] = 1;

          if(n<2){
              return arr[n];
          }

          for(int i=2;i<n+1;i++){
              arr[i] = arr[i-2] + arr[i-1];
          }

          return arr[n];
      }

      //Bottom_Up
      public static int fib_Bottom_Up(int n) {
      	if(n<=1) {
      		return n;
      	}

      	int first = 0;
      	int second = 1;

      	int next = 0;
      	for(int i=0;i<n-1;i++) {
      		next = first + second;
      		first = second;
      		second = next;
      	}
      	return next;
      }

      //Top_Down
      public static int fib_Top_Down(int n) {
      	int [] arr = new int [n+1];
      	if(arr[n]>0) {
      		return arr[n];
      	}

      	if(n<=1) {
      		return n;
      	}else {
      		arr[n] = fib_Top_Down(n-1) + fib_Top_Down(n-2);
      		return arr[n];
      	}
      }

      //일반재귀함수
      public static int fib_rec(int n) {
          int result = 0;

          //1. if문으로 했을 때
          if(n==0){
            result=0;
          }else if(n==1){
            result=1;
          }else{
            result=fib(n-1)+fib(n-2);
          }

          //2. switch문
          switch(n){
            case 0: result=0; break;
            case 1: result=1; break;
            default: result=fib_rec(n-1)+fib_rec(n-2);
          }

          return result;
        }
}
