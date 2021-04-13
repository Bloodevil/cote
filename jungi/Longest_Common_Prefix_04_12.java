/*
가장 짧은 단어로 시도하다가 안되서 그냥 맨 앞 단어로 시도
0번째 단어의 앞에서 부터 잘라가면서 temp에 추가
temp와 strs배열의 나머지 값을 startsWith 함수로 비교
false가 되면 탈출 하고 return
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        else if (strs.length == 1) return strs[0];
        else {
            String temp = "";
            int idx = 0;
            boolean flag = true;
            while(idx < strs[0].length()) {
                if(strs[0].length() < 1) return "";
                temp += strs[0].charAt(idx);
                for(int i = 1; i <strs.length; i++) {
                    flag = strs[i].startsWith(temp);
                    if(!flag) break;
                }
                if(flag) idx++;
                else{
                    return strs[0].substring(0, idx);
                }
            }
            return strs[0];
        }
    }
}