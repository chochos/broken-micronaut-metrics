# Broken Micronaut metrics
Demo of broken metrics in Micronaut 1.1.4

Build this project and run it; it won't start because it complains about two possible candidates for some bean related to micrometer.

Set the version to 1.1.4 in `ext.mn` variable in the build file, `clean build` and then run it again, and it works.
