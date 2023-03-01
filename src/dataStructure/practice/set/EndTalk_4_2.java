package dataStructure.practice.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class EndTalk_4_2 {

//    public static void main(String[] args) {
//        //입력되는 단어가 순서대로 배치될 때 끝말잇기로 끝까지 이어지는지 확인하세요.
//        // 끝말잇기는 사용했던 단어가 다시 사용되면 안됩니다.
//        // 단어의 첫 글자는 앞 단어의 마지막 글자로 시작되어야 합니다.
//
//        String [] case1 = {"tank", "kick", "know", "wheel", "land", "dream"};
//        String [] case2 = {"tank", "kick", "snow", "wheel", "land", "dream", "mother", "robot", "tank"};
//        System.out.println(solution(case2));
//    }

    public static boolean solution(String[] words) {
        boolean answer = true;
        // 1. data 입력
        Set<String> endTalk = new LinkedHashSet<>();

        int arraySize = words.length;
        char last = words[0].toCharArray()[words[0].length()-1];
        for (int i = 0 ; i < arraySize ; i++) {
            endTalk.add(words[i]);
            char first = words[i].toCharArray()[0];
            // 2-1. 데이터 검증 - 첫 번째 단어를 제외하고 다음 단어의 첫 글자가 앞 단어의 마지막 글자와 일치 하는지 확인 필요
            if (i != 0 && last != first) return false;
            last = words[i].toCharArray()[words[i].length()-1];
        }
        // 2-1. 데이터 검증 - 중복 단어 체크
        if (endTalk.size() != arraySize) return false;

        return answer;
    }
}
