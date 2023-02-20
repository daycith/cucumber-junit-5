package dg.cucumberjunit.steps;

import dg.cucumberjunit.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorsSteps {


    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    TestContext context;

//    private String response;

    @When("I fetch authors at {string}")
    public void iFetchAuthorsAt(String uri) {
        String url = uri;
        System.out.println("url 2 => " + url);
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET, null,
                String.class
        );

        context.getScenarioContext().put("response",responseEntity.getBody());
    }

    @Then("I should get a response with {string} message")
    public void iShouldFindAuthors(String expectedMessage) {

        assertEquals(expectedMessage, context.getScenarioContext().get("response"));
    }
}
