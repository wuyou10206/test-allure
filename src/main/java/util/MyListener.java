package util;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author zhaowei
 * @date 2021/1/12 2:15 PM
 */
public class MyListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        Test annotation1 = testMethod.getAnnotation(Test.class);
        // annotation.setDescription("NBBBBBB");

        System.out.println(testClass);
        System.out.println(testConstructor);
        System.out.println("+++++++>>>>>>>");
        System.out.println(testMethod.getName());
    }
}
