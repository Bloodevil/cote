package heejeong;

import java.util.*;

public class Scoville0402 {
    public static int solution(int[] scoville, int K) {
        // 기본 오름차순 정렬
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 1. 음식의 스코빌 지수 큐에 넣기
        for (int spicyLevel : scoville) {
            queue.offer(spicyLevel);
        }

        // 2. K보다 낮은 수 있는지 찾기 (비교할 수는 2개 이상이어야 함)
        while (queue.peek() < K && queue.size() > 1){
            int first = queue.poll();
            int second = queue.poll();

            int mixed = first + (second*2);
            queue.offer(mixed);
            count ++;
        }

        // 제일 낮은 지수가 K값 이상이라면 count 리턴 아니라면 -1
        return queue.peek() >= K ? count : -1;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println("횟수 : "+solution(scoville, K));
    }
}
