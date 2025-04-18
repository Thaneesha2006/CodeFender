public class Mani extends Thread {
    public static void main(String args[]) {
        Mani t = new Mani();
        t.start();
        System.out.println("This is out of thread class");
    }

    public void run() {
        System.out.println("This is inside thread class");
    }
}