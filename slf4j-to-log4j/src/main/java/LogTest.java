import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class LogTest {

    public static void main(String[] args) {
        testLog4j();
    }

    public static void testLog4j() {
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        print(logger.getName());
        logger.debug("debug test");
        logger.info("info test");
    }

    private static void print(String info) {
        System.out.println(info);
    }

}
