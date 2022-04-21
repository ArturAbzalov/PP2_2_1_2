import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanCopy = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Compare ref Helloworld: "+(beanCopy==bean));
        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat catCopy = (Cat) applicationContext.getBean("cat");
        System.out.println("Compare ref Cat: "+(catCopy==cat));
    }
}