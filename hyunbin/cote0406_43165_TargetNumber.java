import java.util.LinkedList;
import java.util.Queue;

public class cote0406_43165_TargetNumber {
    
    ////////////////////// DFS Solution by Java
    public int solution(int[] numbers, int target) {
        int current = numbers[0];
        int answer=0;

        answer += dfs(current, 1, numbers, target);
        answer += dfs(-current, 1, numbers, target);
        return answer;
    }

    public int dfs(int prev, int index, int[] numbers, int target){
        if(index >= numbers.length){
            if(target == prev){
                return 1;
            }
            return 0;
        }

        int cur1 = prev + numbers[index];
        int cur2 = prev - numbers[index];

        int ans=0;

        ans += dfs(cur1, index+1, numbers, target);
        ans += dfs(cur2, index+1, numbers, target);

        return ans;
    }

    //////////////////BFS Solution by Java
    class Pair{
        int cur;
        int index;

        Pair(int cur, int index){
            this.cur = cur;
            this.index = index;
        }
    }

    public int solution2(int[] numbers, int target){
        int answer=0;

        Queue<Pair> queue = new LinkedList<Pair>();
        queue.offer(new Pair(numbers[0], 0));
        queue.offer(new Pair(-numbers[0], 0));

        while(!queue.isEmpty()){
            Pair p = queue.poll();
            if(p.index == numbers.length-1){
                if(p.cur == target){
                    answer += 1;
                }
                continue;
            }
            int c1 = p.cur + numbers[p.index+1];
            int c2 = p.cur - numbers[p.index+1];

            queue.add(new Pair(c1, p.index+1));
            queue.add(new Pair(c2, p.index+1));
        }

        return answer;
    }
}
