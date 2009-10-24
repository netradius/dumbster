/*
 * Dumbster - a dummy SMTP server
 * Copyright 2004 Jason Paul Kitchen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dumbster.smtp;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author JeremyH
 */
public class BindProblemTest {

	public static final int SMTP_PORT = 9999;

	private SimpleSmtpServer server;

	@Before
	public void setUp() {
		server = SimpleSmtpServer.start(SMTP_PORT);
	}

	@After
	public void tearDown() {
		server.stop();
	}

	@Test
	public void test1() {
		assertTrue(true);
	}

	@Test
	public void test2() {
		assertTrue(true);
	}

	@Test
	public void test3() {
		assertTrue(true);
	}

	@Test
	public void test4() {
		assertTrue(true);
	}

	@Test
	public void test5() {
		assertTrue(true);
	}
}
