package heejeong;

public class TargetNumber0406 {
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        int size = numbers.length;

        // number의 가장 마지막 요소가 target과 같으면 인데
        // 재귀함수를 쓰면 index 값을 어떻게 처리해야할 지 고민
        if(size == 1){
            if (numbers[] == target){
                return 1;
            }else{
                return 0;
            }
        }

        // while을 쓴다면 조건을 어떻게 걸어야 할 지
        // - 와 + 두 경우가 계속 반복
        // solution(numbers, target-numbers[i])
        // solution(numbers, target+numbers[i])

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println("solution="+solution(numbers, target));
    }
}
