package io.anbu.lister;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationListenerExample implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Inside ApplicationListener-ApplicationEnvironmentPreparedEvent");
	  }

}
