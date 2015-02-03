/*
 * Copyright 2010-2014 JetBrains s.r.o.
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

package org.jetbrains.jet.android;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/android-idea-plugin/testData/android/rename")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidRenameTestGenerated extends AbstractAndroidRenameTest {
    public void testAllFilesPresentInRename() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-idea-plugin/testData/android/rename"), Pattern.compile("^([^\\.]+)$"), false);
    }

    @TestMetadata("fqNameInAttr")
    public void testFqNameInAttr() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("plugins/android-idea-plugin/testData/android/rename/fqNameInAttr/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInTag")
    public void testFqNameInTag() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("plugins/android-idea-plugin/testData/android/rename/fqNameInTag/");
        doTest(fileName);
    }

    @TestMetadata("multiFile")
    public void testMultiFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("plugins/android-idea-plugin/testData/android/rename/multiFile/");
        doTest(fileName);
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("plugins/android-idea-plugin/testData/android/rename/simple/");
        doTest(fileName);
    }
}
