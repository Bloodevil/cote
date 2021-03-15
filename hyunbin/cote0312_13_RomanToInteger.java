public class cote0312_13_RomanToInteger {
    public int romanToInt(String s) {
        //s의 길이를 알아야겠징
        int[] iArr=new int[s.length()];
        String[] arr=s.split("");
        for(int i=0; i<s.length(); i++){
            System.out.println(arr[i]);
            //s에 대해 포문을 돌려서 각 자릿수가 어떤 문자인지 숫자로 치환한다 
            switch(arr[i]){
                case "I": iArr[i]=1;
                break;
                case "V": iArr[i]=5;
                break;
                case "X": iArr[i]=10;
                break;
                case "L": iArr[i]=50;
                break;
                case "C": iArr[i]=100;
                break;
                case "D": iArr[i]=500;
                break;
                case "M": iArr[i]=1000;
                break;
                default: break;
            }
        }
        if(iArr.length==1){
            return iArr[0];
        }
        
        int sum=0;
        //iArr에서 이제 계산을 시작한다
        for(int i=0; i<iArr.length; i++){
            System.out.println(iArr[i]);
        }
        
        for(int i=0; i<iArr.length-1; i++){
            //앞에거가 뒤에거보다 작으면 뒤에거에서 앞에거를 뺀다 
            if(iArr[i] < iArr[i+1]){
                sum+=(iArr[i+1]-iArr[i]);
                i++;
            }else{ //앞에거가 뒤에거보다 크거나 같으면 더한다
                sum+=iArr[i];
            }
            //마지막거면 마지막 젤 작은 수를 더해준다
            if(i==iArr.length-2){
                sum+=iArr[iArr.length-1];
            }
            
            System.out.println(sum);
        }

        /* 줄여본 방법
        for(int i=0; i<iArr.length; i++){
            //앞에거가 뒤에거보다 작으면 뒤에거에서 앞에거를 뺀다. i가 끝에서 두번째까지만.
            if(i<iArr.length-1 && iArr[i] < iArr[i+1]){
                sum+=(iArr[i+1]-iArr[i]);
                i++;
            }else{ //앞에거가 뒤에거보다 크거나 같으면 더한다
                sum+=iArr[i];
            }
        }
        */

        return sum;
    }
}
