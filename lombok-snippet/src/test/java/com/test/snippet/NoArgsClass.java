package com.test.snippet;

import lombok.NoArgsConstructor;
//  a constructor with no parameter
// when 'force' is true, final fields will be initailized with 0 / false / null 
@NoArgsConstructor(force=true)
public class NoArgsClass {
	final private int inner;
}
