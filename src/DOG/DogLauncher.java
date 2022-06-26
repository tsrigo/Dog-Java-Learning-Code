package DOG;

public class DogLauncher {
    public static void main(String[] args){
        Dog d = new Dog(20);
        // d = new Dog();
        // d.weight = 20;
        d.makeNoise();

        Dog d2 = new Dog(50); // Observe that we've invoked using the class name, since this method is a static method.
        Dog max_dog = Dog.maxDog(d, d2);
        System.out.println("max_dog yells : ");
        max_dog.makeNoise();

        Dog min_dog = d.minDog(d2);// Observe that we've invoked using the instance, since this method is a static method.
        System.out.println("min_dog yells : ");
        min_dog.makeNoise();
    }
}
