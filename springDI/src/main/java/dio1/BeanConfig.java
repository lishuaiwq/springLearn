package dio1;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 测试使用代码生成配置文件
 * BeanConfig就是一个配置类
 * @author handsome.li
 */
/*@Configuration
public class BeanConfig {

    @Bean
    public School getSchool(){
        return new School();
    }

    @Bean
    public SchoolAspect getSchoolAspect(){
        return new SchoolAspect();
    }

    @Bean
    public Teacher getTeacher(){
        return new MathTeacher();
    }

    public static void main(String[] args) {
        *//***
         * AnnotationConfigApplicationContext spring应用上下文容器中的一种
         * 负责从一个或者多个基于JAVA配置类中加载spring应用上下文
         *//*
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        School getTeacher = (School) context.getBean("getSchool");
        getTeacher.say();
    }

}*/
