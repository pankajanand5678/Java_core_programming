import Solutions.CountChars;

public class Main{
    public static void main(String[] args) {
        
        String str = "pankaj anand from ranchi";

        CountChars objCountChars = new CountChars();
        int lenOfStr = objCountChars.getStringLength(str);
        System.out.println(lenOfStr);
    }
}