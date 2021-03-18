package heejeong;

public class RomantoInteger13 {

	//IV = V-I 4, IX = X-I 9
	//XL = L-X 40, XC = C-X 90
	//CD = D-C 400 CM = M-C 900
    public static int romanToInt(String s) {
    	int val = 0;
    	for(int i=0;i<s.length();i++) {
    		String roman = s.substring(i, i+1);

        //인덱스 문제를 해결하려다가 30분을 넘겼지만, 어쨋든 정상작동한 것에 뿌듯합니다
        //더 간소화된 코드가 분명히 있을텐데 더 공부하려고요
    		String roman2 = "";
    		if(i<(s.length()-2)) {
    			roman2 = s.substring(i, i+2);
    		}else {
    			roman2 = s.substring(i, s.length());
    		}

			switch(roman) {
    			case "I":
    				if(roman2.equals("IV") || roman2.equals("IX")) {
    					val-=1;
    				}else {
    					val+=1;
    				}
    				break;
    			case "V": val+=5; break;
    			case "X":
    				if(roman2.equals("XL") || roman2.equals("XC")) {
    					val-=10;
    				}else {
    					val+=10;
    				}
    				break;
    			case "L": val+=50; break;
    			case "C":
	    			if(roman2.equals("CD") || roman2.equals("CM")) {
	    				val-=100;
	    			}else {
	    				val+=100;
	    			}
	    			break;
    			case "D": val+=500; break;
    			case "M": val+=1000; break;
			}

    		System.out.println("roman = "+roman+",roman2 = "+roman2+", val = "+val);
    	}
        return val;
    }
}
