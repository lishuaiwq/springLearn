package dio1;



public class School {

    private Teacher teacher;

    public void say(){
        teacher.fun();
    }

    public School(Teacher teacher) {
        this.teacher = teacher;
    }
}
