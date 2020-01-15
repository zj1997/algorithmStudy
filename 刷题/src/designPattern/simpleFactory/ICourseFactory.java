package designPattern.simpleFactory;

public class ICourseFactory {

    public static ICourse getCourse(Class clazz){

        try {
            return  (ICourse) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
         return null;
    }


}
