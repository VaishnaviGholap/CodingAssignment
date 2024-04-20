//Question Collection-1

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
       
        ArrayList<String> colors = new ArrayList<>();

       
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        
        System.out.println("Colors in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}