import java.util.Properties;

/**
 * Created with by shuangyao on 2016/10/10.
 */
public class Test {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (Object object : properties.keySet()) {
            String s = (String) object;
            System.out.println(s + "=" + properties.get(s));
        }
    }
}
