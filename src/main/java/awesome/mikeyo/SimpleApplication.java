package awesome.mikeyo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApplication {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }
}
