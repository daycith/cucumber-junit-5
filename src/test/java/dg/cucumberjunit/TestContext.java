package dg.cucumberjunit;

import org.springframework.stereotype.Component;

@Component
public class TestContext {
    private ScenarioContext scenarioContext;

    TestContext(){
        this.scenarioContext = new ScenarioContext();
    }

    public ScenarioContext getScenarioContext(){
        return this.scenarioContext;
    }
}
