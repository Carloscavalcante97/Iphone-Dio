package Calls;

public class Call {
public  void cellPhone(){
    turnOn();
    call();
    answer();
    voiceMail();
}
   private void turnOn(){
    System.out.println("Turning on the Iphone");
   }
    private void call(){
        System.out.println("Calling...");
    }

    private void answer(){
        System.out.println("Answering...");
    }

    private void voiceMail(){
        System.out.println("Voice Mail");
    }
    public void turnOff(){
    System.out.println("Turning off the Iphone");
    }
}
