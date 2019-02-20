
<h3 class="chapter-number">03</h3>
### Spring Boot

##### HOW DOES IT WORK?

<img src="images/spring_boot_internals.svg" class />

Note:

* Predefined base application class (SpringApplication) provides core SpringBoot functionality
* Generic annotation-driven auto-configuration mechanism
* Uses specialized bean(factory) post-processing to automatically and intelligently specify beans
required by a particular use case
* [Third-party] framework integration typically provided by a _*-starter"_ JAR dependency
  * e.g. spring-boot-web-starter for Spring WebMVC integration
* In simple use cases, only requires a starter JAR and perhaps a few configuration annotations