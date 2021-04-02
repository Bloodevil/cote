class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int result = 0;
        int j = 0;
        for (int i = 0; i < g.length && j < s.length; i++){
            while (j < s.length){
                if (s[j] >= g[i]){        // s[j++]
                    result++;
                    j++;
                    break;
                }
                j++;
            }
        }
        return result;
    }
}
