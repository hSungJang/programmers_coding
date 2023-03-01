package dataStructure.practice.map;

import java.util.HashMap;

public class Pokemon_3_1 {


    /*
        1. 총 N 마리의 폰켓몬 중에서 N/2마리를 가져
        2. 같은 종류 포켓몬 같은 번호
     */

//    public static void main(String[] args) {
//        int map [] = {3,3,3,2,2,2};
//        System.out.println(solution(map));
//    }

    public static int solution(int[] nums) {
        int have = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<nums.length ; i++) {
            map.put(nums[i], 1);
        }
        return map.size() > have ? have : map.size();
    }
}
