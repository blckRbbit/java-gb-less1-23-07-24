package less4;

import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class Task1 {

    private static List<String> DB = new LinkedList<>();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        while (true) {
            System.err.println("=======================================");
            String in = getUserEnter(); // "text:17"

            String[] arr = in.split(":");
            String text = arr[0];

            int position;

            try {
                position = Integer.parseInt(arr[1]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid position input");
            }

            if (position > DB.size()) {
                for (int i = 0; i < position+1; i++) {
                    add(i,null);
                }
                add(position, text);
            } else {
                if (!text.toLowerCase().startsWith("print")) {
                    add(position, text);
                } else {
                    System.out.println("TEXT: " + DB.get(position));
                    DB.remove(position);
                    System.out.println("Text was removed");
                }
            }

        }
    }

    private static void add(int position, String text) {
        DB.add(position, text);
    }

    private static String getUserEnter() {
        System.out.println("To save text \n enter an expression like text:num,\n where text is any text, : is delimiter and num is the save position: ");
        System.out.println("To read the text \n, enter a line like print:num, where num is the position at which the text is saved: ");
        System.out.println("Enter q to quit");

        String userEnter = prompt();

        if (userEnter.equals("q")) {
            System.exit(0);
        } else {
            if (!userEnter.contains(":")) {
                throw new RuntimeException("Input error");
            }
        }

        return userEnter;
    }

    private static String prompt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
