class Solution {
    public int heightChecker(int[] heights) {
        /*
        의사 코드
        정수 배열인 heights를 오름차순으로 정렬하면서 바뀌는 수를 누산하여 리턴
        */
        int change = 0;
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);

        for(int idx = 0; idx < heights.length; idx++) {
            if(heights[idx] != copy[idx]) change++;
        }

        return change;
    }
}