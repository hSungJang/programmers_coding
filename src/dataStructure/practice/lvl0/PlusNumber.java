package dataStructure.practice.lvl0;

public class PlusNumber {


    public static void main(String[] args) {
        int n = 930211;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        while (true) {
            int num = n % 10; // 4
            n = n / 10; // 123
            answer += num;
            if (n == 0) break;
        }
        return answer;
    }
}
