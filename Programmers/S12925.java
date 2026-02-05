package Prgorammers;
/*
    [ 연습문제-문자열을 정수로 바꾸기 ]
    문제 설명
    문자열 s를 숫자로 변환한 결과를 반환하는 함수,
    solution을 완성하세요.

    제한 조건
    s의 길이는 1 이상 5이하입니다.
    s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    s는 부호와 숫자로만 이루어져있습니다.
    s는 "0"으로 시작하지 않습니다.

    입출력 예
    예를들어 str이 "1234"이면 1234를 반환하고,
    "-1234"이면 -1234를 반환하면 됩니다.
    str은 부호(+,-)와 숫자로만 구성되어 있고,
    잘못된 값이 입력되는 경우는 없습니다.
 */
public class S12925 {
    public static int solution(String s) {
        return Integer.parseInt(s);
    }

//  parseInt() 사용 없이 해보기
    public static int sol(String s) {
        int tenSize = 1;
        int answer = 0;

        if(s.charAt(0) == '-' || s.charAt(0) == '+') {
            boolean sign = s.charAt(0) != '-';
            for (int i = s.length() - 1; i > 0; i--) {
                answer += (s.charAt(i) - '0') *  tenSize;
                tenSize *= 10;
            }

            return sign ? answer : answer * -1;
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                answer += (s.charAt(i) - '0') *  tenSize;
                tenSize *= 10;
            }
            return answer;
        }
    }
    
    public static void main(String[] args) {
//        System.out.println(solution("-1"));
//        System.out.println(solution("15"));

        System.out.println(sol("-1"));
        System.out.println(sol("15"));
        System.out.println(sol("99999"));
        System.out.println(sol("5-999"));

    }

}

