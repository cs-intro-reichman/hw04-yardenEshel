import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        for(int i =0;i<string.length();i++)
        {
            if(string.charAt(i) == 'u'||string.charAt(i) == 'i'||string.charAt(i) == 'o'||string.charAt(i) == 'a'||string.charAt(i) == 'e')
            {
                newString += (char)((int)string.charAt(i)-32);
            }
            else if(string.charAt(i) != ' '){
                if ((int)string.charAt(i) <= 90) {
                    newString += (char)((int)string.charAt(i)+32);
                }
                else{
                    newString+=string.charAt(i);
                }
            }
            else
            {
                newString += " ";
            }
            
            
        }
        return newString;
    }

    public static String camelCase (String string) {
        String newString = "";
        int firstSpaceAt = string.indexOf(" ");
        boolean isAfterSpace = false;
        for(int i =0;i<string.length();i++)
        {
            if (i<firstSpaceAt) {
                if ((int)string.charAt(i) <= 90) {
                    newString += (char)((int)string.charAt(i)+32);
                }
                else{
                    newString+=string.charAt(i);
                }
            }
            else
            {
                if(string.charAt(i) == ' ')
                {
                    isAfterSpace = true;
                }
                else if(isAfterSpace)
                {
                    isAfterSpace = false;
                    if ((int)string.charAt(i) > 90) {
                        newString += (char)((int)string.charAt(i)-32);
                    }
                    else{
                        newString+=string.charAt(i);
                    }
                }
                else
                {
                    if ((int)string.charAt(i) <= 90) {
                        newString += (char)((int)string.charAt(i)+32);
                    }
                    else{
                        newString+=string.charAt(i);
                    }
                }

            }
                
        
            
            
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        int length = 0;
        int counter = 0;
        for(int i = 0; i < string.length();i++)
        {
            length += (string.charAt(i) == chr)? 1:0;
        }
        int[] array = new int[length];
        for(int i =0;i<string.length();i++)
        {
            if(string.charAt(i) == chr)
                {
                    array[counter] = i;
                    counter++;
                }
                
            
        }
        return array;
    }
}
