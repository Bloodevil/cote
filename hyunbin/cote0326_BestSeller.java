import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class cote0326_BestSeller {

    static Scanner sc = new Scanner(System.in);

    public static Map<String, Integer> saveSoldBook(List<String> bookList) {
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < bookList.size(); i++) {
            String bookName=bookList.get(i);
            if(map.containsKey(bookName)){
                int k = map.get(bookName);
                //System.out.println("k="+k);
                map.put(bookName, ++k);
            }else{
                map.put(bookName, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {

        //Do Not ask in your code when you are with BaekJoon ^^
        //System.out.println("enter bookList: ");
        int count = Integer.parseInt(sc.nextLine());
        Map<String, Integer> bookData = new TreeMap<>();

        //make bookList
        List<String> bookList = new ArrayList<>();
        for(int i=0; i<count; i++){
            String bookName=sc.nextLine();
            bookList.add(bookName);
        }
        
        //check how many books
        bookData = saveSoldBook(bookList);
        //System.out.println(bookData);
        Comparator<Entry<String, Integer>> comp = Entry.comparingByValue();
        Entry<String, Integer> entry = Collections.max(bookData.entrySet(), comp);

        System.out.print(entry.getKey());
    }
}