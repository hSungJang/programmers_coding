package dataStructure.basic.search;

import java.util.Arrays;

public class TelList_6_1 {

//    public static void main(String[] args) {
//
//        String[] case1 = {"119", "97674223", "1195524421"};
//        String[] case2 = {"123", "456", "789"};
//        String[] case3 = {"12", "123", "1235", "567", "88"};
//        System.out.println(solution(case2));
//    }
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i=1 ; i<phone_book.length ; i++) {
            if(phone_book[i].startsWith(phone_book[i-1])) return false;
        }
        return answer;
    }
}


