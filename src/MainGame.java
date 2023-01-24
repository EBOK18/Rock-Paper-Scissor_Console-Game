import java.util.Scanner;
import java.util.Random;

public class MainGame {

    Scanner scan = new Scanner(System.in);

    /* Copy this to lessen the typing. */
    // System.out.println();
    // System.out.print();

    public void gameChecker(boolean gameStarted) { if(gameStarted) modeSelector(); }

    public void modeSelector() {
        // System.out.println("You Died.");
		// User player1 = new User();
		// System.out.println(player1.getName());

        System.out.println("=== Game Mode ===");
        System.out.println(
                """
                        [1] Quick Game
                        [2] First to 3
                        [3] First to 5
                        """
        );
        System.out.print("Answer: ");
        String userAnswer = scan.nextLine().trim();

		GameModes gameModes = new GameModes();

        switch (userAnswer) {
            case "1":
				gameModes.firstGameModeStart();
                break;

            case "2":
				gameModes.secondGameModeStart();
                break;

            case "3":
				gameModes.thirdGameModeStart();
                break;

			case "":
                System.out.println();
                System.out.println("Error: Do not leave it a blank or just white spaces! Put a name. \nTry Again!");
                System.out.println();
				modeSelector();
				break;

            default:
                System.out.println();
                System.out.println("Error: Your choice is not on the choices! Choose properly. \nTry Again!");
                System.out.println();
                modeSelector();
        }
    }

    public String game() {
        Random random = new Random();
		User player1 = new User();

		String userName = player1.getName();
        String winner = "None";
        int aiChoice = random.nextInt(3) + 1;

		System.out.println();
        Main.dashPrinting();
        System.out.println("\n=== The game will commence! ===");
        System.out.println();
        Main.dashPrinting();
		System.out.println();

        System.out.print("Choose:\n\t[1] Rock\n\t[2] Paper\n\t[3] Scissor\n\nAnswer: ");
        String userAnswer = scan.nextLine().trim();

        // System.out.println(userChoice);

		if(userAnswer.equals("") || userAnswer.isEmpty()) {
            System.out.println();
            System.out.println("Error: Do not leave it a blank or just white spaces! Put a name. \nTry Again!");
		} else {
        	if(userAnswer.equals("1")  && aiChoice == 1) {
            	System.out.println(userName + ": Rock");
            	System.out.println("AI Bot: Rock");
            	System.out.println("Result: Draw!");
        	} else if(userAnswer.equals("2") && aiChoice == 2) {
            	System.out.println(userName + ": Paper");
            	System.out.println("AI Bot: Paper");
            	System.out.println("Result: Draw!");
        	} else if(userAnswer.equals("3") && aiChoice == 3) {
            	System.out.println(userName + ": Scissor");
            	System.out.println("AI Bot: Scissor");
            	System.out.println("Result: Draw!");
        	} else if(userAnswer.equals("1") && aiChoice == 2) {
            	winner = "AI Bot";
            	System.out.println(userName + ": Rock");
            	System.out.println("AI Bot: Paper");
            	System.out.println("Result: " + winner + " Win!");
        	} else if(userAnswer.equals("1") && aiChoice == 3) {
            	winner = userName;
            	System.out.println(userName + ": Rock");
            	System.out.println("AI Bot: Scissor");
            	System.out.println("Result: " + winner + " Win!");
        	} else if(userAnswer.equals("2") && aiChoice == 1) {
           		winner = userName; 
				System.out.println(userName + ": Paper"); 
				System.out.println("AI Bot: Rock"); 
				System.out.println("Result: " + winner + " Win!"); 
			} else if(userAnswer.equals("2") && aiChoice == 3) { 
				winner = "AI Bot"; 
				System.out.println(userName + ": Paper"); 
				System.out.println("AI Bot: Scissor"); 
				System.out.println("Result: " + winner + " Win!"); 
			} else if(userAnswer.equals("3") && aiChoice == 1) { 
				winner = "AI Bot"; 
				System.out.println(userName + ": Scissor"); 
				System.out.println("AI Bot: Rock"); 
				System.out.println("Result: " + winner + " Win!"); 
			} else if(userAnswer.equals("3") && aiChoice == 2) {
            	winner = userName;
            	System.out.println(userName + ": Scissor");
            	System.out.println("AI Bot: Paper");
            	System.out.println("Result: " + winner + " Win!");
        	} else {
        		// System.out.println("Error: There is a bug. We'll fix it as soon as possible. Thank you for consideration.");
            	System.out.println();
            	System.out.println("Error: Your choice is not on the choices! Choose properly. \nTry Again!");
        	}
		}

        return winner;
    }
}
