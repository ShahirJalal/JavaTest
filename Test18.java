public class Test18 {
    public static void main(String[] args) {
        
        // 2D = an array of arrays

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Saga";
        cars[1][1] = "Myvi";
        cars[1][2] = "Tesla";
        cars[2][0] = "Axia";
        cars[2][1] = "Bezza";
        cars[2][2] = "Iriz";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }

    }
}
