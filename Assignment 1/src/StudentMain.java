import java.util.*;
public class StudentMain {
    private BankAccount studentarr[];
    private Scanner sc;
    int noofstudent;
    //CRUD=Create,REtereive ,update,Delete

    public StudentMain()
    {
        sc=new Scanner(System.in);

    }
    public int accid = 1000;
    public void insert()
    {
        System.out.println("Enter how many Cardholders you wish to accept: ");
        noofstudent=sc.nextInt();
        studentarr=new BankAccount[noofstudent];

        for(int x=0;x<studentarr.length;x++)
        {
            studentarr[x]=new BankAccount();
            accid++;
            studentarr[x].setDisplayID("BA"+accid);
            studentarr[x].setAccountid(accid);

            System.out.println("Enter Cardholder First Name ");
            studentarr[x].setAccountfirstname(sc.next());
            System.out.println("Enter Cardholder Last Name ");
            studentarr[x].setAccountlastname(sc.next());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Cardholder Address: ");
            String addy = scanner.nextLine();

            System.out.println(addy);
            studentarr[x].setAddress(addy);

            System.out.println("Enter Account Type ");
            studentarr[x].setAccounttype(sc.next());
            System.out.println("Enter Balance ");
            studentarr[x].setBalance(sc.nextInt());
            studentarr[x].setTrasactioncount(0);
            System.out.println("Data inserted ");
        }

    }
    public void delete()
    {
        System.out.println("Enter the AccountID that you want to delete.");
        int studentdelete=sc.nextInt();
        for(BankAccount s:studentarr)
        {
            if(s.getAccountid()==studentdelete)
            {
                s.setDisplayID(null);
                s.setAccountfirstname(null);
                s.setAccountlastname(null);
                s.setAccounttype(null);
                s.setBalance(0);
                s.setTrasactioncount(0);
                s.setAddress("");
                System.out.println("Data deleted");
            }
        }

    }
    public void transact()
    {
        System.out.println("Enter the AccountID that you wish to transact upon.");
        int studenttransact=sc.nextInt();
        for(BankAccount s:studentarr)
        {
            if(s.getAccountid()==studenttransact)
            {
                System.out.println("You have $"+s.getBalance()+" .");
                System.out.println("Who do you wish to transact with?");
                Scanner funds = new Scanner(System.in);
                System.out.println("Enter ACCOUNT ID: ");
                int transactiontarget = funds.nextInt();

                System.out.println(transactiontarget);




                for(BankAccount j:studentarr){
                    if(j.getAccountid()==transactiontarget){
                        Scanner funds2 = new Scanner(System.in);
                        System.out.println("How much do you wish to send to "+j.getAccountfirstname()+"?");
                        int transactamount = funds2.nextInt();
                        System.out.println(transactamount);
                        if (s.getBalance() < transactamount){
                            System.out.println("INSUFFICIENT FUNDS");
                        }
                        else{
                            j.setBalance(j.getBalance() + transactamount);
                            s.setBalance(s.getBalance() - transactamount);

                            j.setTrasactioncount(j.getTrasactioncount()+1);
                            s.setTrasactioncount(s.getTrasactioncount()+1);

                            System.out.println("Funds Successfully sent.");
                        }
                    }
                }

            }
        }

    }
    public void update()
    {

        System.out.println("Enter AccountID which you want to update.");
        int studentupdate=sc.nextInt();
        for(BankAccount s1:studentarr)
        {
            if(s1.getAccountid()==studentupdate)
            {
                System.out.println("Enter new Balance");
                s1.setBalance(sc.nextInt());
                Scanner scanned = new Scanner(System.in);
                System.out.println("Enter Cardholder Address: ");
                String addyy = scanned.nextLine();

                System.out.println(addyy);
                s1.setAddress(addyy);


                System.out.println("Data updated");
            }
        }

    }
    public void menu()
    {
        String choice="y";
        while(choice.equals("y"))
        {
            System.out.println("Enter your choice ");
            System.out.println("1. Insert Details ");
            System.out.println("2. Delete Details ");
            System.out.println("3. Update Details ");
            System.out.println("4. View Details ");
            System.out.println("5. Exit");
            System.out.println("6. Transaction Menu");
            int option=sc.nextInt();
            switch(option)
            {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    retreive();
                    break;
                case 5:
                    System.exit(0);
                case 6:
                    transact();
                    break;
            }
            System.out.println("Do you want to continue?");
            choice=sc.next();
        }
        while(choice.equals("n")){
            System.exit(0);
        }


    }
    public void retreive()
    {
        for(BankAccount s:studentarr)
        {
            System.out.println("AccountID: "+s.getDisplayID());
            System.out.println("Cardholder First Name: "+s.getAccountfirstname());
            System.out.println("Cardholder Last Name: "+s.getAccountlastname());
            System.out.println("Cardholder Address: "+s.getAddress());
            System.out.println("Account Type: "+s.getAccounttype());
            System.out.println("Balance is: "+s.getBalance());
            System.out.println("Transaction Count: "+s.getTrasactioncount());
        }
    }
    public static void main(String[] args) {
        StudentMain smain=new StudentMain();
        smain.menu();
    }

}