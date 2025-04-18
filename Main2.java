import java.util.Scanner;   
interface Area{         
    void area(double l,double b);   
    
    
}
class rectangle implements Area{
    public void area(double l,double b){
        
        System.out.println("Area of rectangle is "+l*b);
    }
    
} 
class circle implements Area{
    public void area(double l){
        
        System.out.println("Area of circle is "+3.14*l*l);     
    }
}
class Main2{
    public static void main(String args[]){ 
        double l,b;
        Scanner sc= new Scanner(System.in);
        circle c= new circle();
        System.out.println("Enter the radius of the circle");
        l= sc.nextDouble();
       
        c.area(l);


        rectangle r= new rectangle();
        System.out.println("Enter the length and breadth of the rectangle");
        l=sc.nextDouble();
        b=sc.nextDouble();
        r.area(l,b);  
    }
}