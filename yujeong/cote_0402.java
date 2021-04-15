package yujeong;

import java.util.PriorityQueue;

public class cote_0402 {

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //우선순위가 낮은 숫자 순

        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }

        while(pq.size()>1 && pq.peek()<K){
            pq.add(pq.remove()+pq.remove()*2);
            answer++;
        }
        
        return pq.peek()>=K ? answer:-1;
    }

    public static void main(String[] args) {
        int[]scoville=new int[]{1, 2, 3, 9, 10, 12};
        solution(scoville, 7);
    }
}
