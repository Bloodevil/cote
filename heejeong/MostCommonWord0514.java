package heejeong;

import java.util.*;

public class MostCommonWord0514 {
    public String mostCommonWord(String paragraph, String[] banned) {
        // 1) 영문자가 아닌 문자 공백으로 치환하고, 중복된 공백 없앤 후 소문자로 바꾸기
        String wordOnly = paragraph.replaceAll("[^a-zA-Z]"," ");
        wordOnly = wordOnly.replace("  ", " ").toLowerCase();

        // 2) 공백 기준으로 단어 split
        String[] strList = wordOnly.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String str : strList){
            map.put(str, map.getOrDefault(str,0)+1);
        }

        // 3) remove banned words
        for(String ban : banned){
            map.remove(ban);
        }

        // 4) find max frequency of word
        int max = 0;
        for(String word : map.keySet()){
            max = Math.max(max, map.get(word));
        }

        // 5) find most common word, return
        for(String word : map.keySet()){
            if(map.get(word) == max){
                return word;
            }
        }

        return wordOnly.replace(" ", "");
    }
}
