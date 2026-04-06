package Prgorammers;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S12924 {
    public int solution(int n) {
        if(n == 1) return 1;
        int answer = 1;

        boolean odd = n % 2 == 0;
        for (int i = 1; i <= (odd ? n / 2 : n / 2 + 1); i++) {
            int tmp = 0;
            for (int j = i; j <= (odd ? n / 2 : n / 2 + 1); j++) {
                tmp += j;
                if(tmp == n) {
                    answer++;
                    break;
                } else if(tmp > n) {
                    break;
                }
            }
        }

        return answer;
    }

    static void main(String[] args) {
        S12924 s = new S12924();
        System.out.println(s.solution(15));
    }
}
