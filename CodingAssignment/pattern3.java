Pattern question-3

public class Pattern3 {
    public static void main(String[] args) {
        int rows = 5;
        int counter = 1;
        
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            
            System.out.println();
        }
    }
}