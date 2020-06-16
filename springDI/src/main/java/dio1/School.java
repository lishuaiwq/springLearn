package dio1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
    private Teacher teacher;

    public void say(){
        teacher.fun();
    }

    public School(Teacher teacher) {
        this.teacher = teacher;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        School school = (School) context.getBean("school");
        school.say();
    }
}
