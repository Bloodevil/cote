import java.util.HashMap;
import java.util.Map;

public class cote0324_chatroom {
    /*
        ~ 의식의 흐름 ~
        유저아이디에 따라서 마지막 닉네임을 해당 닉네임으로 저장
        Enter, Leave는 각각 들어왔습니다, 나갔습니다.
        Change는 로그만 남고 리턴값에 포함되지 않음. 

        record를 쪼개서 새 배열을 만들자. 행위/아이디/닉네임

        ~~~~~

        배열을 만들고서는?
        아이디에 대한 닉네임을 해시맵으로 저장해볼까?

        그리고 다시 for문 돌려서 리턴 스트링을 만들어 넣기
        
    */
    public String[] solution(String[] record) {
        
        int recordSize=record.length;
        String[] doing=new String[recordSize];
        String[] userid=new String[recordSize];
        String[] nickname=new String[recordSize];
        Map<String, String> userMap=new HashMap<>();
        int ansCnt=0;

        //일단 레코드를 쪼개서 저장해준다. 해시맵에는 아이디(key)별 닉네임(value)를 저장해준다.
        for(int i=0; i<recordSize; i++){
            doing[i]=record[i].substring(0, record[i].indexOf(" "));

            if(doing[i].equals("Leave")){ //leave
                userid[i]=record[i].substring(record[i].indexOf(" ")+1);
                nickname[i]="none";
            }else{
                userid[i]=record[i].substring(record[i].indexOf(" ")+1, record[i].lastIndexOf(" "));
                nickname[i]=record[i].substring(record[i].lastIndexOf(" ")+1);
                userMap.put(userid[i], nickname[i]);
            }

          //  System.out.println("doing[i]="+doing[i]);
          //  System.out.println("userid[i]="+userid[i]);
          //  System.out.println("nickname[i]="+nickname[i]);

            userMap.put(userid[i], nickname[i]);
            //ansCnt개수만큼 리턴 스트링배열을 만들어야 하니까 따로 세준다
            if(!doing[i].equals("Change")){
                ansCnt++;
            }
        }

       // System.out.println(userMap);

        String[] answer = new String[ansCnt];
        int ansidx=0; //i랑은 별도로 지정해줘야 한다. Change면 늘어나지 앙ㄶ아야 하기 때문

        for(int i=0; i<recordSize; i++){
            String sentence="";
            //Change면 continue, 아니면 작업 시작
            if(doing[i].equals("Change")){
                continue;
            }else if(doing[i].equals("Enter")){
                sentence=userMap.get(userid[i])+"님이 들어왔습니다.";
            }else if(doing[i].equals("Leave")){
                sentence=userMap.get(userid[i])+"님이 나갔습니다.";
            }
            answer[ansidx]=sentence;
            ansidx++;
        }
        return answer;
    }
}
