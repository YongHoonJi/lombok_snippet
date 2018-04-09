package com.test.snippet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import org.junit.Test;

import lombok.Cleanup;
import lombok.val;

public class AppTest {
	/*
	 * val = final private + type inference
	 */
	public void test_val() {
		val name = "my name";
		// can't be modified
		// name = "mod";
		val fellow = new Fellow(name);
		System.out.println(fellow.getName());
	}

	public void test_var() {
		// var name = "my name";
	}

	//@Test
	public void test_nonNull() {
		val reason = "reason";
		val class1 = new NonNullClass(reason);
		// NPE with a null parameter
		try {
			val class2 = new NonNullClass(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tset_cleanUp() {
		try {
			@Cleanup
			InputStream in = new FileInputStream("file1");
			@Cleanup
			OutputStream out = new FileOutputStream("file2");
			byte[] b = new byte[10000];
			while (true) {
				int r = in.read(b);
				if (r == -1)
					break;
				out.write(b, 0, r);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
	
	public void test_noArgs() {
		val class1 = new NoArgsClass();
	}
	
	public void test_allArgs() {
		val cls = new AllArgsClass("me", "home");
	}
	
	public void test_reqArgs() {
		val cls = ReqArgsClass.of("my name");
		val cls2 = new ReqArgsClass("my name", "home", 30);
		val cls3 = new ReqArgsClass();
	}
	public void test_value_class() {
		val cls = new ValueClass("my name", "home");
		System.out.println(cls.toString());
		cls.getName();
	}
	
	//@Test
	public void test_builder() {
		val occupations = Arrays.asList("dev", "arch");
		val cls = BuilderClass.builder().age(30).name("my name")
				.occupation("devenloper").build();
		System.out.println(cls.toString());
		val cls2 = BuilderClass.builder().age(30).name("my name")
				.occupation(occupations).build();
		System.out.println(cls2.toString());
	}
	
	@Test
	public void test_lazy_getter() {
		// not evaluated
		val cls = new LazyGetterClass();
		// do other things
		System.out.println(cls.getAge());
		
		// evaluate getter
		System.out.println(cls.getLarge());
		
	}
	
	

}
