package heejeong;

public class SortArray0414 {
    // 1. 버블 정렬 Bubble Sort : i번째 와 i+1번째 요소를 비교하여 배열 순차탐색
    // 큰 것을 가장 뒤로 밀어내는 개념 (버블처럼 큰 수를 위로 보냄)
    // 시간복잡도 O(n^2)
    // Time Limit Exceeded
    public int[] bubbleSortArray(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size ; j++) {
                if (nums[i] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    // 2. 삽입 정렬 Insertion Sort : 배열의 두번 째 데이터를 기준 오른쪽으로 이동하며 순차 탐색
    // 기준보다 큰 수는 오른쪽으로 밀어내고, 왼쪽 요소와 계속 비교 (기준의 왼쪽은 정렬되어 있음)
    // 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함.
    // 시간복잡도 O(n^2)
    public int[] insertionSortArray(int[] nums) {
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            int standard = nums[i]; // 기준
            int index = i - 1;  // 비교

            // 비교대상이 기준보다 크다면
            while (index >= 0 && standard < nums[index]){
                nums[index + 1] = nums[index];  //오른쪽으로 밀어냄
                index--;
            }
            nums[index + 1] = standard; // 기준
        }
        return nums;
    }

    // 3. 선택 정렬 Selection Sort : 주어진 데이터 중 최소값을 찾음
    // 최소값을 맨 앞에 위치한 값과 교환
    // 정렬된 데이터를 제외한 나머지 데이터를 같은 방법으로 정렬
    // 시간복잡도 O(n^2)
    public int[] selectionSortArray(int[] nums) {
        int size = nums.length;
        int min;
        int temp;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
