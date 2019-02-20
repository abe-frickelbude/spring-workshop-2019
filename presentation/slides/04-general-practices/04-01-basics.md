
<h3 class="chapter-number">04</h3>
### General practices

##### Basics

* Use the app context effectively
* Configure components using annotations
* Use specific stereotype annotations (e.g. @Service)
* Use DI where ever appropriate / possible
* Leverage DI

Note:

* Specific stereotypes help document a component's intent more clearly
* Specific annotations also enable certain behind-the-scenes features (e.g. @Repository)
* Let the app context do most of the heavy weightlifting
* Leverage DI to
  * Reduce component construction / initialization overhead
  * Improve heap utilization and runtime performance

* Package structure
  * Group configuration, services, controllers etc into packages
  * A recommendation rather than a requirement