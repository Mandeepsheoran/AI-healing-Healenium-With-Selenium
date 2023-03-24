package org.igt.demo.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.igt.demo.utils.DataProviderUtils;

/**
 * Implementation of tesng Listener IAnnotationTransformer
 * Mar 31, 2022
 * @author Mandeep Sheoran
 * @version 1.0
 * @since 1.0
 */
public class AnnotationTransformer implements IAnnotationTransformer {
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethods) {
		annotation.setDataProvider("getPlayerName");
		annotation.setDataProviderClass(DataProviderUtils.class);
		annotation.setRetryAnalyzer(RetryFailedTests.class);
	}
}
