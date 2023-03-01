package dataStructure.basic;

import java.util.ArrayList;

public class ConvertNumber {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        // 10진법 -> 3진법
        while(n != 0) {
            list.add(n%3);
            n /= 3;
        }
        // 3진법 -> 10진법
        int tmp = 1;
        for(int i=list.size()-1;i>=0;i--) {
            answer += list.get(i)*tmp;
            tmp *= 3;
        }
        return answer;
    }
}
