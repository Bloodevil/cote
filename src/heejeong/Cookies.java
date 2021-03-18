package heejeong;//Greed Algorithm
//455. Assign heejeong.Cookies
import java.util.Arrays;

class Cookies {
  public static void main(String[] args) {
    int[] g = {1,2};
    int[] s = {1,2,3};
    System.out.println(findContentChildren(g,s));
  }
  public static int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);

    int child = 0;
    int cookie = 0;

    while(child<g.length && cookie<s.length){
      if(s[cookie] >= g[child]){
        child++;
        cookie++;
      }else{
        cookie++;
      }
    }
    return child;
  }
}
