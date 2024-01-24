import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    // private static boolean exitTask;;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String testVar = "hello";
        // ObjectItem item = new ObjectItem(testVar);

        ArrayList<String> toDList = new ArrayList<>();
        System.out.println("Hello and Welcome to Your To Do List");
        System.out.println("=====================================");
        while (true) {

            System.out.println("Please Enter a Selection From the Menu");
            System.out.println("=====================================");
            System.out.println("1.Add To Do Item\n2.Remove To Do Item\n3.View To Do Items\n4.Exit To Do List");

            int userSelection = sc.nextInt();
            sc.nextLine();

            switch (userSelection) {
                case 1:
                    System.out.println("Please Enter To Do List Item");
                    String task = sc.nextLine();
                    toDList.add(task);
                    System.out.println("You have added " + task + "  to you your to do list");
                    break;
                case 2:
                    System.out.println("Please Enter The Item Number You Would Like to Remove");
                    int listItemNumber = sc.nextInt();
                    String removedTask = toDList.remove(listItemNumber - 1);
                    System.out.println("You have removed " + removedTask);
                    System.out.println("=====================================");
                    break;
                case 3:
                    if (toDList.size() <= 0) {
                        System.out.println("There are no items in your To Do List.");
                    } else {
                        System.out.println("To Do List:");
                        for (int i = 0; i < toDList.size(); i++) {
                            System.out.println(i + 1 + ": " + toDList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("You are Exiting the To Do List");
                    System.out.println("=====================================");
                    sc.close();

                    break;
                default:
                    System.out.println("You entered an invalid character please try again");
                    break;
            }

        }

    }

}

class ObjectItem {

    String description;

    ObjectItem(String dDescription) {

        description = dDescription;
    }
}