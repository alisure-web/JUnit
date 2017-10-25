package test.spring.service;

import org.springframework.stereotype.Service;

/**
 * Created by ALISURE on 2017/3/15.
 */
@Service("testService")
public class TestService {

    public String getString(){
        return  "test ha ha";
    }

}
