import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // 정렬
        Arrays.sort(g);
        Arrays.sort(s);
        int gIdx = 0;

        // 가장 작은 쿠키부터 아이들 욕심과 비교하여 분배
        for(int sIdx = 0; gIdx < g.length && sIdx < s.length; sIdx++)
        {
            if(g[gIdx]<=s[sIdx]) gIdx++;
        }
        return gIdx;
    }
}