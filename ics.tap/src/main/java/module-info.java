module ics.tap {
    requires slf4j.api;
    requires java.xml.bind;
    exports ics.astro.tap;
    exports ics.astro.tap.parser to ics.tap.test;
    exports ics.astro.tap.internal to ics.tap.test;
    opens net.ivoa.xml.vodataservice.v1;
    opens net.ivoa.xml.uws.v1;
}