package Dog2;

public class Dog2 {
    String name;

    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.bark();
        dog2.name = "Bart";

        Dog2[] mydogs = new Dog2[3];
        mydogs[0] = new Dog2();
        mydogs[1] = new Dog2();
        mydogs[2] = new Dog2();

        mydogs[0].name = "Fred";
        mydogs[1].name = "Gorge";

        System.out.println("Имя последней собаки - ");
        System.out.println(mydogs[2].name);

        int x = 0;
        while (x<mydogs.length){
            x=x+1;
        }
    }
    public void bark(){
        System.out.println(name + "сказал Гав!");
    }
    public void eat(){

    }
    public void chaseCat(){

    }
}
