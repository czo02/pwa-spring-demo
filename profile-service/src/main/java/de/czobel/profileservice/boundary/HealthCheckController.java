package de.czobel.profileservice.boundary;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * For running on app engine
 */
@Controller
public class HealthCheckController {

    @RequestMapping(value = "/_ah/health")
    public ResponseEntity health() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
