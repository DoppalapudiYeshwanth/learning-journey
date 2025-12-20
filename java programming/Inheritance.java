public class Inheritance {
    class Animal {
        public void sound(){
            System.out.println("Animal makes a sound");
        }
    }
    class Dog extends Animal {
        public void bark() {
            System.out.println("Dog barks");
        }
    }
    class MaleDog extends Dog {
        public void boww(){
            System.out.println("angry");
        }
    }
    class FemaleDog extends Dog {
        public void smile(){
            System.out.println("happy");
        }
    }
    class Cat extends Dog {
        public void moew() {
            System.out.println("Cat meows");
        }
    }
    public static void main(String[] args) {
        
    }
}
