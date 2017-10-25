package test.spring.controller;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.spring.service.TestService;

/**
 * Created by ALISURE on 2017/3/18.
 */
public class JunitTest extends BaseJunitTest{

    public static Logger logger = Logger.getLogger(JunitTest.class);

    @Autowired
    private TestService testService;

    @Test
    public void test1(){
        System.out.println("test1()");
    }

    @Test
    public void test2(){
        String str = testService.getString();
        System.out.println(str);
        logger.info(str);
    }
}
