# Solving The Conflict In XJC Binding

**Problem**

Trying to parse the W3C schema to Java objects with **xjc**.

    $xjc VOTable-v1.2.xsd


    parsing a schema...
    [ERROR] Property "Value" is already defined. Use &lt;jaxb:property> to resolve this conflict.
      line 39 of jar:file:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/tools.jar!/com/sun/xml/internal/xsom/impl/parser/datatypes.xsd

    [ERROR] The following location is relevant to the above error
      line 208 of file:/Users/icshih/Programs/projects/TapJ/ics.tap/src/main/resources/VOTable-v1.2.xsd

**Solution**

See stackoverflow's [discussion](https://stackoverflow.com/questions/4394134/jaxb-property-value-is-already-defined-use-jaxbproperty-to-resolve-this#4394185)

First creating a binding file, **site-template.xjb**, then run

    $xjc -d ${TapJ}/ics.tap/src/main/java VOTable-v1.2.xsd -b site-template.xjb

