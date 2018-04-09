package com.test.snippet;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

@Builder
@ToString
@Getter
public class BuilderClass<T> {
	private String name;
	private int age;
	@Singular
	private List<T> occupations;
}
