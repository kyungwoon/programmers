package 챌린지_문자열내림차순_36;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str);

        for (int i = str.length - 1; i >= 0; i--) {
            answer += str[i];
        }

        return answer;
    }
}
