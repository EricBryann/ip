import java.util.Scanner;

public class Duke {

    public static void printWelcomeMessage() {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Hello! I'm Duke");
        System.out.println("     What can I do for you?");
        System.out.println("    ____________________________________________________________");
    }

    public static void printExitMessage() {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Bye. Hope to see you again soon!");
        System.out.println("    ____________________________________________________________");
    }

    public static void echoMessage(String message) {
        System.out.println("    ____________________________________________________________");
        System.out.println("     " + message);
        System.out.println("    ____________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printWelcomeMessage();

        while(true) {
            String userInput = sc.nextLine();
            if(userInput.equals("bye")) {
                break;
            }
            echoMessage(userInput);
        }

        printExitMessage();
    }
}
