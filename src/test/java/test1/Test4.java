package test1;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

/**
 * @author zhaowei
 * @date 2021/2/16 10:36 AM
 */
public class Test4 {
    @Test
    public void test(){
        String log = "select sql:{}";
        log(log,"create table auto$#kJKytImk(c1 string NOT NULL,c2 int,c3 timestamp,c4 timestamp,index(key=(c1),ts=c4,ttl=0m));");
    }

    @Test
    public void test1(){
        String log = "add {} + {}.{} - {} 34435ff aa{}";
        log(log,"123","567","asd","abc","123");
    }

    public static void log(String log,Object... objs){
        for(Object obj:objs) {
            // log = log.replaceFirst("\\{\\}",obj.toString());
            log = StringUtils.replaceOnce(log,"{}",String.valueOf(obj));
        }
        System.out.println(log);
    }
}
