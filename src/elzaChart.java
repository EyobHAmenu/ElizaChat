import java.util.Scanner;

public class elzaChart {
    public static void main (String[] args)
    {
        String name;
        String your_day;
        String answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza,");
        System.out.print("What's your name?");
        name = scan.nextLine();
        System.out.print("Nice to meet you, " + name + "\n" + "How has your day been?");
        your_day = scan.nextLine();
        System.out.print("Okay, Anything in particular that makes you feel that " + your_day + "?" );
        answer = scan.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
        System.out.println("Here are your responses: " + name + ", " + your_day + ", " + answer);
    }
}
