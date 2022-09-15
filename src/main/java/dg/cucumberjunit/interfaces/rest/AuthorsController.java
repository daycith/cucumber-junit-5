package dg.cucumberjunit.interfaces.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorsController {

    @GetMapping(value = "/v1/authors")
    public String getAllAuthors(){
        return "ok";
    }
}
