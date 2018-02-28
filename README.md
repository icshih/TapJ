# TapJ
TapJ is a tools to query astronomical data using directly ADQL* on various data centres via TAP* service.

Supported data centres:

- GACS/Gaia
- VizieR

Rather than using some helper functions to select data, like in *Astroquery*, you pass the completed ADQL string to either Synchronous or Asynchronous job.

*ADQL: Astronomical Data Query Language

*TAP: Table Access Protocol