import java.util.ArrayList;
import java.util.List;

class cote0323_carpet{
    /*
        ~ 의식의 흐름 ~
        브라운+옐로의 합은 가로세로의 곱과 같다 
        가로는 세로보다 길거나 같다
        brown+yellow의 약수 중 골라야 하지 않을까?

        24+24의 경우
        1, 2, 3, 4, 6, 8, 12, 16, 24, 48
        48*1
        24*2
        16*3
        12*4
        8*6
        이 다섯개중 하나가 답이다. 

        또 다른 접근방법 //인줄 알았는데 같이 써야 했다
        브라운=가로*2+(세로-2)*2
              =가로*2+세로*2-4
        옐로=(가로-2)*(세로-2)
        이 수식에 넣었을 때 성립하는 배열이 정답이다.
    */
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        //그럼 먼저 약수 배열을 만들어서 짝을 지어줘야겠네(가로, 세로일 것으로 예상되는 짝지은 약수들)
        List<Integer> pair = new ArrayList<>();
        int square = brown+yellow;
        for(int i=1; i<=square; i++){
            if(square%i==0){ //나누어 떨어지는 수면 pair에 추가해준다
                pair.add(i);
            }
        }

        //그 다음에 포문에 넣어서 하나씩 돌려보면서 수식에 대입해보는거야
        int start=0;
        int end=pair.size()-1;

        for(int i=0; i<=pair.size()/2; i++){ //홀수일 때는 가운데숫자를 두번 넣어줘야 하니까 i를 pair.size()/2와 같거나 작게
            int w=pair.get(end);
            int h=pair.get(start);

            if(brown == (w*2 + h*2 - 4) && yellow == (w-2)*(h-2) ){
                answer[0]=w;
                answer[1]=h;
                return answer;
            }
            start++;
            end--;
        }
        return answer;
    }
}