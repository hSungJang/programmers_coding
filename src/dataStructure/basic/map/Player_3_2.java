package dataStructure.basic.map;

import java.util.HashMap;

public class Player_3_2 {

//    public static void main(String[] args) {
//        /**
//         * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//         * completion의 길이는 participant의 길이보다 1 작습니다.
//         * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//         * 참가자 중에는 동명이인이 있을 수 있습니다.
//         */
//        String [] par = {"mislav", "stanko", "mislav", "ana"};
//        String [] com = {"stanko", "mislav", "ana"};
//        System.out.println(solution(par, com));
//
//    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String , Integer> map = new HashMap<>();

        for (String key : participant) {
            map.put(key, map.getOrDefault(key,0) + 1);
        }

        for (String key : completion) {
            int value = map.get(key) - 1;
            if (value == 0)  map.remove(key);
            else map.put(key, value);
        }

        for (String key : map.keySet()) {
            answer = key;
        }

        return answer;
    }
}
