public class HelloWorld
{
    public static void main(String[] args) {
        try {
            int helloCount = parseArgs(args);
            sayHello(helloCount);        
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());        
        }
    }
    
    private static void sayHello(int helloCount) {
        for(int i = 0; i < helloCount; i++) {
            System.out.println("Hello, World");
        }
    }

    private static int parseArgs(String[] args) throws IllegalArgumentException {
        int helloCount = 1;

        if(args.length > 0) {
            try {
                helloCount = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("helloCount argument '" + args[0] + "' is not a number");
            }
        }

        if(helloCount < 0) {
            throw new IllegalArgumentException("helloCount argument '" + args[0] + "' is less than zero");
        }

        return helloCount;
    }
}
