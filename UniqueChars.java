/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        int size = s.length();
        String finalString = "";
        for(int i = 0; i<size ; i++)
        {
            char temp = s.charAt(i);
            if ((temp == ' ') || (finalString.indexOf(String.valueOf(temp)) == -1))
            {
                finalString = finalString + temp;  
            }

        }
        return finalString;
    }
}