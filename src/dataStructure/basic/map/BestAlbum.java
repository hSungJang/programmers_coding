package dataStructure.basic.map;

import java.util.Arrays;
import java.util.HashMap;

public class BestAlbum {

//    public static void main(String[] args) {
//        String [] genres = {"classic", "pop", "classic", "classic", "pop"};
//        int [] plays = {500, 600, 150, 800, 2500};
//        System.out.println(solution(genres, plays));
//    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0 ; i<genres.length ; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        return answer;
    }
}
