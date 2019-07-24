package com.example;

import io.micronaut.runtime.Micronaut;

/**
 * Example of a broken app with Statsd Micrometer registry.
 *
 * @author Enrique Zamudio
 * Date: 2019-07-23 20:11
 */
public class Application {
    public static void main(String... args) {
        Micronaut.run(Application.class, args);
    }
}
