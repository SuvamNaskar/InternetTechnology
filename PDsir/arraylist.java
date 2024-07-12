import java.util.*;

class arraylist{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        System.out.println("colors: " + colors);
        colors.add(0, "magenta");
        System.out.println("colors: " + colors);
        System.out.println("color: " + colors.get(2));
        colors.set(2, "yellow");
        System.out.println("colors: " + colors);
        
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
    	if(colors.contains(color)) System.out.println("Given color found in the list");
        else System.out.println("Color NOT found");
    }
}
