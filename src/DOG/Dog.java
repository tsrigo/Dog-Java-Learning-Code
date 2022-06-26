package DOG;

public class Dog {
    public int weight;

    public Dog (int w){
        weight = w;
    }
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

    public static Dog maxDog(Dog d1, Dog d2){ // static method
        if (d1.weight > d2.weight) return d1;
        else return d2;
    }

    public Dog minDog(Dog d2){  // non-static method
        if (this.weight > d2.weight) return d2;
        else return this;
    }
}
