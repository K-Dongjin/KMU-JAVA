
class Solution3 {
    public int solution(int num1, int num2) {
        int total = num1 + num2;
        int dif = num1 - num2;
        int multi = num1 * num2;
        int answer = total + dif + multi;
        return answer;
    }
}