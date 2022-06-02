public class Test {
    public static void main(String[] args) {
        int x = 34;
        int y = 43;
        int temp;
        int T;

        temp = x;
        x = y;
        y = temp;
        T = x + y;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Total: " + T);
    }
}
