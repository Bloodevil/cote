package heejeong;

import java.util.*;

public class HeightChecker0423 {
    public int heightChecker(int[] heights) {
        int [] expected = heights.clone();
        Arrays.sort(expected);

        int check = 0;
        for(int i=0;i<heights.length;i++){
            if(heights[i] != expected[i]){
                check++;
            }
        }

        return check;
    }

    // counting sort
    // make an array : 1 <= heights.length <= 100
    public int heightChecker2(int[] heights) {
        int [] freq = new int [101];

        for (int height : heights) {
            freq[height]++;
        }

        int result = 0;
        int index = 0;
        for (int height : heights) {
            while (freq[index] == 0) {
                index++;
            }

            if (index != height) {
                result++;
            }
            freq[index]--;
        }

        return result;
    }
}
