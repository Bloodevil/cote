//Greed Algorithm
//455. Assign Cookies
import java.util.Arrays;

class Cookies {
    public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int output=0;

      for(int i=0;i<g.length;i++){  //1,2,3,4   이미 받은 애도 빼야지
        for(int j=0;j<s.length;j++){    //1,1,3
          if(s[j] >= g[i]){     //이미 준 쿠키는 빼야지  //1,1,3
            output ++;
            i++; j++;
            break;
          }
        }
      }
      return output;
    }
}

/*
Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
Your goal is to maximize the number of your content children and output the maximum number.

i 변수의 아이들은 쿠키에 대한 욕망 g[i]를 가지고 있고, 이 g[i]는 아이가 만족감을 가질 수 있는 최소한의 쿠키 사이즈입니다.
그리고 각각의 쿠키 j는 s[j]라는 사이즈를 가집니다.
만약, s[j] >= g[i] 라면 (즉, 욕망보다 쿠키 사이즈가 크다면) 우리는 쿠키 j를 아이 i에게 줄 수 있 아이는 만족할 것입니다.
나의 목표는 최대한 많은 아이들을 만족시키는 것이고, 그 수를 output으로 출력하는 것입니다.
*/

//g 배열의 요소 length = children 의 수 g 배열의 값 : 쿠키에 대한 욕망
//s 배열의 length = 쿠키 개수 , s배열의 값 : 쿠키의 크기
