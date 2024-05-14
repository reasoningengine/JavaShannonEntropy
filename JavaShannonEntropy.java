//Made by Denisov Arseny Yurievich . I believe in Christianity and TAO and that we meet with our dead relatives .

package maxentropyalgorithm;

import java.util.ArrayList;
import java.util.List;


public class JavaShannonEntropy {

    static public int countCharacter(String strString, String strChar)
    {
        int n = 0;
        
        for (int i = 0; i < strString.length(); i++)
        {
            if (Character.toString(strString.charAt(i)).equals(strChar))
            {
                n++;
            }
        }
        return n;
    }
    
    static public double ShannonEntropy(String strInput)
    {
        ArrayList<String> iteratedChars = new ArrayList<String>();
        int iLength = strInput.length();
        float fValue = 0;
        
        for (int i = 0; i < iLength; i++)
        {
            String strCharAt = Character.toString(strInput.charAt(i));
            
            if (!iteratedChars.contains(strCharAt))
            {
                iteratedChars.add(strCharAt);
            }

        }
        
        
        for (int i = 0; i < iteratedChars.size(); i++)
        {
            float prob = (float)countCharacter(strInput, iteratedChars.get(i))/(float)iLength;
            fValue += prob*(Math.log(prob)/Math.log(27));
        }
        
        fValue = fValue*(-1);
        
        return fValue;
    }
    
    public static void main(String[] args) {
        
        System.out.println(ShannonEntropy("Test"));
    }
    
}
