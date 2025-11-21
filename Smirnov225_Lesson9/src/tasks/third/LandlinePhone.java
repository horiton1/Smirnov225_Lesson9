package tasks.third;

public class LandlinePhone extends Phone {
    public LandlinePhone(String number) {
        super(number);
    }

    @Override
    public void makeCall(String targetNumber) {
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        super.makeCall(targetNumber);
    }
}
