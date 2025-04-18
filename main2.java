class Animal{
    void Makesound(){
        System.out.println("Animal makes sound");
    }
}
class cat extends Animal{
    void Makesound(){
        System.out.println("Cat meows");
    }
}

class main2{
    public static void main (String[] args){
        Animal a= new cat();
        a.Makesound();
    }
}