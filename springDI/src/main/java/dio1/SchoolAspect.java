package dio1;

public class SchoolAspect {
    public void before(){
        System.out.println("创建学校前....");
    }

    public void after(){
        System.out.println("创建学校后...");
    }
}
