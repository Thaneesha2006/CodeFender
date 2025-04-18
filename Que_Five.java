class BankAccount{

    void Deposite(int amount){
    }
    void Withdraw(int amount){
    }
}
class SavingAccount extends BankAccount{
    int balance = 1000;
    int bal;
    void Deposite(int amount){
        bal=balance + amount;
        System.out.println("Total balance is: "+bal);
    }
    void Withdraw(int amount){
        if(amount<=balance){
            bal=balance - amount;
            System.out.println("Total balance is: "+bal);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}

class Que_Five{
    public static void main(String[] args){
        SavingAccount s = new SavingAccount();
        s.Deposite(500);
        s.Withdraw(2000);   
    }
}