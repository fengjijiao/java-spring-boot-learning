package us.fjj.springbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//注解启用自动配置和组件扫描，它是@Configuration，@EnableAutoConfiguration和@ComponentScan注解的便捷注释。
@SpringBootApplication
public class SpringBootLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearningApplication.class, args);
        /**
         * 29-10-2021 21:25:08 [main] INFO  us.fjj.springbootlearning.SpringBootLearningApplication.logStartupProfileInfo - No active profile set, falling back to default profiles: default
         * 29-10-2021 21:25:09 [main] INFO  us.fjj.springbootlearning.SpringBootLearningApplication.logStarted - Started SpringBootLearningApplication in 0.882 seconds (JVM running for 2.303)
         * 29-10-2021 21:25:09 [main] INFO  us.fjj.springbootlearning.MyRunner.run - Generating random name: Peter
         * 29-10-2021 21:25:09 [main] INFO  us.fjj.springbootlearning.MyRunner.run - Generating random name: Robert
         * 29-10-2021 21:25:09 [main] INFO  us.fjj.springbootlearning.MyRunner.run - Generating random name: Peter
         */
    }

}
