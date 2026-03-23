package Prgorammers;
/*
    [연습문제 - JadenCase 문자열 만들기]
    문제 설명
    JadenCase란 모든 단어의 첫 문자가 대문자이고,
    그 외의 알파벳은 소문자인 문자열입니다.
    단, 첫 문자가 알파벳이 아닐 때에는 이어지는
    알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
    문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수,
    solution을 완성해주세요.

    제한 조건
    s는 길이 1 이상 200 이하인 문자열입니다.
    s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
    숫자는 단어의 첫 문자로만 나옵니다.
    숫자로만 이루어진 단어는 없습니다.
    공백문자가 연속해서 나올 수 있습니다.

    입출력 예
    s	return
    "3people unFollowed me"	"3people Unfollowed Me"
    "for the last week"	"For The Last Week"
 */
public class S12951 {
    public String solution(String s) {
        if(s.length() == 1) {
            return s.toUpperCase();
        }

        String tmp = s.toLowerCase();
        StringBuilder answer = new StringBuilder();

        int frontIdx = 0, backIdx = 1;

        while (backIdx < tmp.length()) {
            char c1 = tmp.charAt(frontIdx);
            char c2 = tmp.charAt(backIdx);
            if(frontIdx == 0) {
                answer = c1 >= 97 && c1 <= 122 ? answer.append((char) (c1 - 32)) : answer.append((char) c1);
                answer.append(c2);
            } else {
                if(c1 == ' ') {
                    answer = c2 >= 97 && c2 <= 122 ? answer.append((char) (c2 - 32)) : answer.append((char) c2);
                } else {
                    answer.append(c2);
                }
            }
            frontIdx++;
            backIdx++;
        }
        return answer.toString();
    }

    static void main(String[] args) {
        S12951 s = new S12951();

        System.out.println(s.solution("3people unFollowed me"));
        System.out.println(s.solution("for the last week"));
    }
}
