
/**
 * Write a description of class ExampleTask here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ExampleTask
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter Unit Name:");
        String unitName = sc.nextLine();
        
          System.out.println("Enter Total Student:");
        int totalStudent = sc.nextInt();
        int[] allStudentMark = new int[totalStudent];
        
        System.out.println("Enter Unit Mark:");
       
        
        for(int i=0;i<totalStudent;i++) {
               int unitMark = sc.nextInt();
               
            int validityCheck =  checkEnterMark(unitMark);
             
             if(validityCheck ==0 ) {
                 allStudentMark[i] = unitMark;
                
             }
             else {
            
                      
       unitMark = sc.nextInt();
       
      int reCheck =  checkEnterMark(unitMark);
      
      if(reCheck ==0 ) {
            allStudentMark[i] = unitMark;
      }
      else {
          i--;
      }
             }
     
        }
        
        
        System.out.println("Marks of student for unit"+ " " + unitName+ " are :");
        for(int j=0;j<allStudentMark.length;j++) {
            System.out.println(allStudentMark[j]);
        }
        
        
        
   
      
        userMarkCalculate( allStudentMark);
        userMeanDeviationCalculate(allStudentMark);
      
        
   
        
        
    }
    
    public static int checkEnterMark (int val) {
        if(val >=0 && val <=100) {
        return 0;
        }
        else {
            System.out.println("Not a valid mark,Enter the mark again:");
         return -1; 
        }
    } 
    
    public static void userMarkCalculate(int[] allStudentMark) {
        
              int high=0,low=allStudentMark[0];
              
              for(int k=0;k<allStudentMark.length;k++) {
                  if(high < allStudentMark[k]) {
                      high =  allStudentMark[k];
                       
                  }
                   if( allStudentMark[k]< low) {
                      low=allStudentMark[k];
                  }
              } 
              
              System.out.println("\n" + "High and Low marks are:"  + high + "  and " + low + " respectively");
    }
    
    public static void  userMeanDeviationCalculate(int [] allStudentMark) {
        double sum=0.0;
        double mean=0.0;
        for(int m=0;m<allStudentMark.length;m++) {
            sum=sum+allStudentMark[m];
            
        }
             mean = sum/(allStudentMark.length);
           System.out.println(mean+" is the mean of marks");
           
           
           double standardDeviationSum=0.0, finalDeviationResult=0.0;
           
           for (int i = 0; i < allStudentMark.length; i++) {
			standardDeviationSum += Math.pow((allStudentMark[i] - mean), 2);
		}
		
		 finalDeviationResult = Math.sqrt(standardDeviationSum/(allStudentMark.length-1));
                System.out.println(finalDeviationResult+" is the stadard deviation of marks");
       
    }

    
}
