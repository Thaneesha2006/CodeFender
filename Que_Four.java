class Employee {
    void work(){
        System.out.println("Employee is working");
    }
    void getsalary(){
        System.out.println("Employee is getting salary");
    }
}

class HRManager extends Employee {
    void work(){
        System.out.println("HR Manager is working well🐶");
    }
    void addemployee(){
        System.out.println("HR Manager is adding employee and he is from RBU Nagpur ");
    }
}

class Que_Four{
    public static void main (String args[]){
        
        HRManager h = new HRManager();
        h.work();
        h.addemployee();
    }
}