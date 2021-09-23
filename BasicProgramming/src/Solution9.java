
class Solution9 {
  // base: 변환할 진수, base10Num: 10 진수
  public String solution(int base, int base10num) { 
      int maxNum = base * base * base * base - 1;   // 4자리 수로 나타낼 수 있는 최대 크기의 10진수

       String place0 = base10num % base + "";      // 가장 작은 자리
      base10num = base10num / base;
      String place1 = base10num % base + "";      // base 자리 수
      base10num = base10num / base;
      String place2 = base10num % base + "";      // base*base 자리 수
      base10num = base10num / base;
      String place3 = base10num + "";      // 가장 큰 base*base*base 자리 수

      String baseBNum = new String(place3 + place2 + place1 + place0); // base 진수의 수
      String E_msg = ((base < 2) | (10 < base)) & ((1 <= base10num) & (base10num <= maxNum)) ? "오류: 범위 밖의 변환 진수 입력" : "오류: 범위 밖의 10진수 입력";
      String result = ((2 < base) & (base < 10)) & ((1 <= base10num) & (base10num <= maxNum)) ? print(baseBNum) : return E_msg;

      // 10 진수의 base 진수 변환

      return result;
  }
}