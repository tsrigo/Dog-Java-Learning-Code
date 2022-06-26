package DOG;

public class Dog {
    public int weight;

    public void makeNoise(){
        if (weight < 10){
            System.out.println("yipyip ~~ ");
        } else if (weight < 30 ){
            System.out.println("bark ! bark !");
        } else {
            System.out.println("Woooooooooooooooof !!!!!!! ");
        }
    }
    public static void Old_makeNoise(){
        System.out.println("Bark !!!");
    }
}
