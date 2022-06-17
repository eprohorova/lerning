package Mix;

public class Mix {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix[] mixes = new Mix[20];
        int x = 0;
        while (x<19){
            mixes[x] = new Mix();
            mixes[x].counter = mixes[x].counter+1;
            count = count + 1;
            count = count + mixes[x].maybeNew(x);
            x=x+1;
        }
        System.out.println(count + " " + mixes[1].counter);
    }
    public int maybeNew(int index) {
        if (index < 1) {
            Mix mix = new Mix();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
}
