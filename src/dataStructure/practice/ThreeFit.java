package dataStructure.practice;

public class ThreeFit {

    public static void main(String[] args) {
        int [] numbers = {-3, -2, -1, 0, 1, 2, 3};
        solution(numbers);
    }

    public static int solution(int[] number) {
        int answer = 0;

        int sum = 0;
        for (int i=0 ; i<number.length-2 ; i++) {
            sum += number[i];
            for (int j = i+1 ; j<number.length-1; j++) {
                sum += number[j];
                for (int k = j+1 ; k<number.length; k++) {
                    sum += number[k];
                    if (sum == 0) answer ++;
                    sum -= number[k];
                }
                sum -= number[j];
            }
            sum = 0;
        }

        System.out.println(answer);
        return answer;
    }


}
