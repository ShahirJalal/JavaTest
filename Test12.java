import java.util.Scanner;

public class Test12 {
    
    public static void main(String[] args) {
            // while loop = executes a block of code as long as it's condition remains tru

    Scanner scanner = new Scanner(System.in);
    String name = "";

    while(name.isBlank()) {
        System.out.println("Enter your name");
        name =  scanner.nextLine();
    }

    System.out.println("Hello " + name);
    }

}
