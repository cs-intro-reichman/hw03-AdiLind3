/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        int size = s.length();
        String newS = ""; //make the new s we get but without Upper-case.
        for(int i = 0 ; i < size; i++)
        {
            char temp = s.charAt(i);
            if (temp >= 65 && temp <= 90) // the ascii code of upper
            {
                temp = (char) (temp + 32) ;
                newS = newS + temp;
            }
            else 
            {
                newS = newS + temp;
            }
            
        }

        return newS;
    }
}