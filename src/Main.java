import java.util.Scanner;

public class Main {

    /* === Rock Paper Scissor Game === */

    /* Copy these nutzxzs */
    // System.out.println();
    // System.out.print();
	
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean menuStart = true;

        do {
            dashPrinting();
            System.out.println();
            System.out.println("*** Rock Paper Scissor Game ***");
            System.out.println();
            System.out.println();
            System.out.println("[1] Start\n[0] Exit");
			System.out.println();
            System.out.print("Answer: ");
            String userAnswer = scanner.nextLine().trim();;
			System.out.println();


            if (userAnswer.equals("1")) {
				do {
					dashPrinting();
					System.out.println();
    				System.out.println("=== Player's Information ===");
    				System.out.print("Name: ");
					String userName = scanner.nextLine().trim();
					System.out.println();

					if(userName.equals("") || userName.isEmpty()) { 
                		dashPrinting();
                		System.out.println();
                		System.out.println("Error: Do not leave it a blank or just white spaces! Put a name. \nTry Again!");
                		System.out.println();
					} else {
						User player1 = new User();
						player1.setUsername(userName);

                		menuStart = false;

                		MainGame mainGame = new MainGame();
                		mainGame.gameChecker(true);

						break;
					}
				} while(true);

            } else if (userAnswer.equals("0")) {
                dashPrinting();
                System.out.println();
                System.out.println("=== Game Over ===");
                System.out.println("Thank you for Playing!");
				System.out.println();
                menuStart = false;
            } else if(userAnswer.equals("") || userAnswer.isEmpty()) {
                dashPrinting();
                System.out.println();
                System.out.println("Error: Do not leave it a blank or just white spaces! Answer it properly. \nTry Again!");
                System.out.println();
            } else {
                dashPrinting();
                System.out.println();
                System.out.println("Error: Your choice is not on the choices! Choose properly. \nTry Again!");
                System.out.println();
            }
        } while (menuStart);
        
        scanner.close();
    }

    public static void dashPrinting() {
        for (int dash = 1; dash <= 40; dash++) {
            System.out.print('-');
        }

        System.out.println();
    }
}
