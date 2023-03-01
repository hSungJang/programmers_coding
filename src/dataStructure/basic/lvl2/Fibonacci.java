package dataStructure.basic.lvl2;

public class Fibonacci {
//    public static void main(String[] args) {
//        int n = 10000;
//        System.out.println(solution(n));
//    }

    public static int solution(int n) {
        int answer = 0;
        int arr[] = new int[100001];
        arr[0] = 0;
        arr[1] = 1;
        int index = 2;
        while (n >= index) {
            arr[index] = (arr[index-1] + arr[index-2]) % 1234567;
            index++;
        }
        answer = arr[n];
        return answer;
    }

}
