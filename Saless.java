import java.util.Scanner;

public class Saless{
    public static void main (String args []){
       
       final int SalesPersons=5;
        int sum;
        sum=0;
        int max=0;
        int min=0;

        Scanner scan=new Scanner(System.in); 

        int[] sale = new int[SalesPersons];

        String [] name =new String [SalesPersons];

        for (int i=0; i<(name.length); i++){
            System.out.print("Enter sales person name: ");
            name[i]=scan.nextLine();
        }



        for(int j=0;j<(sale.length);j++){
            
            System.out.print(name[j]+":");
            sale[j]=scan.nextInt();
        }
        

        for(int j=0;j<(sale.length);j++){
            sum+=sale[j];
        }
        
        

        for (int j=0;j<sale.length;j++){
            if (sale[j]>sale[max]){
                j=max;
            }
            if (sale[j]<sale[min]){
                j=min;
            }
        }
        
        System.out.println(sum);
        

        

    }
}