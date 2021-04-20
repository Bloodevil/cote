package heejeong;

import java.util.*;

//답안 보고 공부
public class TravelRoute0331 {
    static List<String> list = new ArrayList<>();
    static String route = "";
    static boolean [] visit;

    public static void dfsRoute(String[][] tickets, String end, int cnt){
        route += end + ",";

        if(cnt == tickets.length){
            list.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            String s = tickets[i][0];
            String e = tickets[i][0];
            if(s.equals(end) && !visit[i]){
                visit[i] = true;
                dfsRoute(tickets, e, cnt+1);
                visit[i] = false;
                route = route.substring(0, route.length()-4);
            }
        }
    }


    public static String[] solution(String[][] tickets) {
        int n = tickets.length;

        for (int i = 0; i < n; i++) {
            visit = new boolean[n];
            String start = tickets[i][0];
            String end = tickets[i][1];

            if(start.equals("ICN")){
                route = start + ",";
                visit[i] = true;
                dfsRoute(tickets, end, 1);
            }
            start = tickets[i][0];
            end = tickets[i][1];
        }

        Collections.sort(list);
        String [] answer = list.get(0).split(",");

        return answer;
    }

}