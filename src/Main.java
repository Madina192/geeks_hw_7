public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.healPoints = 100;
        Hero[] heroes = {new Magic(), medic, new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic) {
                ((Medic) heroes[i]).increaseExperience();
            }
        }
        System.out.println("HealPoints: " + medic.healPoints);
    }
}