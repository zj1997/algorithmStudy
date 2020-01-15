package designPattern.simpleFactory;

public class SimpleFactoryTest {


    public static void main(String[] args) {
        try {
            ICourse iCourse1 = ICourseFactory.getCourse(Class.forName("designPattern.simpleFactory.JavaCourse"));
            ICourse iCourse2 = ICourseFactory.getCourse(Class.forName("designPattern.simpleFactory.PythonCourse"));

            iCourse1.teach();
            iCourse2.teach();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



}
