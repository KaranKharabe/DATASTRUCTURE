package example.thread;

public class MessageThreadExample {
    //multithreading program platform dependent
    public static void main(String[] args) {
        Thread t1 = new MessageThread("Hello",1000);
        Thread t2 = new MessageThread("hi",500);
        t1.start();
        t2.start();
    }

}