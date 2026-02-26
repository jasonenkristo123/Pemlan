public class Game {
    public static void main(String[] args) {
        Character Hero = new Character("Hero Brian", 100);
        Character Villain = new Character("Villain Arfa", 100);

        Hero.weapon = new Weapon("Farel", 20);
        Villain.weapon = new Weapon("Brian", 15);
        System.out.println(Character.getTotalCharacter());

        Hero.Attack(Villain);
        Villain.Attack(Hero);

        System.out.println("Pertarungan selesai");

        Game game = new Game();
        game.cetakNama(Hero, Villain);
        
    }
    
    void cetakNama(Character ...karakter) {
        for (Character k : karakter) {
            System.out.println(k.nama);
        }
    }

}
