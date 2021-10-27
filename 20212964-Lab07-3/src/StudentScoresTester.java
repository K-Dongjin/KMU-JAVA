import java.util.Scanner;

public class StudentScoresTester {
	public static void main(String[] args) {
		StudentScores studSc = new StudentScores();
		Scanner in = new Scanner(System.in);
		boolean done = true;

		// Read the students names and scores, and add them to studSc
		do {
			System.out.println("Enter a student name or -1 to end: ");
			String name = in.nextLine();
			if (name.equals("-1"))
				done = false;
			else {
				System.out.println("Enter the student's score: ");
				int score = in.nextInt();
				in.nextLine(); // skip the end-of-line character
				/** Your code goes here */
				studSc.add(name, score);
			}
		} while (done);

		// Find the students with highest and lowest scores and print
		// their names and scores
		/** And here */
		System.out.println(studSc.getHighest().getName() + " is highest score of " + studSc.getHighest().getScore() + ".");
		System.out.println(studSc.getLowest().getName() + " is lowest score of " + studSc.getLowest().getScore() + ".");
	}
}
