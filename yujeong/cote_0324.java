package yujeong;

import java.util.ArrayList;
import java.util.HashMap;

public class cote_0324 {
    public static String[] solution(String[] record) {
        String command, id, name;
        HashMap<String, String> openChat = new HashMap<String, String>(); //아이디와 닉네임을 저장할 hashMap
        ArrayList<String> result=new ArrayList<String>(); //중간 결과를 저장할 list

        for(int i=0; i<record.length; i++){
            String[] split=record[i].split(" ");
            command=split[0];
            
            if(command.equals("Enter")){ //Enter
                id=split[1];
                name=split[2];
                openChat.put(id, name);
                
                result.add(id+"님이 들어왔습니다.");
            }else if(command.equals("Leave")){ //Leave
                id=split[1];

                result.add(id+"님이 나갔습니다.");
            }else if(command.equals("Change")){ //change
                id=split[1];
                name=split[2];

                openChat.put(id, name);
            }
        }

        String[] answer=new String[result.size()];

        for(int j=0; j<result.size(); j++){
            String[] split2=result.get(j).split("님"); //임시로 저장된 문자열을 공백 단위로 잘라 아이디를 구한다
            String newMsg=(result.get(j).replace(split2[0], openChat.get(split2[0])));
            System.out.println(newMsg);
            answer[j]=newMsg;
        }//for2

        return answer;
    }

    public static void main(String[] args) {
        String[]record=new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println("결과"+solution(record));
    }
    
}