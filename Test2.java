import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = nameInput.nextLine();

        System.out.println("Your name is: " + name);
    }
}
