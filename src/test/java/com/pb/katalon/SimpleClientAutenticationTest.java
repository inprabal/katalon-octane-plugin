package com.pb.katalon;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hpe.adm.nga.sdk.Octane;
import com.hpe.adm.nga.sdk.authentication.SimpleClientAuthentication;

public class SimpleClientAutenticationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SimpleClientAuthentication authentication = new SimpleClientAuthentication("MyAPItest_ed81wo3m480d8uqx2ye1rw7no", ")1641019824224521252250V");
        final Octane octane = new Octane.Builder(authentication).Server("https://almoctane-apj.saas.microfocus.com").sharedSpace(Integer.parseInt("179014")).build();
	}

}
