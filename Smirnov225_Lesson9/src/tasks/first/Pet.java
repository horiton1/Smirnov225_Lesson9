package tasks.first;

public class Pet {
    protected int pawsCount;

    protected Pet(int pawsCount){
        this.pawsCount = pawsCount;
    }

    protected Pet(){

    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void sleep(){
        System.out.println("Сплю");
    }

    public void play(){
        System.out.println("Играю");
    }

    public void giveVoice(){

    }
}
