package less1;

import java.io.*;
import java.util.Objects;

public class Task3 {

    public static void main(String[] args) {
//        writeToFile("task3.txt", "Hello World\nBack to Ussr");
//        readFile("task3.txt");
    }

//    private static void writeToFile(String path, String content) {
//
////        File file = new File(path);
//        FileWriter fw = null;
//
//        try {
//            fw = new FileWriter(path);
//            fw.write(content);
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }

    private static void writeToFile(String path, String content) {
    //        "E:\\code\\work\\gb\\JavaAPI\\example\\gb-java-example"
        try(FileWriter fw = new FileWriter(path)) {
            fw.write(content);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static String readFile(String path) {
        String line;

//        float f = 100000000000000000000000000.0f;
//        System.out.println(f);

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }


    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str); //"123.5" -> "lfkewjhiw
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
