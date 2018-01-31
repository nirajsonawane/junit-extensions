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
package io.github.glytching.junit.extension.system;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;


/**
 * Declares a system property to be set before a test. This annotation can be used at class level
 * and at method level.
 *
 * <p>Usage example:
 *
 * <pre>
 *  // set the system properties nameA:valueA
 *  &#064;SystemProperty(name = "nameA", value = "valueA")
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Documented
@Repeatable(value = SystemProperties.class)
@ExtendWith(SystemPropertyExtension.class)
public @interface SystemProperty {

    String name();

    String value();
}
