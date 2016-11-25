import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class LogbackDemo {

    public static void main(String[] args) {
        testLogBack();
    }

    public static void testLogBack() {
        Logger logger = LoggerFactory.getLogger(LogbackDemo.class);
        System.out.println(logger.getName());
        logger.debug("debug test");
        logger.info("info test");

        //print the ststua
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);
    }


    private static void print(String info) {
        System.out.println(info);
    }
}
