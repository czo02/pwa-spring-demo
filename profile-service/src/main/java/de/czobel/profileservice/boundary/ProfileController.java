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
        Profile jack = new Profile("Jack", "Hi, my name is Jack :)");
        profiles.put(jack.getName(), jack);
        Profile tom = new Profile("Tom", "Hi, my name is Tom");
        profiles.put(tom.getName(), tom);
        Profile jim = new Profile("Jim", "Hi, my name is Jim. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        profiles.put(jim.getName(), jim);
        Profile walter = new Profile("Walter", "Hi, my name is Walter. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        profiles.put(walter.getName(), walter);
        Profile jane = new Profile("Jane", "Hi, I'm Jane", "https://de9xxjhuq2c2j.cloudfront.net/apps/live-20180516-1/images/emoji/emoji-android/1f603.png");
        profiles.put(jane.getName(), jane);
    }

    @GetMapping(value = "/api/profiles")
    @ResponseBody
    public ResponseEntity getProfiles() {
        return new ResponseEntity<>(profiles.values(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/profile/like/{name}")
    @ResponseBody
    public ResponseEntity likeProfile(@PathVariable final String name) {
        Profile profile = profiles.get(name);
        if (profile == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        profile.addLike();
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }
}
