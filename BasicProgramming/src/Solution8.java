
class Solution8 {
  // base: ��ȯ�� ����, base10Num: 10 ����
  public String solution(int base, int base10num) { 
      int maxNumber;   // 4�ڸ� ���� ��Ÿ�� �� �ִ� �ִ� ũ���� 10����

      String place0 = base10num % base + "";      // ���� ���� �ڸ�
      base10num = base10num / base;
      String place1 = base10num % base + "";      // base �ڸ� ��
      base10num = base10num / base;
      String place2 = base10num % base + "";      // base*base �ڸ� ��
      base10num = base10num / base;
      String place3 = base10num + "";      // ���� ū base*base*base �ڸ� ��

      String baseBNum = new String(place3 + place2 + place1 + place0); // the number in the new base    

      // 10 ������ base ���� ��ȯ
      // 1. base ������ ���� �Ʒ� �ڸ��� place0�� ����Ѵ�. �� ���� �־��� 10������ ó��
      //    base �� ������ ���� �������̴�.

      // 2. ù��° ���� ����Ѵ�. base10Num ������ ���ο� ������ ����Ͽ� ���� �����Ѵ�.

      // 3. base ���� ���� �ڸ��� place1�� ����Ѵ�. �� ���� ù��° ���������� ���� ����
      //    base �γ����� ���� �������̴�.

      // 4. �ι�° ���� ����Ѵ�.

      // 5. ���� ������� �� ���� �ڸ��� place2�� ����° ���� ����Ѵ�.

      // 6. ���� ������� ������ �ڸ��� place3�� ����Ѵ�.

      // ��ȯ�� base ������ ���ڿ��� �����Ѵ�.

      return baseBNum;
  }
}