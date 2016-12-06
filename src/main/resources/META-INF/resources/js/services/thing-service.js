'use strict';

class ThingService {
    constructor(bus) {
        var self = this;
        this.bus = bus;
        this.data = [];
        var endpoint = "http://localhost:8080/api/v1/things";

        $.ajax({
            url : endpoint
        }).then( function(data) {
            self.data = data;
            self.bus.trigger('newThingsEvent', {things : self.data}, true);
        });
    }

}