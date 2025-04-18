class Vehicle{
    void drive(){
        System.out.println("Vehicle is driving");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}
class Que_Pre{
    public static void main (String args[]){
        Car c= new Car();
        c.drive();
    }
}