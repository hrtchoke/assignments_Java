public class StudentB extends Marks {



    public int mark1;
    public int mark2;
    public int mark3;

    public int mark4;
    public int markssolution;
    public void getPercentage()
    {
        System.out.println("Calculating Grade for Student B: ");
        System.out.println("Enter First Mark:");
        mark1=sc.nextInt();
        System.out.println("Enter Second Mark:");
        mark2=sc.nextInt();
        System.out.println("Enter Third Mark:");
        mark3=sc.nextInt();
        System.out.println("Enter Fourth Mark:");
        mark4=sc.nextInt();
        int marktot = mark1 + mark2 + mark3 + mark4;
        int finals = marktot / 4;
        System.out.println("Grade in class: %"+finals+".");


    }
}