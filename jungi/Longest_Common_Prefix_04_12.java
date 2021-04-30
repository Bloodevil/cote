/*
가장 짧은 단어로 시도하다가 안되서 그냥 맨 앞 단어로 시도
0번째 단어의 앞에서 부터 잘라가면서 temp에 추가
temp와 strs배열의 나머지 값을 startsWith 함수로 비교
false가 되면 탈출 하고 return
*/
import java.util.*;

class Solution {
    public int getShortestWordIdx(String[] strs) {
        int idx = 0;

        if (strs == null || strs.length < 1) {
            return idx;
        }
        String shortestWord = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortestWord.length()) {
                shortestWord = strs[i];
                idx = i;
            }
        }
        return idx;
    }

    public String[] removeShortestWord(String[] strs, int idx) {
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            if(i != idx){
                temp.add(strs[i]);
            }
        }
        return temp.toArray(new String[temp.size()]);
    }

    public String longestCommonPrefix(String[] strs) {
        /*
        sudo code
        가장 짧은 단어를 고르고
        그 단어의 길이만큼 나머지 단어를 앞에서 부터 비교
        */
        int strsLength = strs.length;
        if(strsLength < 2) {
            if(strsLength == 0) return "";
            else return strs[0];
        }
        int shortIdx = getShortestWordIdx(strs);
        String shortestWord = strs[shortIdx];
        int shortLength = shortestWord.length();
        if(shortestWord.equals("") || shortLength == 0) return shortestWord;

        String[] removeShortWordArray = removeShortestWord(strs, shortIdx);

        for(int i = 0; i < removeShortWordArray.length; i++) {
            for(int j = shortLength -1; j >= 0; j--){
                if(!removeShortWordArray[i].startsWith(shortestWord)) {
                    shortestWord = shortestWord.substring(0, j);
                }
            }
        }

        return shortestWord;
    }
}