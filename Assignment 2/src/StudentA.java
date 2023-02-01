public class StudentA extends Marks {

    /*
     * Overriding means chaning behavior of super class method in child class.
     */
    public int mark1;
    public int mark2;
    public int mark3;
    public int markssolution;
    public void getPercentage()
    {   System.out.println("Calculating Grade for Student A: ");
        System.out.println("Enter First Mark:");
        mark1=sc.nextInt();
        System.out.println("Enter Second Mark:");
        mark2=sc.nextInt();
        System.out.println("Enter Third Mark:");
        mark3=sc.nextInt();
        int marktot = mark1 + mark2 + mark3;
        int finals = marktot / 3;
        System.out.println("Grade in class: %"+finals+".");


    }




}