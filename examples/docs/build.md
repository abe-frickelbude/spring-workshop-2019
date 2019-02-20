
# Gradle Build

## General

## Notes

* Gradle doesn't have an "inherit-from-parent-POM-kind-of-thing" feature, so the Spring BOM dependency
  management is instead provided by the ``io.spring.dependency-management`` plugin instead

* Transitive dependency exclusion mechanism is discussed here !(https://discuss.gradle.org/t/how-do-i-exclude-specific-transitive-dependencies-of-something-i-depend-on/17991/5)

* The exclusion of commons-logging from Spring dependencies forces Spring internals to delegate their
  internal logging to SLF4J - we get a neat common output

* commons-lang and commons-collections are generally included for best practice

* Dependency configuration syntax example:
  
    ```Groovy
        implementation( "org.springframework.boot:spring-boot-starter") {
            exclude group: 'commons-logging', module: 'commons-logging'
        }
    ```