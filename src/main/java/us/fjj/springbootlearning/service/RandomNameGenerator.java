package us.fjj.springbootlearning.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//在组件扫描过程中将检测到它，并将其注册为Spring Bean。
@Component
public class RandomNameGenerator {
    public String generate() {
        var names = List.of("Peter", "Roland", "Lucy", "Robert", "Jane");
        var r = new Random();
        int i = r.nextInt(names.size());
        return names.get(i);
    }
}
