package com.palominolabs.metrics.guice;

import com.codahale.metrics.annotation.Gauge;

public class InstrumentedWithGauge {
    @Gauge(name = "things")
    public String doAThing() {
        return "poop";
    }

    @Gauge
    public String doAnotherThing() {
        return "anotherThing";
    }

    @Gauge(name = "absoluteName", absolute = true)
    public String doAThingWithAbsoluteName() {
        return "anotherThingWithAbsoluteName";
    }
}
