// class Animal {

//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {

//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class methodoverriding {

//     public static void main(String[] args) {

//         Dog d = new Dog();

//         d.sound();
//     }
// }
// class Animal {

//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {

//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {

//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class methodoverriding {

//     public static void main(String[] args) {

//         Animal a1 = new Dog();
//         Animal a2 = new Cat();
//         Animal a3 = new Animal();

//         a1.sound();
//         a2.sound();
//         a3.sound();
//     }
// }
class Animal {

    Animal getAnimal() {
        System.out.println("Animal method");
        return new Animal();
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    Dog getAnimal() {
        System.out.println("Dog method");
        return new Dog();
    }

    @Override
    void sound() {

        super.sound();

        System.out.println("Dog barks");
    }
}

public class methodoverriding {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

        Dog d1 = d.getAnimal();
    }
}
