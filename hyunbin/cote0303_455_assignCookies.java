/*
Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
Your goal is to maximize the number of your content children and output the maximum number.
*/

class Solution {
	public int findContentChildren(int[] g, int[] s) {
          Arrays.sort(s);
          Arrays.sort(g);
          //배열을 오름차순으로 정렬해준다. Arrays.sort() 함수를 사용하면 배열 타입에 따라 오름차순 정렬이 가능하다. 
          
          int index=0; //인덱스 생성 
          int counter=0; //갯수 체커 생성
          
          for(int i=0; i<s.length; i++) { //쿠키 배열을 돌린다
        	  if(index > g.length-1) { //인덱스가 g의 크기보다 크면 더 이상 비교할게 없으므로
        		  return counter; //카운터를 리턴
        	  }
        	  if(g[index] - s[i] <= 0) { //g의 인덱스번째가 s의 i번째보다 크거나 같으면 
        		  counter++; //카운터도 올려주고
        		  index++; //인덱스도 올려준다. 다음것 탐색. 
        	  }
          }
          return counter;
    }
}