package springComponent;

import javax.annotation.PostConstruct;
import java.io.File;

public class FileLogger implements Logger{

    private File file;

    public FileLogger(File file) {
        this.file = file;
    }

    @Override
    public void write() {
        System.out.println("Write log to file");
    }

    public void wrote ()  {
        System.out.println("kkk");
    }
}
