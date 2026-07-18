public class HelloWorld {
    public static void main(String[] args) {
        // String is non-primitive, so use .equals()
        // AND OR NOT
        int intx = 5;
        int inty = 10;
        double doublex = 5;
        double doubley = 10;
        double x = Math.pow(3,2) // 3^2 =9
        // Double uses more memory, int for optimization (stick to doubles)
        // Int truncates
        boolean k = false;
        char a = 'a';
        // Increments: x++ as x+= or x-- as x-=
        // Adding a string and an integer causes concatination, not addition
        String 100 = "Hello world!";
        String greeting = "Hello!";
        String greetingname = "Hello\nSushmita";
        if (intx == 5) {
            String sameline = "This will say \\n, not a new line.";
        }
        System.out.println(Math.sqrt(intx + inty));
        if (true) {
            System.out.println(greetingname);
        }
    }
}