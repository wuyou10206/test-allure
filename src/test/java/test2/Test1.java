package test2;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.ITest;
import org.testng.annotations.Test;

/**
 * @author zhaowei
 * @date 2021/1/11 11:29 AM
 */
@Epic("测试Epic2")
@Feature("测试Feature")
public class Test1 implements ITest{

    @Story("测试1")
    @Test(description = "BBBB")
    @Description("sss")
    public void test11(){
        System.out.println("111");
    }
    @Story("测试1")
    @Test
    @Description("aaa")
    public void test12(){
        System.out.println("222");
    }

    @Story("测试2")
    @Test
    @Description("sss")
    public void test21(){
        System.out.println("111");
    }
    @Story("测试2")
    @Test
    @Description("aaa")
    public void test22(){
        System.out.println("222");
    }

    @Override
    public String getTestName() {
        return "HEHEHEH";
    }
}
