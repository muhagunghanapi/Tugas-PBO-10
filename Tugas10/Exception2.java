public class Exception2 {
    public static void main(String[] args) {
        int i=0;
        String greetings[]={
            "Hello World!",
            "No, I mean it!",
            "Hello World"
        };
        while(i<4)
        {
            try
            {
                System.err.println(greetings[i]);
                i++;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.err.println("Resetting inde value");
                i=0;
            }
        }
    }
}
