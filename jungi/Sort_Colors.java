class Solution {
    public void sortColors(int[] nums) {
        int temp;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length -i -1; j++)
            {
                if(nums[j+1] < nums[j])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
        public void sortColors_countingSort(int[] nums) {
            final int MAX_VALUE = 2;
            int temp;
            int idx = 0;
            int[] cnt = new int[MAX_VALUE + 1];

            for (int i = 0; i < nums.length; i++) {
                cnt[nums[i]] += 1; // 각 데이터에 해당하는 인덱스의 값 증가
            }
            for (int i = 0; i <= MAX_VALUE; i++) { // 배열에 기록된 정렬 정보 확인
                for (int j = 0; j < cnt[i]; j++) {
                    nums[idx++] = i;
                }
            }
        }

    public void sortColors_quickSort(int[] nums) {

        Solution solution = new Solution();
        solution.quickSort(nums, 0, nums.length - 1);
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // 원소가 1개인 경우 종료
        int pivot = start; // 피벗은 첫 번째 원소
        int left = start + 1;
        int right = end;
        while (left <= right) {
            // 피벗보다 큰 데이터를 찾을 때까지 반복
            while (left <= end && arr[left] <= arr[pivot]) left++;
            // 피벗보다 작은 데이터를 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot]) right--;
            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }
}