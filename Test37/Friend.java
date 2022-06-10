package Test37;

public class Friend {
    
    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }
}
