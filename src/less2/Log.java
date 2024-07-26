package less2;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {

    static {
        try(FileInputStream in = new FileInputStream("log.config")) {

            LogManager.getLogManager().readConfiguration(in);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger(String className) {
        return Logger.getLogger(className);
    }
}
