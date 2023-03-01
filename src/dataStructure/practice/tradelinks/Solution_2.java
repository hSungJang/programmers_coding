package dataStructure.practice.tradelinks;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : dataStructure.basic.tradelinks
 * fileName       : Solution_2
 * author         : janghyoseong
 * date           : 2023/02/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/17        janghyoseong       최초 생성
 */


class Directory {
    int x;
    int y;
    int length;
    Directory(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }
}
public class Solution_2 {

    public static void main(String[] args) {
        Solution_2 s = new Solution_2();
        System.out.println(s.solution(
                7,
                new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 6},{6, 7} },
                new String[]{"root", "a", "b", "c", "d", "efghij", "k"}
        ));
    }

    static int answer = 0;
    public int solution(int N, int[][] relation, String[] dirname) {
        // 경로 생성 후 문자열을 만든 후에 길이 측정 -> 최댓값
        // queue

        Queue<int[]> dir = new LinkedList<>();
        for (int i=0 ; i<relation.length ; i++) {
            dir.add(relation[i]);
        }

        for (int i=0 ; i<dir.size() ; i++) {
            if (dir.peek()[0] == 1) {
                int [] t = dir.poll();
                dfs(dir, 1, dirname[t[0]].length() + 1, dirname);
                break;
            }
        }

        return answer; // 마지막 path
    }

    public int dfs(Queue<int[]> dir, int nextVal, int len, String[] dirname) {
        int size = dir.size();
        for (int i=0 ; i<size ; i++) {
            if (dir.isEmpty()) {
                break;
            }
            int [] oneRelation = dir.poll();

            // 1 일때는 패스 필요
            if (oneRelation[0] == nextVal) {
                len += dirname[oneRelation[1]-1].length();
                dfs(dir, oneRelation[1], len + 1, dirname);
                answer = Math.max(answer, len);
                len -= dirname[oneRelation[1]-1].length();
            } else {
                dir.add(oneRelation);
            }

        }
        return 0;
    }
}
