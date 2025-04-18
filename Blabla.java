class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
class Blabla {
    public static void main(String [] args){
        try {
            throw new MyException("This is my exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}