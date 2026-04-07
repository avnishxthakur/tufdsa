class stringlength{
    // Function to return length of a string
    public int findlength(String s){
        return s.length();
    }
}
//driver class
public class arrayand{
    public static void main (String[] args){
        //creating obj of the function class
        stringlength obj = new stringlength();
        //input string 
        String s = "AVNISH THAKUR";
        //call func and print result
        System.out.println(obj.findlength(s));
    }
}