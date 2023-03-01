package dataStructure.basic.search;

class skills {
    int order;
    String skill;
    boolean isSkill = false;

    skills(int order, String skill) {
        this.order = order;
        this.skill = skill;
        this.isSkill = false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class SkillTrees_6_3 {

    public static void main(String[] args) {
        String case1 ="CBD";
        String [] caseTrees1 = {"BACDE", "CBADF", "AECB", "BDA"};
        String case2 = "ABC";
        String [] caseTrees2 = {"CQKWEKAB"};
        String case3 = "CBDK";
        String [] caseTrees3 = {"CB", "CXYB", "BD", " AECD", "ABC", "AEX" ,"CDB", "CBKD", "IJCB","LMDK"};
        System.out.println(solution1(case3, caseTrees3));
    }

    public static int solution1(String skill, String[] skill_trees) {
        //목표: 스킬과 스킬트리 문자열을 비교
        int answer = 0;
        for (String s : skill_trees) {
            String text_temp = ""; // 스킬트리 순서 보장을 위한 문자열
            String text = ""; // target 문자 -> 해당 문자열과 skill 트리를 비교


            // ex. CBD, 검증 대상 : BACDE
            for (int i=0 ; i<skill.length() ; i++) { // 1. 주어진 스킬트리 만큼 한 글자 씩 반복
                String target = skill.charAt(i) + ""; // target 설정 a. C
                if (text_temp.contains(target)) { // "".contains("C") -> false
                    text += text;
                    break;
                }
                if (s.contains(target)) {  // BACDE.contains("C")
                    String [] str = s.split(target); // str[] = [BA], [DE]
                    text += target; // text: C
                    if (str.length > 1) { // str[] = [BA], [DE]  -> true
                        text_temp = str[0]; //text_temp: BA -> 이전 문자열 중에 스킬트리 순서 맞는지 확인 용
                        s = str[1];  // s: DE -> 다음 문자열 확인을 위한 장치
                    } else if (str.length == 1) {
                        text_temp = str[0];
                        s = "";
                    } else {
                        s = "";
                    }
                }
            }
            if (skill.startsWith(text)) {
                answer++;
            }
        }

        return answer;
    }
}
