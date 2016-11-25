import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class JclToJulDemo {

    public static void main(String[] args) {
//        testJUL();
        testJULWithProperties();
    }

    public static void testJUL() {
        Log log = LogFactory.getLog(JclToJulDemo.class);
        print(log.getClass().getName());
        log.debug("debug test");
        log.info("info test");
    }

    public static void testJULWithProperties() {
        System.setProperty("java.util.logging.config.file",
                System.getProperty("user.dir") + "\\jcl_jul\\src\\main\\resources\\logging.properties");
        Log log1 = LogFactory.getLog(JclToJulDemo.class);
        log1.debug("debug test");
        log1.info("info test");
    }

    private static void print(Object info) {
        System.out.println(info);
    }

}
