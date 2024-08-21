package less6.hw;

import java.util.Scanner;

public class ConsoleUI {

    private LaptopService service = new LaptopService();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {

            System.out.print("> Введите параметр поиска:");
            String param = scanner.nextLine();
            if (param.equals("n")) System.exit(0);
            //...\
            System.out.println("Искать еще? (y/n)");
        }
    }

    /*
    * find(String searchParam) {
    *   return service.какой-то метод поиска
    * }
    *
    * */
}
