package client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.funci.ApplicationBootstrap;
import com.funci.service.OrderServiceUsing;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
public class AbstractTraining {

    @Autowired
    OrderServiceUsing orderServiceUsing;

    @Test
    public void test() {
    	orderServiceUsing.test();
    }
}