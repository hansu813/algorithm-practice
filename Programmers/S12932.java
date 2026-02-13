package Prgorammers;

import java.util.Arrays;

/*
    [ 연습문제 - 자연수 뒤집어 배열로 만들기 ]
    문제 설명
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    제한 조건
    n은 10,000,000,000이하인 자연수입니다.

    입출력 예
    n	return
    12345	[5,4,3,2,1]
 */
public class S12932 {
    public static int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        int count = str.length() - 1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str.charAt(count--) - '0';
        }

        return answer;
    }

    static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}
