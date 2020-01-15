package designPattern.factorymethod;

public class PythonCourse implements ICourse {
    @Override
    public void teach() {
        System.out.println("教授python课程!");
    }
}
