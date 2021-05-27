package clases;

import clases.configuration.ApplicationConfiguration;
import clases.console.ConsoleWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        ConsoleWorker worker = new ConsoleWorker();
    }
}
