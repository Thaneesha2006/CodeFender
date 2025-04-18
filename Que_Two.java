class Vehicle{
    void drive(){
        System.out.println("Vehicle is driving");
    }
}

class car extends Vehicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}

class Que_Two{
    public static void main(String[] args){
        Vehicle v = new car();
        v.drive();
    }
}