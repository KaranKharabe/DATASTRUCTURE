package example.thread;

public class MessageThread extends Thread {
    private String message;
    private int delayTime;

    public MessageThread(String message, int delayTime) {
        this.message = message;
        this.delayTime = delayTime;
    }
     @Override
    public void run() {
        System.out.println("mesasage");
        //Introducing a time gap based upon delay time
        try {
            Thread.sleep(delayTime);
            
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}