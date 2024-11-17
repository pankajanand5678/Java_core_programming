package Solutions;

public class RotatedString {
    
    public boolean isStringRotated(String str1, String str2){

        String parentString = str1+str1;

        if(str1.length() != str2.length())
            return false;
        
        if(parentString.contains(str2)){
            return true;
        }
        else{
            return false;
        }
    }
}
