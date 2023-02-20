// GuessGame has three instance variable for the three player objects.
class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        // Create three Player objects and assign them to the three Player instance variables.
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Declare three variables to hold the three guess the Players make.
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Declare three variables to hold a true or false based on the player's answer.
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // Make a 'target' number that the players have to guess.
        int targetNumber = (int) (Math.random() * 10);
        System.out.println( "I'm thinking of a number between 0 and 9");

        while (true) {
            System.out.println( "Number to guess is" + targetNumber);

            // Call each player's guess() Method
            p1.guess();
            p2.guess();
            p3.guess();

            //Get each player's guess ( the result of their guess() Method running) by accessing the number variable of
            // each Player
            guessp1 = p1.number;
            System.out.println("Player one guessed: " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed: " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed: " + guessp3);

            //Check each player's guess to see if it matched the target number. if a player is right, then set that
            // player's variable to be true (remember, we set it false by default)
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            // if player one or player two or player three is right (the || operator means or)
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner! ");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over");
                break; //game over, so break out of the loop
            }
            else {
                //we must keep going because nobody got it right
                System.out.println("Players will have to try again");
            }
        }
    }
}


