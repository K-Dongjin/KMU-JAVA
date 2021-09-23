
class Solution7 {
    public boolean solution(int base, int base10Num) {
        int maxNum = base * base * base * base - 1;
        boolean answer = (1 <= base10Num) & (base10Num <= maxNum);
        return answer;
    }
}