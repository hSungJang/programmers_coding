package dataStructure.basic.lvl1;

public class PhoneHIde {
    public static void main(String[] args) {

        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number) {
        String answer = "";

        String splitString = phone_number.substring(0, phone_number.length()-4);
        String lastString = phone_number.substring(phone_number.length()-4);
        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i<splitString.length() ; i++) {
            sb.append("*");
        }
        return sb.append(lastString).toString();
    }
}
