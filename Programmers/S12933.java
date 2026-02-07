package Prgorammers;

/*
    [ 연습문제 - 정수 내림차순으로 배치하기 ]
    문제 설명
    함수 solution은 정수 n을 매개변수로 입력받습니다.
    n의 각 자릿수를 큰것부터 작은 순으로
    정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건
    n은 1이상 8000000000 이하인 자연수입니다.

    입출력 예
    n	    return
    118372	873211
 */
public class S12933 {
    public static long solution(long n) {
        String str = n + "";
        int[] arr = new int[10];
        for (char c : str.toCharArray()) {
            arr[c - '0']++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if(arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    answer.append(i);
                }
            }
        }
        return Long.parseLong(answer.toString());
    }

    static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
