package dataStructure.basic.sort;

import java.util.Arrays;

public class Min_Numeric_remove_7_1 {

    public static void main(String[] args) {
        int arr [] = {4,3,2,1};
    }


    public static int[] solution(int[] arr) {

        // 인덱스가 다르면 같은 수가 될 수 없다.
        // 최소 숫자 제외 출력
        if (arr.length == 1) {
            return new int []{-1};
        }

        int [] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return Arrays.stream(arr).filter(e -> e > copy[0]).toArray();
    }
}
