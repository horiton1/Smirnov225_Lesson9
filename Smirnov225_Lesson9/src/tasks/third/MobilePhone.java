package tasks.third;

public class MobilePhone extends Phone {

    public MobilePhone(String number) {
        super(number);
    }

    @Override
    public void makeCall(String targetNumber) {
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        super.makeCall(targetNumber);
    }

    public void sendSms(String messageText, String targetNumber){
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}