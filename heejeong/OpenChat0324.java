package heejeong;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OpenChat0324 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution(record);
    }

    public static String[] solution(String[] record) {
        // answer 배열 개수는 enter + leave 개수
        int count = 0;
        String[] answer = new String[record.length];

        Map<String,String> map = new HashMap<>();

        // 각 record 문자열을 공백으로 split
        for (String chat : record) {
            String[] split = chat.split(" ");

            //보기 쉽게 변수로 선언
            String command = split[0];
            String uid = split[1];
            String nickName = "";
            if (split.length > 2) {
                nickName = split[2];
            }

            if (command.equals("Enter")) {
                answer[count] = uid + "님이 들어왔습니다.";
                count++;
            }else if(command.equals("Leave")) {
                answer[count] = uid + "님이 나갔습니다.";
                count++;
            }

            if(nickName!=null && !nickName.isEmpty()){
                map.put(uid,nickName);
            }

        } //for

        //배열에 null값 없애기
        answer = Arrays.copyOf(answer, count);
        
        //새로운 배열에 저장
        String [] result = new String[count];
        for(int i=0;i<count;i++){
            String chat = answer[i];
            int idx = chat.indexOf("님");
            String id = chat.substring(0,idx);
            String changed = chat.replace(id, map.get(id));
            result[i] = changed;
        }

        return result;
    }
}

//채팅방에서 변경된 닉네임 적용하기
//변경방법
// 1. 채팅방을 나간 후, 새로운 닉네임으로 다시 들어간다.
// 2. 채팅방에서 닉네임을 변경한다.
//적용 : 기존 채팅방의 닉네임도 모두 변경된 닉네임으로 적용
// 중복 닉네임 허용 -> 정확한 유저만 변경해야 하기 때문에 기존 닉네임이 기준이 될 수는 없음
// 구분 기준 : [유저 아이디]
// 닉네임 변경 기록 : String[] record
// 채팅방에 들어오고 나가거나, 닉네임을 변경한 기록이 담긴 문자열 배열 record가 매개변수로 주어질 때,
// 모든 기록이 처리된 후, 최종적으로 방을 개설한 사람이 보게 되는 메시지를
// 문자열 배열 형태로 return 하도록 solution 함수를 완성하라.

// String[] record
// 입장 - "Enter [유저 아이디] [닉네임]" (ex. "Enter uid1234 Muzi")
// 퇴장 - "Leave [유저 아이디]" (ex. "Leave uid1234")
// 닉변 - "Change [유저 아이디] [닉네임]" (ex. "Change uid1234 Muzi")
/*
    첫 단어는 Enter, Leave, Change 중 하나이다.
    각 단어는 공백으로 구분되어 있으며, 알파벳 대문자, 소문자, 숫자로만 이루어져있다.
    유저 아이디와 닉네임은 알파벳 대문자, 소문자를 구별한다.
    유저 아이디와 닉네임의 길이는 1 이상 10 이하이다.
*/