class Solution {
    public int romanToInt(String s) {
        int sumValue = 0;
        int beforeValue = 0;
        int[] numberArr = new int[s.length()];
        char[] romancharArr = s.toCharArray();  // 문자 배열로 치환

        // 숫자 주입
        for(int i = 0; i < romancharArr.length; i++) {
            switch(romancharArr[i]) {
                case 'M':
                    numberArr[i] = 1000;
                    break;
                case 'D':
                    numberArr[i] = 500;
                    break;
                case 'C':
                    numberArr[i] = 100;
                    break;
                case 'L':
                    numberArr[i] = 50;
                    break;
                case 'X':
                    numberArr[i] = 10;
                    break;
                case 'V':
                    numberArr[i] = 5;
                    break;
                case 'I':
                    numberArr[i] = 1;
                    break;
            }
        }

        // 현재 수가 전에 넣어놨던 수 보다 크면 sumValue 차감하기
        for(int i = numberArr.length-1; i >= 0; i--) {
            if(numberArr[i] < beforeValue) {
                sumValue -= numberArr[i];
            }
            else {
                sumValue += numberArr[i];
                beforeValue = numberArr[i];
            }
        }
        return sumValue;
    }
}