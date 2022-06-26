package DOG;

public class ArrayDemo {
    public static void main(String[] args){
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);  // suppose to be Tiny and yells "yip"
        dogs[1] = new Dog(40);  // suppose to yells "woooooooof !"

        dogs[0].makeNoise();
        dogs[1].makeNoise();
    }
}
