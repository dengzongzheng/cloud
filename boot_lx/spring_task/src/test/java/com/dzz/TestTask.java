package com.dzz;

import com.dzz.task.AsyncTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dzz on 16/8/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringTaskApp.class)
public class TestTask {


    @Autowired
    private AsyncTaskService asyncTaskService;

    @Test
    public void testTask(){

        for(int i=0;i<10;i++){
            asyncTaskService.task1(i);
            asyncTaskService.task2(i);
        }
    }
}
