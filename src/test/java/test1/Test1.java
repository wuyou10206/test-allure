package test1;

import entity.TUser;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlTest;
import util.Value;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author zhaowei
 * @date 2021/1/11 11:29 AM
 */
@Epic("测试Epic")
@Feature("测试Feature")
public class Test1 implements IAnnotationTransformer {

    @BeforeMethod
    public void BeforeMethod(ITestContext context,XmlTest xmlTest, Method method, Object[] testData) {
        // List<XmlClass> xmlClasses = xmlTest.getXmlClasses();
        // System.out.println(">>>>>>>>:"+xmlClasses);
        // System.out.println("======:"+xmlClasses.get(0).getIncludedMethods());
        // XmlInclude xmlInclude = xmlClasses.get(0).getIncludedMethods().get(0);
        //
        // System.out.println(Arrays.toString(testData));
        // if(testData!=null&&testData.length>0){
        //     Object obj = testData[0];
        //     if(obj instanceof TUser){
        //         System.out.println("AAAAAAAAA");
        //         TUser u = (TUser) obj;
        //         xmlInclude.setDescription(u.getName());
        //     }
        // }
    }

    @DataProvider
    public Object[] getData(ITestContext context, Method method){
        // context.getCurrentXmlTest().setName("AAAAAAA");
        return new Object[]{
                new TUser("zw1",12,"测试1"),
                new TUser("zw2",13,"测试2"),
                new TUser("zw3",14,"测试3"),
        };
    }

    @Story("测试1")
    @Test(description = "AAA",dependsOnMethods = {"test12"})
    @Description("sss")
    @Step("aaaaa")
    public void test11(){
        System.out.println("111");
    }
    @Story("测试1")
    @Test
    @Description("aaa")
    @Step("bbbbb")
    public void test12(){
        System.out.println("222");
    }

    @Story("测试2")
    @Test(dataProvider = "getData")
    @Step("{tUser.desc}")
    @Description("{tUser.desc}")
    @AllureId("{tUser.desc}")
    public void test21(TUser tUser){
        System.out.println("111,t="+tUser.getName());
    }

    private static String value() {
        return "auto"+ new Random().nextInt(10);
    }

    @Story("测试2")
    @Test(description = "")
    @Description("aaa")
    public void test22(){
        System.out.println("222");
    }

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

    }
}
