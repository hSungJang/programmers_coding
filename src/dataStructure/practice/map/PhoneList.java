package dataStructure.practice.map;

import java.util.Arrays;
import java.util.HashMap;

public class PhoneList {

//    public static void main(String[] args) {
//        String [] photo_book = {"119", "97674223", "1195524421"};
//        System.out.println(solution(photo_book));
//    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0 ; i<phone_book.length ; i++) {
            map.put(phone_book[i], phone_book[i]);
        }

        for (int i = 0 ; i<phone_book.length ; i++) {
            for (int j = 0 ; j<phone_book[i].length() ; j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) return false;
            }
        }
        return answer;
    }
}
