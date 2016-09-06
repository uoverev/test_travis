package com.linus.travis.test;

import org.junit.Assert;
import org.junit.Test;

import com.linus.travis.util.StringUtil;

public class Test1 {

	@Test
	public void testStrign(){
		String r = StringUtil.contact('a','b');
		Assert.assertEquals(r, "ab");
	} 
}
