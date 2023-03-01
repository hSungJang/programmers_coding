package dataStructure.basic.lvl1;

public class Cola {
    public static void main(String[] args) {

        System.out.println(solution(2,1, 20));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int cola = (n/a) * b;
            n = cola + n%a;
            answer += cola;
        }
        return answer;
    }
}
