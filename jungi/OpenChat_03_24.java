
/* Change procedural code into functions
       I have a two jobs

       1. Process the record into the desired shape
       get List<String[]> need what? record
       get user and nickname -> need what? record
       get chatSize -> record

       2. get answer to processing record
       geg String[] answer need what? -> record.length, list, map
    */

/* Change procedural code into functions
       I have a two jobs

       1. Process the record into the desired shape
       get List<String[]> need what? record
       get user and nickname -> need what? record
       get chatSize -> record

       2. get answer to processing record
       geg String[] answer need what? -> record.length, list, map
    */
import java.util.*;

class Solution {

    public String[] solution(String[] record) {
        int length = record.length;
        ProcessedChat processedchat = getProcessedChat(record);
        return getAnswer(length, processedchat);
    }

    class ProcessedChat {
        private List<String[]> chatLog;
        private Map<String, String> user;
        private int answerSize;


        public List<String[]> getChatLog() {
            return chatLog;
        }

        public void setChatLog(List<String[]> chatLog) {
            this.chatLog = chatLog;
        }

        public Map<String, String> getUser() {
            return user;
        }

        public void setUser(Map<String, String> user) {
            this.user = user;
        }

        public int getAnswerSize() {
            return answerSize;
        }

        public void setAnswerSize(int answerSize) {
            this.answerSize = answerSize;
        }
        public ProcessedChat(List<String[]> chatLog, Map<String, String> user, int answerSize) {
            this.chatLog = chatLog;
            this.user = user;
            this.answerSize = answerSize;
        }
    }
    /*
    get List<String[]> need what? record
       get user and nickname -> need what? record
       get chatSize -> record
    */
    public ProcessedChat getProcessedChat(String[] record)
    {

        List<String[]> chatLog = new ArrayList<String[]>();
        Map<String, String> user = new HashMap<String, String>();
        int answerSize = 0;

        ProcessedChat processedchat = new ProcessedChat(chatLog, user, answerSize);

        for(int i = 0; i < record.length; i++)
        {
            String[] temp = new String[3];
            temp = record[i].split(" ");
            if(!temp[0].equals("Change")) answerSize++;
            if(temp.length > 2) user.put(temp[1], temp[2]);
            chatLog.add(temp);
        }
        processedchat.setChatLog(chatLog);
        processedchat.setUser(user);
        processedchat.setAnswerSize(answerSize);
        return processedchat;
    }

    public String[] getAnswer(int length, ProcessedChat processedChat) {
        String[] answer = new String[processedChat.getAnswerSize()];
        List<String[]> arr = processedChat.getChatLog();
        Map<String, String> map = processedChat.getUser();

        int idx = 0;
        for (int i = 0; i < length; i++) {
            String temp = "";

            if (arr.get(i)[0].equals("Change")) continue;
            else {
                if (arr.get(i)[0].equals("Enter")) {
                    temp += map.get(arr.get(i)[1]);
                    temp += "님이 들어왔습니다.";
                } else if (arr.get(i)[0].equals("Leave")) {
                    temp += map.get(arr.get(i)[1]);
                    temp += "님이 나갔습니다.";
                }

                answer[idx] = temp;
                idx++;
            }
        }
        return answer;
    }
}