package GoodDog;

public class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;

    }
    void bark(){
        if (size>60){
            System.out.println("Bark! Bark!");
        }else if (size >30){
            System.out.println("Buf! Buf!");
        }else {
            System.out.println("Tyf! Tyf!");
        }
    }
}
