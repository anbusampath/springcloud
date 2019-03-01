package io.anbu.lister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class EnvironmentPostProcessorExample implements EnvironmentPostProcessor {

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		// TODO Auto-generated method stub
		String[] activeProfiles = environment.getActiveProfiles();
		System.out.println("EnvironmentPostProcessorExample.postProcessEnvironment()");

	}

}
