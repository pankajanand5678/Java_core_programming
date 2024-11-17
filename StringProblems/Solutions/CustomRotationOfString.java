package Solutions;

public class CustomRotationOfString {
    
    public String getCustomRotatedString(String str, int times){

        // pankajpankaj
        int n = str.length();
        String modifiedStr = str + str;
        times = times%n;

        int i;
        i = n-times;
        return modifiedStr.substring(i, i+n);
    }
}
