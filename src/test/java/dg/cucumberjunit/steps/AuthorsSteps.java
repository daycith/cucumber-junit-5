package dg.cucumberjunit.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorsSteps {


    @Autowired
    private TestRestTemplate restTemplate;

    private String response;

    @When("I fetch authors at at {string}")
    public void iFetchAuthorsAtAt(String uri) {
        String url = uri;
        System.out.println("url => " + url);
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET, null,
                String.class
        );

        response = responseEntity.getBody();
    }

    @Then("I should get a response with {string} message")
    public void iShouldFindAuthors(String expectedMessage) {

        assertEquals(expectedMessage, response);
    }
}
