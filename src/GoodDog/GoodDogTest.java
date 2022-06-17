package GoodDog;

public class GoodDogTest {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(31);

        GoodDog three = new GoodDog();
        three.setSize(14);

        one.bark();
        two.bark();
        three.bark();
    }
}
