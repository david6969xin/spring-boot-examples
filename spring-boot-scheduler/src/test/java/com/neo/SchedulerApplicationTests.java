package com.neo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;


@SpringBootTest
public class SchedulerApplicationTests {

	@Test
	public void contextLoads() throws InterruptedException {
		System.out.println("scheduler tasks are running");
		TimeUnit.SECONDS.sleep(10);
	}

}
