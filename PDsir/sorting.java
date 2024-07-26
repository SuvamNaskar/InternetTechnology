import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        System.out.println("-- Sorting program --");
        while (run) {
            System.out.print("1. Insert\t2. Delete\t3. Sort\t\t4. Display\t0. EXIT\n> ");
            int choice = sc.nextInt();
            int val = 0;
    
            switch (choice) {
                case 1:
                    System.out.print("Insert value: ");
                    val = sc.nextInt();
                    list.add(val);
                    break;
                case 2:
                    if(list.size() == 0)
                        break;
                    System.out.println("Deleting value: " + list.get(list.size() - 1));
                    list.remove(list.size() - 1);
                    break;
                case 3:
                    if(list.size() == 0)
                        break;
                    System.out.println("1. ASC\t2. DESC\n> ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            Collections.sort(list);
                            System.out.println("ASC sorting done!");
                            break;
                        case 2:
                            Collections.sort(list);
                            Collections.reverse(list);
                            System.out.println("DESC sorting done!");
                            break;
                        default:
                            System.out.println("Wrong Input!!");
                            break;
                    }
                    break;
                case 4:
                    System.out.println(list);
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Wrong Input!!");
                    break;
            }
        }
    }
}