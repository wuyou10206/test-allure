package test1;

import io.qameta.allure.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @author zhaowei
 * @date 2021/1/11 11:29 AM
 */
@Epic("测试Epic")
@Feature("测试Feature")
@Slf4j
public class Test2 implements ITest{

    @Story("测试1")
    @Test
    @Description("sss")
    public void test11(){
        System.out.println("111");
    }
    @Story("测试1")
    @Test
    @Description("aaa")
    public void test12(){
        Allure.addAttachment("测试-log：","嗯嗯嗯好的");

        System.out.println("222");
        System.out.println("11234");

    }

    @Story("测试2")
    @Test
    @Description("sss")
    public void test21(){
        System.out.println("111");
        log.info("ssss");
        Assert.assertTrue(true);

    }
    @Story("测试2")
    @Test
    @Description("aaa")
    public void test22(){
        System.out.println("222");
    }

    @Override
    public String getTestName() {
        return "hahahahaha";
    }
    @AfterMethod
    public void afterMethod(ITestResult ir){
        System.out.println("BBBBB");
        Allure.addAttachment("t-lll", "111111");
        if(!ir.isSuccess()) {
            System.out.println("AAAA");
            Allure.addAttachment("t-lll", "ttttt");
        }
    }
}
