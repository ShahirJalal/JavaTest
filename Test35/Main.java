package Test35;

public class Main {

    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
    }
}