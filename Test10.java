public class Test10 {
    public static void main(String[] args) {
        // logical operators = used to connect two or more expressions
        // 
        //                  && = (AND) both conditions must be true
        //                  || = (OR) either condition must be true
        //                  !  = (NOT) reverses boolean value of condition

        int temperature = 15;

        if(temperature > 30) {
            System.out.println("It is hot outside");
        }
        else if (temperature >= 20 && temperature <= 30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }
    }
}
