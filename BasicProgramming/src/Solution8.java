
class Solution8 {
  // base: 변환할 진수, base10Num: 10 진수
  public String solution(int base, int base10num) { 
      int maxNumber;   // 4자리 수로 나타낼 수 있는 최대 크기의 10진수

      String place0 = base10num % base + "";      // 가장 작은 자리
      base10num = base10num / base;
      String place1 = base10num % base + "";      // base 자리 수
      base10num = base10num / base;
      String place2 = base10num % base + "";      // base*base 자리 수
      base10num = base10num / base;
      String place3 = base10num + "";      // 가장 큰 base*base*base 자리 수

      String baseBNum = new String(place3 + place2 + place1 + place0); // the number in the new base    

      // 10 진수의 base 진수 변환
      // 1. base 진수의 가장 아래 자리수 place0를 계산한다. 이 수는 주어진 10진수를 처음
      //    base 로 나누어 얻은 나머지이다.

      // 2. 첫번째 몫을 계산한다. base10Num 변수나 새로운 변수를 사용하여 몫을 저장한다.

      // 3. base 진수 다음 자리수 place1을 계산한다. 이 수는 첫번째 나눗셈에서 얻은 몫을
      //    base 로나누어 얻은 나머지이다.

      // 4. 두번째 몫을 계산한다.

      // 5. 같은 방법으로 그 다음 자리수 place2와 세번째 몫을 계산한다.

      // 6. 같은 방법으로 마지막 자리수 place3를 계산한다.

      // 변환한 base 진수를 문자열로 조합한다.

      return baseBNum;
  }
}