import java.awt.Font;
import java.io.File;
import java.util.Scanner;


/**
 *
 * @author Shahadat
 */
//

public class HotelReservationRead{

   
    public static void main(String[] args) {
      
     
        try
        {
            File file1= new File("F:\\Hotel Reservation Project\\Hotel.txt");
            Scanner scanner= new Scanner(file1);
              
                String s= scanner.nextLine();
               
                String s1= scanner.nextLine();
                String s2= scanner.nextLine();
                String s3= scanner.nextLine();
                String s4= scanner.nextLine();
                String s5= scanner.nextLine();
                String s6= scanner.nextLine();
                String s7= scanner.nextLine();
                String s8= scanner.nextLine();
          
                
             
                System.out.println(s+"\n");
                System.out.println(s1+"\n");
                System.out.println(s2+"\n");
                System.out.println(s3+"\n");
                System.out.println(s4+"\n");
                System.out.println(s5+"\n");
                System.out.println(s6+"\n");
                System.out.println(s7+"\n");
                System.out.println(s8+"\n");
             
                
            
            scanner.close();
        }
        catch(Exception e)
        {
            System.out.println("this is Exception");
        }
     
    }
    
}

