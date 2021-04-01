/*
sudo code
ICN에서 시작
다수 루트가 존재시 알파벳 순으로 정렬

a -> b
b -> c
a -> c
c -> a
.... -> key value? hashMap

tickets를 순회하여 map에 담음
어짜피 ICN에서 시작하고
ICN -> ABC =>
abc arrayList에 추가
ABC의 키가 존재한다면? ->
abc의 키로 value 가져오기
value arrayList에 추가
value의 키가 존재한다면... recursive

arraylist에서 중복을 제거하고 return?

*/
import java.util.*;



class Solution {

    class Node {
        private String index;
        private int distance;

        public Node(String index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public String getIndex() {
            return this.index;
        }

        public int getDistance() {
            return this.distance;
        }
    }

    public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
    // 노드의 개수(N), 간선의 개수(M), 시작 노드 번호(Start)
    // 노드의 개수는 최대 100,000개라고 가정
    public static int n, m;
    public static String start;
    // 각 노드에 연결되어 있는 노드에 대한 정보를 담는 배열
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    // 방문한 적이 있는지 체크하는 목적의 배열 만들기
    public static boolean[] visited = new boolean[100001];
    // 최단 거리 테이블 만들기
    public static int[] d = new int[100001];

    // 방문하지 않은 노드 중에서, 가장 최단 거리가 짧은 노드의 번호를 반환
    public static int getSmallestNode() {
        int min_value = INF;
        int index = 0; // 가장 최단 거리가 짧은 노드(인덱스)
        for (int i = 1; i <= n; i++) {
            if (d[i] < min_value && !visited[i]) {
                min_value = d[i];
                index = i;
            }
        }
        return index;
    }

    public String[] solution(String[][] tickets) {

        m = tickets.length;
        start = "ICN";

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }

        // 모든 간선 정보를 입력받기
        for (int i = 0; i < m; i++) {
            int a = 0
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b, c));
        }
    }

}