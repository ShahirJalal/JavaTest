public class Test {
    public static void main(String[] args) {
        int x = 34;
        int y = 43;
        int temp = null;

        int temp = x;
        int x = y;
        int y = temp;

        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
    }
}
