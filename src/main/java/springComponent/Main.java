package springComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanConfig.class);
        FileLogger fileLogger = (FileLogger) applicationContext.getBean("fileLogger");
        fileLogger.write();
        fileLogger.wrote();


    }
}
