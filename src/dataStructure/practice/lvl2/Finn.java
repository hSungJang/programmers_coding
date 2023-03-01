package dataStructure.practice.lvl2;

public class Finn {

//    public static void main(String[] args) {
//
//        int n = 15;
//        System.out.println(solution(n));
//    }

    public static int solution(int n) {
        int answer = 1;
        int startNumber = 1;
        while (startNumber <= n) {
            if (continueNumber(startNumber + 1, startNumber, n)) {
                answer++;
            };
            startNumber ++;
        }
        return answer;
    }

    public static boolean continueNumber(int val, int sum, int result) {
        sum += val;
        if ( sum == result ) {
            return true;
        }

        if ( sum > result) return false;

        return continueNumber(val + 1, sum, result);
    }

}
