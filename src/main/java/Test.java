import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        User1 user1 = new User1();
        Class cl = user1.getClass();

        Object user11 = cl.newInstance();
//        Class cl = Class.forName("User1");
//        Constructor constructor=cl.getDeclaredConstructor(String.class,String.class);
//        Object o = constructor.newInstance("111","cqd");
//        Class cl = Us;
//        System.out.println(cl);
//        Field field = cl.getDeclaredField("userId");
//        System.out.println(field);
//        Object o = field.get(user1);
//        System.out.println(o);
        Method method = cl.getMethod("run", String.class, int.class);

        


        String s= (String) method.invoke(user11, new Object[]{"111", 2});
        System.out.println(s);
    }
}
