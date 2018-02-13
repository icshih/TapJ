module ics.tap {
    requires slf4j.api;
    requires logback.classic;
    requires java.xml.bind;
    exports ics.astro.tap;
    exports ics.astro.tap.utils;
    opens net.ivoa.xml.stc.stc_v1_30;
    opens net.ivoa.xml.uws.v1;
    opens net.ivoa.xml.vodataservice.v1;
    opens net.ivoa.xml.voresource.v1;
    opens net.ivoa.xml.votable.v1;
}