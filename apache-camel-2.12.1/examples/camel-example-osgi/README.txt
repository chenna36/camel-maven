OSGi Example
=====================

This example shows how use OSGi with Camel. It can be run using Maven.

Running from cmd line outside OSGi container
============================================

You will need to compile this example first:
  mvn compile

To run the example using Maven type
  mvn camel:run

To stop the example hit ctrl + c

Running inside OSGi container
=============================

You will need to compile and install this example first:
  mvn install

If using Apache Karaf / Apache ServiceMix you can install this example
from the shell using this example's "features.xml" for easy provisioning.

  features:addUrl mvn:org.apache.camel/camel-example-osgi/2.12.1/xml/features
  features:install camel-example-osgi

The example outputs to the log, which you can see using

  log:display

... or you can tail the log with

  log:tail

And use ctrl+c to break the tail.

If you hit any problems please let us know on the Camel Forums
  http://camel.apache.org/discussion-forums.html

Please help us make Apache Camel better - we appreciate any feedback you
may have.  Enjoy!

------------------------
The Camel riders!