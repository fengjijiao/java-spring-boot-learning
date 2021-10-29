package us.fjj.springbootlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import us.fjj.springbootlearning.service.RandomNameGenerator;

//通过实现CommandLineRunner，将在应用启动后执行MyRunner类的run方法。
//MyRunner也装饰有@Component，因此也会自动检测并注册。
@Component
public class MyRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    //使用@Autowired注解，我们将RandomNameGenerator bean注入到randomNameGenerator字段中。
    @Autowired
    private RandomNameGenerator randomNameGenerator;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Generating random name: {}", randomNameGenerator.generate());
        logger.info("Generating random name: {}", randomNameGenerator.generate());
        logger.info("Generating random name: {}", randomNameGenerator.generate());
    }
}
