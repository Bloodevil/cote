package heejeong;

//Make The String Great
class GreatString {
    //테스트용 메인
    public static void main(String[] args) {
      System.out.println(makeGood("heElLO"));
    }

    public static String makeGood(String s) {
      StringBuffer good = new StringBuffer(s);
      if(good.length()<=1){ // 비교할 문자가 없을경우 return
        return s;
      }else{
        int count=1;  //0이 아닌 숫자로 선언
        while(count!=0){  //인접문자 변경사항이 없을 때까지 진행
          count=0; //인접문자가 없다고 가정
          for(int i=0;i<good.length()-1;i++){
            //char에서 대/소문자 차이는 32 (순서바뀔 수 있으니 절대값 사용)
            if(Math.abs(good.charAt(i)-good.charAt(i+1))==32){
              good.replace(i, i+2, ""); //replce 사용위해 StringBuffer로 변환했었음 \
              count++; //인접문자가 있음 추가처리 위해 count 증가
            }
          }
        }
      }
      return good.toString(); //StringBuffer String 변환
    }
}
