package yujeong;

public class cote_0323 {
    /*
        갈색, 노란색 격자 수가 주어졌을 때 카펫의 크기를 리턴한다
        카펫의 가로 길이는 세로 길이와 같거나 세로 길이보다 길다
    */
    
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int all=brown+yellow; //가로*세로
        int length=(brown+4)/2; //가로+세로
        int h; //높이

        for(int w=1; w<=all; w++){
            h=length-w; //세로는 length-가로
            if(all%w==0 && w>=h && w*h==all){ //w가 넓이의 약수이며, 가로가 세로보다 크거나 같고, 가로*세로가 넓이와 일치할 경우 배열에 넣는다
                answer[0]=w;
                answer[1]=h;
            }
        }//for
        return answer;
    }
}
