
public class GameModes extends MainGame {

	private boolean gameEnd = false;
	private int userScore = 0;
	private int aiScore = 0;
	
	public void firstGameModeStart() {
		// game();
		int scoreLimit = 1;
		
        System.out.println();
        System.out.println("Winner: " + winnerAnnouncer(scoreLimit) + " Win!");
		System.out.println();
        System.out.println("=== Game Over ===");
        System.out.println("Thank you for Playing!");
        System.out.println();
	}
	
	public void secondGameModeStart() {
		int scoreLimit = 3;

		System.out.println();
		System.out.println("Winner: " + winnerAnnouncer(scoreLimit) + " Win!");
		System.out.println();
		System.out.println("=== The Game is Over ===");
		System.out.println("Thank you for playing.");
        System.out.println();
	}

	public void thirdGameModeStart() {
		int scoreLimit = 5;

		System.out.println();
		System.out.println("Winner: " + winnerAnnouncer(scoreLimit) + " Win!");
		System.out.println();
		System.out.println("=== The Game is Over ===");
		System.out.println("Thank you for playing.");
		System.out.println();
	}

	private String winnerAnnouncer(int scoreLimit) {
		User player1 = new User();
		String gameWinner = "None";
		String userName = player1.getName();

		// Continue modifying this method for first game method.

		do {
			String winner = game();	

			if(winner.equals(userName)) {
				++userScore;
				System.out.println("Score: \n\t" + userName + ": " + userScore + "\n\tAI Bot: " + aiScore);
			}

			if(winner.equals("AI Bot")) {
				++aiScore;
				System.out.println("Score: \n\t" + userName + ": " + userScore + "\n\tAI Bot: " + aiScore);
			}

			if(userScore == scoreLimit) {
				gameWinner = userName;
				gameEnd = true;
			}

			if(aiScore == scoreLimit) {
				gameWinner = "AI Bot";
				gameEnd = true;
			}
		} while(!gameEnd);

		return gameWinner;
	}
}
