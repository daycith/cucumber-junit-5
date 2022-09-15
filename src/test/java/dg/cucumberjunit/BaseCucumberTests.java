package dg.cucumberjunit;

/*
This class allows junit detect and run cucumber tests.
 */

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
public class BaseCucumberTests {
}
