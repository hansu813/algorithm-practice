package Prgorammers;
/*

 */
public class S12919 {
    public static String solution(String[] seoul) {
        int count = 0;
        for (String str : seoul) {
            if(str.equals("Kim")) {
                break;
            }
            count++;
        }
        return "김서방은 " + count + "에 있다";
    }

    static void main(String[] args) {
        System.out.println(solution(new String[] {"Jane", "Kim"}));
    }
}
