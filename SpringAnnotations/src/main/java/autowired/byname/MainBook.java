package autowired.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBook
{
    public static void main(String[] args) {

        ApplicationContext f = new AnnotationConfigApplicationContext(ConfigBook.class);
        Category c = f.getBean(Category.class);
        System.out.println( c.getJava().getBid()+" "+c.getJava().getBname()+" "+c.getJava().getPrice()+" "+c.getCname());
    }
}
