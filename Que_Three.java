class Shape{
    void getarea(int a, int b){
        System.out.println("Area of shape is: ");
    }
}
class Rectangle extends Shape{
    void getarea(int l, int b){
        
        System.out.println("Area of rectangle is: "+l*b);
    }
}
class Que_Three{
    public static void main (String[] args){
        Shape r = new Rectangle();
        r.getarea(5,6);
    }
}