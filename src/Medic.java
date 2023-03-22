public class Medic extends Hero{
    int healPoints;
    public int increaseExperience(){
        return healPoints+=healPoints/10;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность вылечить");
    }
}
