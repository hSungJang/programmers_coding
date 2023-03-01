package dataStructure.basic.lvl1;

public class Babbling {
    public static void main(String[] args) {
        String [] babbling = {"aya", "yee", "u", "maa"};
        String [] babbling2 = {"mama", "uuu", "yeye", "yemawoo", "ayayayae", "ayayema"};
        System.out.println(solution(babbling2));
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        for (int i=0 ; i<babbling.length ; i++) {
            String temp = babbling[i];
            if (checkNotAvail(temp)) continue;
            temp = checkString(temp);
            if (checkLength(temp)) answer++;
        }
        return answer;
    }

    public static boolean checkNotAvail(String str) {
        String [] notAvail = {"ayaaya", "yeye", "woowoo", "mama"};
        for (String val : notAvail) {
            if (str.contains(val)) return true;
        }
        return false;
    }


    public static String checkString(String str) {
        String [] avail = {"aya", "ye", "woo", "ma"};
        for (String val : avail) {
            str = str.replace(val, "0");
        }

        return str.replace("0","").trim();
    }

    public static boolean checkLength(String str) {
        return str.length() == 0 ? true : false;
    }

}
