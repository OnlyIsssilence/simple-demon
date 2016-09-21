import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.smart4j.chapter2.controller.HelloService;
import org.smart4j.chapter2.service.HelloServiceImpl;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/30.
 * Description:
 */
public class JaxWsServer {
    public static void main(String[] args){
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setAddress("http://localhost:8080/ws/sopa/hello");
        factory.setServiceClass(HelloService.class);
        factory.setServiceBean(new HelloServiceImpl());
        factory.create();
        System.out.println("sopa ws is published!");
    }
}
