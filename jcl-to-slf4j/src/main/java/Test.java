import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class Test {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Log log = LogFactory.getLog(Test.class);
        System.out.println(log.getClass());
        log.info("info test");
        log.warn("warn test");
    }
}
