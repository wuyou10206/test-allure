package util;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * @author zhaowei
 * @date 2021/2/15 9:18 AM
 */
public class TestFailListener implements IHookable {


    // @Override
    // public void onTestFailure(ITestResult tr) {
    //     System.out.println("AAAAAAAAAAAAA");
    //     System.out.println(tr.isSuccess());
    //     tr.getMethod();
    //     addLog();
    //     System.out.println("--------");
    //
    // }
    @Attachment(value = "t-log")
    public String addLog(){
        return "logloglog";
    }

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        callBack.runTestMethod(testResult);
        if(testResult.getThrowable()!=null) {
            addLog();
        }
    }
}
