
interface Animal {
    void eat();
}
interface Pet {
    void play();
}
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    public void play() {
        System.out.println("Dog is playing");
    }
}
class Cat implements Animal, Pet {
    public void eat() {
        System.out.println("Cat is eating");
    }
    
    public void play() {
        System.out.println("Cat is playing");
    }
}
public class MulInheriInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
        
        Cat cat = new Cat();
        cat.eat();
        cat.play();
    }
}