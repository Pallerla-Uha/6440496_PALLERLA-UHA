public class OperatorPrecedence {
    public static void main(String[] args) {
        
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 100 / 10 + 5 * 3 - 2;

        
        System.out.println("Result of 10 + 5 * 2 = " + result1);      
        System.out.println("Result of (10 + 5) * 2 = " + result2);    
        System.out.println("Result of 100 / 10 + 5 * 3 - 2 = " + result3); 

        
    }
}
