class mani2 implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        System.out.println("Inside main method");
    }
    public void run() {
        System.out.println("Inside run method");
    }
}