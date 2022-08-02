package com.rmendes;

import com.intuit.karate.junit5.Karate;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PerfTestsRunner {
	
	@Karate.Test
	Karate testExample() {
		return Karate.run("simple").relativeTo(getClass());
	}
}
