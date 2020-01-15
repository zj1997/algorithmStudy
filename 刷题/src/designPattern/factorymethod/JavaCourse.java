package designPattern.factorymethod;

public class JavaCourse implements ICourse {
    @Override
    public void teach() {
        System.out.println("教授Java课程!");
    }
}
