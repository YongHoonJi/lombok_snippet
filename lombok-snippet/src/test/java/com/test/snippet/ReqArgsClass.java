package com.test.snippet;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor // empty field
@RequiredArgsConstructor(staticName = "of") // with final or NonNum field
@AllArgsConstructor // with all 
public class ReqArgsClass {
	@NonNull private String name;
	private String addr;
	private int age;
}
