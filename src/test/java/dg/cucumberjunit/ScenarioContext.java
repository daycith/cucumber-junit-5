package dg.cucumberjunit;

import java.util.HashMap;
import java.util.Map;


public class ScenarioContext {
    private Map<String, Object> scenarioContext;

    public ScenarioContext(){
        scenarioContext = new HashMap<>();
    }

    public void put(String key, Object value) {
        scenarioContext.put(key, value);
    }

    public Object get(String key){
        return scenarioContext.get(key);
    }

    public Boolean contains(String key){
        return scenarioContext.containsKey(key.toString());
    }
}
