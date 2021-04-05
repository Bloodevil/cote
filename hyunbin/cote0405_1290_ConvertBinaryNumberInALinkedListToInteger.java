public class cote0405_1290_ConvertBinaryNumberInALinkedListToInteger {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public int getDecimalValue(ListNode head) {
        // make a String with the linked list
        String binaryStr = head.val+"";

        while(head.next != null){
            head = head.next;
            binaryStr = binaryStr + head.val;
        }

        //System.out.println(binaryStr);

        int len = binaryStr.length();
        char[] strChar = binaryStr.toCharArray();
        int answer=0;
        for(int i=0; i<len; i++){
            //if 1, add it as pow
            if(strChar[i] == '1'){
                answer += Math.pow(2, len-i);
            }    
        }
        return answer;
    }
}