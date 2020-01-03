public class Main {

    public static void main(String[] args) {
        ITelephone tomsPhone = new DeskPhone(1780000);
        tomsPhone.callPhone(1780000);
        tomsPhone.dial(15254545);
        tomsPhone.isRinging();
        tomsPhone.powerOn();
        tomsPhone.answer();
        tomsPhone.callPhone(1780000);

        tomsPhone = new MobilePhone(12345);
        tomsPhone.powerOn();
        tomsPhone.answer();
        tomsPhone.isRinging();
    }
}
