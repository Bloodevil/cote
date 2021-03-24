import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer;

        List<String[]> arr = new ArrayList<String[]>();
        Map<String, String> user = new HashMap<String, String>();
        // map으로 갱신해줘서 마지막 갱신값 쓰기
        int resultCount = 0;    // change를 제외하면 totalResult

        for(int i = 0; i < record.length; i++)
        {
            String[] temp = new String[3];

			/*
			command, uid, nickname
			Enter를 base로
			if change -> 결과 로그 생성 X
			if leave nickname 변동 없음
			*/
            temp = record[i].split(" "); // 분할

            if(!temp[0].equals("Change")) // change는 결과 갯수에 상관 없음
            {
                resultCount++;
            }

            if(temp.length > 2) // leave가 아닐 경우 nickName Put으로 갱신
            {
                user.put(temp[1], temp[2]);
            }

            arr.add(temp);  // temp[0] -> command temp[1] -> uid temp[3] -> nickname
        }

        answer = new String[resultCount];

        for(int i = 0; i < answer.length; i++)
        {
            for(int j = 0; j < arr.get(i).length; j++)
            {
                String temp = "";

                if(!arr.get(i)[0].equals("Change")) // change는 추가 없음
               {
                    if(arr.get(i)[0].equals("Enter")) {
                        temp += user.get(arr.get(i)[1]);
                        temp += "님이 들어왔습니다.";
                    }
                    else if(arr.get(i)[0].equals("Leave"))
                    {
                        temp += user.get(arr.get(i)[1]);
                        temp += "님이 나갔습니다.";
                    }
                }
                answer[i] = temp;
            }
        }
        return answer;
    }
}