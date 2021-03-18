package yujeong;

public class RomanToInteger {
    /*
        주어진 로마자를 int로 반환하는 코드 만들기
        문자는 크기가 작아지는 순으로 배치되어야만 함 (예외 있음)

        X = 1
        V = 5
        X = 10
        L = 50
        C = 100
        D = 500
        M = 1000
     */
    public static int romanToInt(String s) {
        int result=0;

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i); //자릿수
            switch(c){
                case 'I':
                    result+=1;
                    break;
                case 'V':
                    result+=5;
                        if(i>0 && s.charAt(i-1)=='I'){ //앞에 I가 올 경우 -2, i>0조건을 추가해 오류 방지...
                            result-=2;
                            break;
                        }
                    break;
                case 'X':
                    result+=10;
                        if(i>0 && s.charAt(i-1)=='I'){
                            result-=2;
                            break;
                        }
                    break;
                case 'L':
                    result+=50;
                        if(i>0 && s.charAt(i-1)=='X'){
                            result-=20;
                            break;
                        }
                    break;
                case 'C':
                    result+=100;
                        if(i>0 && s.charAt(i-1)=='X'){
                            result-=20;
                            break;
                        }
                    break;
                case 'D':
                    result+=500;
                        if(s.charAt(i-1)=='C'){
                            result-=200;
                            break;
                        }
                    break;
                case 'M':
                    result+=1000;
                        if(i>0 && s.charAt(i-1)=='C'){
                            result-=200;
                            break;
                        }
                    break;
            }
        }//for
        return result;
    }
}
