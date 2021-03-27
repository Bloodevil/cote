package yujeong;

import java.util.ArrayList;
import java.util.HashMap;

public class cote_0324 {
    public String[] solution(String[] record) {
        HashMap<String, String> openChat = new HashMap<String, String>(); //아이디와 닉네임을 저장할 hashMap
        ArrayList<String> result = new ArrayList<String>(); //중간 결과를 저장할 list

        for(int i=0; i<record.length; i++){
            String[] split=record[i].split(" ");
            
            if(split[0].equals("Enter")){
                openChat.put(split[1], split[2]);
                result.add(split[1]+"님이 들어왔습니다.");
            }else if(split[0].equals("Leave")){
                result.add(split[1]+"님이 나갔습니다.");
            }else if(split[0].equals("Change")){
                openChat.put(split[1], split[2]);
            }
        }//for1

        String[] answer=new String[result.size()]; //list의 size로 초기화

        for(int j=0; j<result.size(); j++){
            String[] split2=result.get(j).split("님"); //임시로 저장된 문자열을 공백 단위로 잘라 아이디를 구한다
            answer[j]=(result.get(j).replace(split2[0], openChat.get(split2[0]))); //id를 name으로 replace해 answer에 넣는다
        }//for2

        return answer;
    }
}