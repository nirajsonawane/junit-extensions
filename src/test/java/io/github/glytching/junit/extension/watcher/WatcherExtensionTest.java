/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.glytching.junit.extension.watcher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * The {@link WatcherExtension} has no easily assertable side effects since all it does it write
 * some log events and we cannot easily mock the logger instance it uses when invoking it in the
 * <em>normal</em> test flow.
 *
 * <p>There seem to be some gaps around testability of JUnit Jupiter extensions e.g.
 *
 * <ul>
 *   <li>Cannot inject dependencies into extensions; for the {@link WatcherExtension} it would be
 *       convenient to be able to inject a mocked Logger instance
 *   <li>Cannot get our hands on the {@link ExtensionContext} used by a test invocation
 * </ul>
 */
@ExtendWith(WatcherExtension.class)
public class WatcherExtensionTest {

  @Test
  public void canExecuteATestWithTheWatcherEngaged() throws Exception {
    // not much more we can do here!
    Thread.sleep(20);
  }
}
