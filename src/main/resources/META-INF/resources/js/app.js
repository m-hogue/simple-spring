'use strict';

var bus = riot.observable();
var thingService = new ThingService(bus);
var isMounted = false;

bus.on('newThingsEvent', function(param) {
    if(!isMounted) {
        riot.mount('jumbotron', {bus : bus, things : param.things});
        isMounted = true;
    }
});