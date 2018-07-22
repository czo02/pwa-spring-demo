package de.czobel.profileservice.boundary;

import de.czobel.profileservice.entity.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProfileController {

    private final Map<String, Profile> profiles;

    public ProfileController() {
        profiles = new HashMap<>();
        Profile jack = new Profile("Jack", "Hi, my name is Jack :)", "user.svg");
        profiles.put(jack.getName(), jack);
        Profile jane = new Profile("Jane", "Hi, I'm Jane", "user.svg");
        profiles.put(jane.getName(), jane);
    }

    @GetMapping(value = "/api/profiles")
    @ResponseBody
    public ResponseEntity getProfiles() {
        return new ResponseEntity<>(profiles.values(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/profiles/{name}")
    @ResponseBody
    public ResponseEntity getProfileByName(@PathVariable final String name) {
        Profile profile = profiles.get(name);
        if (profile == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }
}
