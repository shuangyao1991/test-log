import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class JclToSlf4jDemo {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Log log = LogFactory.getLog(JclToSlf4jDemo.class);
        System.out.println(log.getClass());
        log.info("info test");
        log.warn("warn test");
    }
}
