package tasks.first;

public class Spider extends Pet{

    public Spider(int countPaws){
        super(countPaws);
    }

    @Override
    public void giveVoice() {
        System.out.println("Звуки паука");
    }
}
