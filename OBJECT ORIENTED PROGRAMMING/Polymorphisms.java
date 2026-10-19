public class Polymorphisms {
    static class Dog {
        void speak() {
            System.out.println("bhauua bhauua");
        }
    }

    static class Cat {
        void speak() {
            System.out.println("miaaaua maiaaua");
        }
    }

    static class Lion {
        void speak() {
            System.out.println("lion");
        }
    }

    // Correct main method signature
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();

        d.speak();
        c.speak();
        l.speak();
    }
}

