
class Solution9 {
  // base: ��ȯ�� ����, base10Num: 10 ����
  public String solution(int base, int base10num) { 
      int maxNum = base * base * base * base - 1;   // 4�ڸ� ���� ��Ÿ�� �� �ִ� �ִ� ũ���� 10����

       String place0 = base10num % base + "";      // ���� ���� �ڸ�
      base10num = base10num / base;
      String place1 = base10num % base + "";      // base �ڸ� ��
      base10num = base10num / base;
      String place2 = base10num % base + "";      // base*base �ڸ� ��
      base10num = base10num / base;
      String place3 = base10num + "";      // ���� ū base*base*base �ڸ� ��

      String baseBNum = new String(place3 + place2 + place1 + place0); // base ������ ��
      String E_msg = ((base < 2) | (10 < base)) & ((1 <= base10num) & (base10num <= maxNum)) ? "����: ���� ���� ��ȯ ���� �Է�" : "����: ���� ���� 10���� �Է�";
      String result = ((2 < base) & (base < 10)) & ((1 <= base10num) & (base10num <= maxNum)) ? print(baseBNum) : return E_msg;

      // 10 ������ base ���� ��ȯ

      return result;
  }
}