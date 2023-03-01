package dataStructure.basic.arrayList;

public class Permutaion_2_2 {

//    public static void main(String[] args) {
//        int [] arr = {4, 1, 3, 2};
//        System.out.println(solution(arr));
//    }

    // list 방식으로 처리
    public static boolean solution(int[] arr) {
        /**
         * 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
         * 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
         * 배열의 원소는 0 이상 10만 이하인 정수입니다.
         */
        boolean answer = true;
        boolean [] target = new boolean[arr.length];
        // case1. 최댓값 > size : false
        // case2. 중복 발생 시: false , boolean array 필요
        // case3. 검증, 전체 통과 후 전체 탐색

        int totalSize = arr.length; // 전체 크기

        for (int i = 0 ; i < totalSize ; i++) {
            // case 1
            if(arr[i] > totalSize) return false;
            // case 2
            if(target[arr[i]-1]) return false;

            // 다른 경우는 패스
            target[arr[i]-1] = true;
        }

        // case 3
        for (int i = 0 ; i < target.length ; i++) {
            if (!target[i]) return false;
        }

        return answer;
    }
}
