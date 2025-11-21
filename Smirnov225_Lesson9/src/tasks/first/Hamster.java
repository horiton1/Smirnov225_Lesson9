package tasks.first;

public class Hamster extends Pet{
    @Override
    public void giveVoice() {
        System.out.println("Звуки хомяка");
    }

    public void hideFood(){
        System.out.println("Вся еда — в щёчках!");
    }
}
