import org.apache.log4j.Logger;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class Log4jToSlf4jDemo {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Logger logger = Logger.getLogger(Log4jToSlf4jDemo.class);
        System.out.println(logger.getName());
        logger.warn("warn test");
        logger.info("info test");
    }
}
