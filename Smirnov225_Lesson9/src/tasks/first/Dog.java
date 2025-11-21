package tasks.first;

public class Dog extends Pet{
    @Override
    public void giveVoice() {
        System.out.println("Гав");
    }

    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
