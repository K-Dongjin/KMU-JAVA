
public class ConcatTester
{
	public static void main(String[] args)
	{
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		
		/* 명령문 추가는 이 아래에 하세요 */
		String sent = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(article).concat(" ").concat(animal2);
		int len = sent.length();
		System.out.println(sent);
		System.out.println(len);
	}

}
