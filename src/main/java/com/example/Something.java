package com.example;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * A component with a metric from the global registry. This breaks everything.
 *
 * @author Enrique Zamudio
 * Date: 2019-07-23 20:17
 */
@Controller
public class Something {

    private final Timer timer = Metrics.timer("broken.timer");

    @Get("/hello")
    public String run() {
        return timer.record(() -> "hello!");
    }
}
