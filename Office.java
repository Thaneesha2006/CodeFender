class Employee{
    String Name;
    String Address;
    int salary;
    
}

class Manager extends Employee{
    int Bonus;
    void manager(String Name, String Address, int salary,int Bonus){
        this.Name = Name;
        this.Address = Address;
        this.salary = salary;
        this.Bonus = Bonus;

        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: Manager" );
        System.out.println("Bonus: " + Bonus);
        System.out.println("Pergormance: Good");
        System.out.println("Managing project: Banking system\n");

    }
}

class Developer extends Employee{
    int Bonus;
    void developer(String Name, String Address, int salary,int Bonus){
        this.Name = Name;
        this.Address = Address;
        this.salary = salary;
        this.Bonus = Bonus;

        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: Developer");
        System.out.println("Bonus: " + Bonus);
        System.out.println("Pergormance: Good\n");

    }
}

class Programmer extends Employee{
    int Bonus;
    void programmer(String Name, String Address, int salary,int Bonus){
        this.Name = Name;
        this.Address = Address;
        this.salary = salary;
        this.Bonus = Bonus;

        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: Programmer");
        System.out.println("Bonus: " + Bonus);
        System.out.println("Pergormance: Good\n");

    }
}
class Office{
    public static void main(String []args){
        Manager m= new Manager();
        m.manager("Yash", "Mumbai", 50000, 10000);

        Developer d= new Developer();
        d.developer("Rahul", "Pune", 40000, 5000);

        Programmer p= new Programmer(); 
        p.programmer("Rohit", "Delhi", 30000, 3000);
    }
}