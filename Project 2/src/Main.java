import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Get Player Names: initialize Players
        Scanner keyboard = new Scanner(System.in);
        String name;
        Game ourGame = new Game();
        System.out.println(" Please enter the name of the white Player: ");
        name = keyboard.next();
        ourGame.addPlayer(name);
        System.out.println(" Please enter the name of the black Player: ");
        name = keyboard.next();
        ourGame.addPlayer(name);

        //playing the game
        String command;
        boolean success;

        while(ourGame.isGameOver()) {
            System.out.println("Next command please: (0 to stop)");
            command = keyboard.next();
            if (command.equals("0")) break;
            else {
                success = ourGame.nextRound(command);
                if (!success) System.out.println("Wrong command");
            }
        }
    }
}

//TODO Nc3 works as first move for Black Knight but shoudn't...
