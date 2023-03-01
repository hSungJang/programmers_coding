package dataStructure.practice.lvl0;

public class Babbling0 {

    public static void main(String[] args) {

        String [] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String [] word = {"aya", "ye", "woo", "ma"};

        for (String noun : babbling) {
            for (String s : word) {
                noun = noun.replace(s, "0");
            }
            noun = noun.replace("0","");
            if (noun.length() == 0) answer++;
        }

        return answer;
    }
}
