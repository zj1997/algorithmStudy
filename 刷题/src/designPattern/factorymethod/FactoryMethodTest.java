package designPattern.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory();

        ICourse iCourse = iCourseFactory.create();

        iCourse.teach();
    }





}
