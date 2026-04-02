package OOP.Polymorphism;

public class Poli {
    
}

class Character {
    public static void introduce() {
        System.out.println("I am a character.");
    }
}

class Hero extends Character {
    public static void introduce() {
        System.out.println("I am a hero.");
    }
}

class Villain extends Character {
    public static void introduce() {
        System.out.println("I am a villain.");
    }
}

class Panggil {
    public static void main(String[] args) {

        Hero.introduce(); // Output: I am a character.
        Character.introduce();      // Output: I am a hero.
        Villain.introduce();   // Output: I am a villain.

        System.out.println(); // Output: true
    }
}