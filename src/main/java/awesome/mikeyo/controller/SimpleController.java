package awesome.mikeyo.controller;

import com.google.common.collect.Sets;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashSet;

import awesome.mikeyo.model.Thing;

@RestController
@RequestMapping("/api/v1")
public class SimpleController {

    @RequestMapping(path = "/things", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Thing> things() {
        final HashSet<Thing> things = Sets.newHashSet();
        things.add(new Thing()
                .setName("thing")
                .setNumber(15)
                .setValue("value"));
        things.add(new Thing()
                .setName("thing2")
                .setNumber(1500)
                .setValue("thing value 2"));
        return things;
    }
}
