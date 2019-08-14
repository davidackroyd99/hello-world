
public class UpperCaseDemo{

    public static void main(String[] args) {

        String in_string = "Hello World";
        String out_string = "";

        char c;
        for(int i=0; i<in_string.length(); i++){
            c = in_string.charAt(i);
            if(('a' <= c) && (c <= 'z')){
                c = (char)(c + ('A' - 'a'));
            }
            out_string = out_string + c;
        }
        System.out.println( out_string );
        
        // Using the same code as above, but in a function.
        String out_string_2 = toUpper("Another string");
        System.out.println( out_string_2 );

        // Or more simply.
        System.out.println( toUpper("One more string") );

        // Or use the String method toUpperCase().
        System.out.println( "Using the class method".toUpperCase() );

        // What are classes and methods?
    }

    public static String toUpper(String in_string){
        String out_string = "";

        char c;
        for(int i=0; i<in_string.length(); i++){
            c = in_string.charAt(i);
            if(('a' <= c) && (c <= 'z')){
                c = (char)(c + ('A' - 'a'));
            }
            out_string = out_string + c;
        }
        return out_string;  
    }
}