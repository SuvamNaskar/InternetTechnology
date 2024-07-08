import java.util.*;

class arraylist{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("orange");
        colors.add("violet");
        colors.add("gray");

        System.out.println("colors: " + colors);
        Collections.sort(colors);
        System.out.println("colors: " + colors);

    }
}