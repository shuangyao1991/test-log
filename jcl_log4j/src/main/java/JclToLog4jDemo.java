import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class JclToLog4jDemo {

    public static void main(String[] args) {
        testLog4j();
    }

    public static void testLog4j() {
        Log log = LogFactory.getLog(JclToLog4jDemo.class);
        print(log.getClass().getName());
        log.debug("debug test");
        log.info("info test");
    }

    private static void print(String info) {
        System.out.println(info);
    }

}
