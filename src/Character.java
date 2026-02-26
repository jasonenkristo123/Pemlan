public class Character {
    int hp;
    String nama;
    Weapon weapon;
    static int totalCharacters = 0;

    public Character(String nama, int hp) {
        this.nama = nama;
        this.hp = hp;
        totalCharacters++;
    }

    public static int getTotalCharacter() {
        return totalCharacters;
    }

    void Attack(Character target) {
        System.out.println(this.nama + " menyerang " + target.nama + " dengan " + this.weapon.name);
        target.hp -= this.weapon.damage;
        System.out.println("HP " + target.nama + " = " + target.hp);
        if (target.hp == 0) {
            System.out.println("Mati");
        } else {
            System.out.println(target.nama + " masih hidup");
        }
    }
}
