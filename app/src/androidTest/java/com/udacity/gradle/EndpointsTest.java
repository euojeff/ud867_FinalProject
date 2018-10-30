package com.udacity.gradle;

import android.support.test.runner.AndroidJUnit4;


import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4.class)
public class EndpointsTest {


    @Test
    public void jokeNotEmptyTest() throws InterruptedException {

        final CountDownLatch lock = new CountDownLatch(1);

        EndpointsAsyncTask task = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                Assert.assertNotNull(result);
                if (result != null){
                    Assert.assertTrue(!result.trim().equals(""));
                    lock.countDown();
                }
            }
        };
        task.execute();
        lock.await();
    }
}
