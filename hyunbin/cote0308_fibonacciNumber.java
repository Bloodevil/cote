class cote0308_fibonacciNumber {
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        
        int res=0;
        int a=0, b=1;
        for(int i=0; i<n-1; i++){ //이렇게 하니까 답이 나오긴 하는데 왜... n-1이라고 해야하지....?
            res=a+b;
            a=b;
            b=res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fib(500));
    }
}
