class Solution {
    public int[] sortArray(int[] nums) {
        /*
        1. divide array elements in nums
        2. merge elements 1+2, 3+4, ... else
        3. merge elements (1+2)+(3+4), (5+6)+(7+8) ...
        4. return array
        */
        if (nums.length <= 1) {
            return nums;
        }

        // divide nums
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            array.add(new int[] {nums[i]});
        }

        // merge elements when? -> array.size > 1
        while(array.size > 1) {
            /*
            how?
            {5} {2} {3} {1} ->
            {2, 5}, {1, 3} ->
            {1,2,3,5} -> array.size > 1 false
            return
            new arraylist
            add new int [] {small, big}
            add new int [] {small, big}
            음 이건 아닌듯
            기존 bottom up에서 참조하자
            */
            merge(nums,0,nums.length-1);
        }

    }
    public

    public int [] merge(int[] nums, int start, int end) {
        int [] tmp = new int[];
        int left_cursor = 0, right_cursor = 0, ret_cursor = 0;

        while (left_cursor < left_list.length &&
                right_cursor < right_list.length) {
            if (left_list[left_cursor] < right_list[right_cursor]) {
                ret[ret_cursor++] = left_list[left_cursor++];
            } else {
                ret[ret_cursor++] = right_list[right_cursor++];
            }
        }
        // append what is remain the above lists
        while (left_cursor < left_list.length) {
            ret[ret_cursor++] = left_list[left_cursor++];
        }
        while (right_cursor < right_list.length) {
            ret[ret_cursor++] = right_list[right_cursor++];
        }
        return ret;
    }
}