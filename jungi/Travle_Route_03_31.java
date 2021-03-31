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

    public String[] solution(String[][] tickets)
    {
        String start = "ICN";
        int length = tickets.length;
        Map<String, String> route = new HashMap<>();
        ArrayList<String> arrivedList = new ArrayList<>();
        /*
        tickets[0][0] = "ICN";
        tickets[0][1] = "JFK";
        tickets[1][0] = "HND";
        tickets[1][1] = "IAD";
        tickets[2][0] = "JFK";
        tickets[2][1] = "HND";
        tickets[3][0] = "a";
        tickets[3][1] = "d";
        */

        for(int i = 0; i < length; i++)
        {
            route.put(tickets[i][0],tickets[i][1]);
        }

        arrivedList.add(route.get("ICN"));
        String arrived = route.get("ICN");


        arrivedList = findArrived(arrivedList, route, arrived);


        ArrayList<String> answer = new ArrayList<String>();
        for (int i = 0; i < arrivedList.size(); i++) {

            if (!answer.contains(arrivedList.get(i))) {
                if(!arrivedList.get(i).equals("ICN")) answer.add(arrivedList.get(i));
            }
        }
        Collections.sort(answer);
        answer.add(0, "ICN");
        return answer.toArray(new String[answer.size()]);
    }

    public ArrayList<String> findArrived(ArrayList<String> answer, Map<String, String> map, String arrived)
    {
        answer.add(arrived);
        if(map.containsKey(map.get(arrived)))
        {
            arrived = map.get(arrived);
            findArrived(answer, map, arrived);
        }
        else return answer;
        return answer;
    }
}

/*
DFS는 Depth-First Search. 깊이 우선 탐색이라고도 부르며,
그래프에서 깊은 부분을 우선적으로 탐색하는 알고리즘이다.
DFS를 설명하기 전에 먼저 그래프의 기본 구조를 알아야 한다.
그래프는 **노드(Node)** 와 **간선(Edge)** 으로 표현되며
이때 노드를 **정점(Vertex)** 이라고도 말한다.
그래프 탐색이란 하나의 노드를 시작으로 다수의 노드를 방문하는 것을 말한다.
또한 두 노드가 간선으로 연결되어 있다면 '두 노드는 인접하다(Adjacent)' 라고 표현한다.

* 인접 행렬(Adjacency Matrix) : 2차원 배열로 그래프의 연결 관게를 표현하는 방식
* 인접 리스트(Adjacency List) : 리스트로 그래프의 연결 관계를 표현하는 방식

먼저 **인접 행렬(Adjacency Matrix)방식** 은 2차원 배열에 각 노드가 연결된 형태를 기록하는 방식이다.
연결되어 있지 않은 노드끼리는 무한(Infinity)의 비용이라고 작성한다.
실제 코드에서는 infinity를 999999999, 987654321 등의 값으로 정의

**인접 리스트(Adjacency List) 방식**
<br>인접 리스트에서는 '연결 리스트'라는 자료구조를 이용해 구현하는데,
C++나 자바와 같은 프로그래밍 언어에서는 별도로 연결 리스트 기능을 위한 표준 라이브러리를 제공한다.
반면 Python은 기본 자료형인 리스트 자료형이 append()와 메소드를 제공
파이썬에서는 인접 리스트를 이용해 그래프를 표현하고자 할 때에도 단순히 2차원 리스트를 이용하면 됨

**BFS(Breadth First Search)** 알고리즘은 '너비 우선 탐색'이라는 의미를 가진다.
쉽게 말해 가까운 노드 부터 탐색하는 알고리즘이다. DFS가 최대한 멀리 있는 노드를 우선으로 탐색하는 방식으로 동작한다면
BFS는 그 반대다. BFS는 선입선출 방식인 큐 자료구조를 이용하는 것이 정석이다.

#### 알고리즘의 동작 방식
* 탐색 시작 노드를 큐에 삽입하고 방문 처리를 한다.
* 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리를 한다.
* 위 과정을 더 이상 수행할 수 없을 때까지 반복한다.

너비 우선 탐색 알고리즘은 BFS는 큐 자료구조에 기초한다는 점에서 구현이 간단하다.
실제로 구현함에 있어 앞서 언급한 대로 deque 라이브러리를 사용하는 것이 좋으며
탐색을 수행함에 있어 O(N)의 시간이 소요된다.
일반적인 경우 실제 수행 시간은 DFS보다 좋은 편이라는 점까지만 추가로 기억하자.

### DFS / BFS 정리
#### 동작원리
* DFS - 스택
* BFS - 큐

#### 구현 방법
* DFS - 재귀 함수 이용
* BFS - 큐 자료구조 이용
*/