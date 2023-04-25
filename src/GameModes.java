
public class GameModes extends MainGame {

	private int userScore = 0;
	private int aiScore = 0;
	private int scoreLimit;

	public void setScoreLimit(int score) {
		this.scoreLimit = score;
		winnerAnnouncer();
	}

	private void winnerAnnouncer() {
	    System.out.println();
        System.out.println("Winner: " + scorer(scoreLimit) + " Win!");
		System.out.println();
        System.out.println("=== Game Over ===");
        System.out.println("Thank you for Playing!");
        System.out.println();
	}

	private String scorer(int scoreLimit) {
		User player1 = new User();
		String gameWinner = "None";
		String userName = player1.getUsername();

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
				break;
			}

			if(aiScore == scoreLimit) {
				gameWinner = "AI Bot";
				break;
			}
		} while(true);

		return gameWinner;
	}
}
