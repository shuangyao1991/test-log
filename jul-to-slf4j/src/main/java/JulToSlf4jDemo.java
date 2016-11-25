import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class JulToSlf4jDemo {

    public static void main(String[] args) {
//        testJUL();
        testJULToSlf4j();
    }

    public static void testJUL() {
        Logger logger = Logger.getLogger(JulToSlf4jDemo.class.getName());
        System.out.println(logger.getName());
        logger.log(Level.WARNING, "warning test");
        logger.log(Level.INFO, "info test");
    }

    public static void testJULToSlf4j() {
        LogManager.getLogManager().reset();
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        testJUL();
    }
}
