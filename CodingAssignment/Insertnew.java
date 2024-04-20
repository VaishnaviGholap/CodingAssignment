//

import java.util.ArrayList;

public class Insertnew {
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();

       
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        
        String newColor = "Purple";
        colors.add(0, newColor);

        
        System.out.println("Colors after inserting at the first position:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}