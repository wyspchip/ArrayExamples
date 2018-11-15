import   java.util.ArrayList;

public class Digits

{
 
    
   private ArrayList<Integer> digitList;    
 


    
   public Digits(int num)
   {
       digitList = new ArrayList<Integer>();
       int  x=num;
       
       if (num==0)
           digitList.add(new Integer (0));
       else   
       {
           digitList.add(new Integer(num));
       }
        System.out.println(digitList);
    }

    public boolean isStrictlyIncreasing() {
        int n = digitList.get(0);
        while (n/10>0) {
            if (digitList.get(0)%10 <= (digitList.get(0)/10)%10) return false;
            n/=10;
        }
        System.out.println("o");
        return true;
    }
  
}