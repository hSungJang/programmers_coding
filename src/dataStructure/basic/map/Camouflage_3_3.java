package dataStructure.basic.map;

import java.util.HashMap;

public class Camouflage_3_3 {
//
//    public static void main(String[] args) {
//        /**
//         * clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
//         * 스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
//         * 같은 이름을 가진 의상은 존재하지 않습니다.
//         * clothes의 모든 원소는 문자열로 이루어져 있습니다.
//         * 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
//         * 스파이는 하루에 최소 한 개의 의상은 입습니다.
//         * [["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]
//         */
//        String [][] clothes = {
//                {"yellowhat", "headgear"},
//                {"bluesunglasses", "eyewear"},
//                {"green_turban", "headgear"}
//        } ;
//
////        String [][] clothes = {
////                {"crowmask", "face"},
////                {"bluesunglasses", "face"},
////                {"smoky_makeup", "face"}
////        } ;
//
//        System.out.println(solution(clothes));
//    }

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0 ; i < clothes.length ; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0) + 1);
        }

        int answer = 1;
        for (String key : map.keySet()) {
            answer = answer * (map.get(key) + 1);
        }

        return answer - 1;
    }
}
