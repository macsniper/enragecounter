package com.enragecounter;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class EnragecounterApplication extends Application<EnragecounterConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EnragecounterApplication().run(args);
    }

    @Override
    public String getName() {
        return "enragecounter";
    }

    @Override
    public void initialize(final Bootstrap<EnragecounterConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final EnragecounterConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
