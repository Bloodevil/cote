public class cote0407_17676 {
    public int solution(String[] lines) {
        //endTime = startTime + processTime
        
        int answer = 0;
        String[][] parsedLine = new String[lines.length][3];
        String[] times = new String[lines.length];
        
        //parse lines to unixTimestamp
        for(int i=0; i<lines.length; i++){
            parsedLine[i] = lines[i].split(" ");
            times[i] = parsedLine[i][0]+" "+parsedLine[i][1];
        }
        
        //change time String to unix timestamp
        

        
        return answer;
    }
}
