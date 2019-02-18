package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001,"Adriano", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Yasmyn", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004,"AnnA", 0.0, 0.01);

        //Downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);


        //BusinessAccount acc5 = (BusinessAccount)acc3; The compilator doesn't know that this operation isn't possible
        // So when you compile the project is going to give a exception error
        if(acc3 instanceof  BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.00);
            System.out.println("loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }

}
