import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of subjects : ");
        int subn = obj.nextInt();
        String[] subjects = new  String[subn];
        for(int i =0 ; i<subjects.length; i++)
        {
            System.out.println("Subject " + (i+1) + ":");
            subjects[i]= obj.next();
            System.out.println();
        }  
        int[] marks = new int[subjects.length];
        int totalm = 0;
        for(int i =0; i<subjects.length; i++)
        {
            System.out.println("Marks obtained in " + subjects[i] + ":"  );
            marks[i] = obj.nextInt();
            totalm += marks[i];
        }
        double avg = (double) totalm / subjects.length;

        System.out.println("Total Marks: " + totalm + " || "+  " Average percentage: " + avg + " || " );
    
        
    
            if(avg >= 90)
            {
                System.out.println(" Grade: A");
            }
            else if(avg >= 85)
            {
                System.out.println(" Grade: B");
            }
            else 

            {
                System.out.println(" Grade: C");
            }


        
    }
}
