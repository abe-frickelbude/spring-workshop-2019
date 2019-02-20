
<h3 class="chapter-number">04</h3>
### General practices

##### Basics

* Use the app context effectively
* Configure components using annotations
* Use specific stereotype annotations (e.g. @Service)
* Use DI where ever appropriate / possible
* Stick to Spring's DI annotations

Note:

* General
  * StackOverflow is a useful resource
* Package structure
  * Group configuration, services, controllers etc into packages
  * A recommendation rather than a requirement

* Specific stereotypes help document a component's intent more clearly
* Specific annotations also enable certain behind-the-scenes features (e.g. @Repository)
* Let the app context do most of the heavy weightlifting

* DI  
  * There's nothing magical about DI - learn to use it effectively
  * Exercise patience when reading Spring documentation
  * do not mix with javax.inject
  * DI can be used as glue between any components which are not static (i.e. in PermGen space)
  * Leverage DI to
    * Reduce component construction / initialization overhead
    * Improve heap utilization and runtime performance
