
<h3 class="chapter-number">04</h3>
### General practices

##### Typical sources of trouble

* Component not picked up by component scan
* Configuration classes not picked by component scan
* DI fails to find at least one compatible bean
* DI tries to inject dependency, finds multiple candidates
* ``@Value`` cannot resolve a placeholder / incompatible data(type)

Note:

- Explain how to check component scan parameters

- Explain how to resolve ambiguity in case of multiple DI candidates 
(@Qualifier / @Primary)

- SpringBoot specific: explain how default component scan will only
find stuff relative to the base application class' package, so base
application class should ideally reside in the top-level package

- Explain @Value specifics
- SpringBoot: explain default value pitfalls