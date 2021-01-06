package com.forezp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class Test {
	public static void main(String args[]) {
		String Str = new String("www.google.com");

		System.out.print("匹配成功返回值 :" );
		System.out.println(Str.replaceAll("(.*)google(.*)", "runoob" ));
		System.out.print("匹配失败返回值 :" );
		System.out.println(Str.replaceAll("(.*)taobao(.*)", "runoob" ));
	}
}
