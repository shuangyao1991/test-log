import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class Slf4jToJulDemo {

    public static void main(String[] args) {
        testToJUL();
//        testToJULWithProperties();
    }

    public static void testToJUL() {
        Logger logger = LoggerFactory.getLogger(Slf4jToJulDemo.class);
        print(logger.getName());
        logger.info("info test");
        logger.debug("debug test");
    }

    public static void testToJULWithProperties() {
        System.setProperty("java.util.logging.config.file",
                System.getProperty("user.dir") + "\\slf4j-to-jul\\src\\main\\resources\\logging.properties");
        Logger logger = LoggerFactory.getLogger(Slf4jToJulDemo.class);
        print(logger.getName());
        logger.info("info test");
        logger.debug("debug test");
    }

    private static void print(String info) {
        System.out.println(info);
    }
}
