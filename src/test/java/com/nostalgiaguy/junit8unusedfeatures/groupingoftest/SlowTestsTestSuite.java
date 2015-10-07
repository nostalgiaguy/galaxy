package com.nostalgiaguy.junit8unusedfeatures.groupingoftest;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Suite.SuiteClasses(CategorizedTests.class)
public class SlowTestsTestSuite {

}
