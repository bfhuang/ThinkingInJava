package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class<MyClass> myClass = MyClass.class;
//        if you do not know the class name at compile time, but have the class name as a string
//        at runtime, you can do it lie this
        Class<?> myClass1 = Class.forName("myPackage.MyClass");

        System.out.println(myClass.getName());
        System.out.println(myClass.getSimpleName());
        System.out.println(myClass.getPackage());
        System.out.println(myClass.getSuperclass());

        Class<?>[] interfaces = myClass.getInterfaces();
        System.out.println(interfaces.length);

        Constructor<?>[] constructors = myClass.getConstructors();
        System.out.println("constructor length"+constructors.length);
        System.out.println(constructors[0].getName());
        System.out.println(constructors[0].getParameterTypes().length);

        int modifiers = myClass.getModifiers();
        System.out.println(Modifier.isAbstract(modifiers));
        System.out.println(Modifier.isPublic(modifiers));

        Method[] methods = myClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Field[] fields = myClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Annotation[] annotations = myClass.getAnnotations();
        System.out.println("annotation length"+annotations.length);

        Field publicField = myClass.getField("publicField");
        System.out.println(publicField);

//        create an instance through reflection constructor
        MyClass myClassObject = (MyClass)constructors[0].newInstance();

        System.out.println(myClassObject.publicField + " before set");
        publicField.set(myClassObject, 1);
        System.out.println(myClassObject.publicField+" after set");

//        invoke method
        Method publicMethod = myClass.getMethod("publicFunction", null);
        publicMethod.invoke(myClassObject);

//        access private field
        Field privateField = myClass.getDeclaredField("privateField");
        privateField.setAccessible(true);
        myClassObject.setPrivateField(3);
        System.out.println(privateField.get(myClassObject));

//        access private method
        Method privateMethod = myClass.getDeclaredMethod("privateFunction", null);
        privateMethod.setAccessible(true);
        privateMethod.invoke(myClassObject);

    }
}
