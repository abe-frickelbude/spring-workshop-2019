
<h3 class="chapter-number">02</h3>
### Spring Basics

##### DI annotations

```Java
@Configuration 
class ComponentConfiguration {
  
  @Bean("custom")
  ExampleComponent component1() { ... }

  @Bean
  ExampleComponent component2() { ... }
}
```

```Java
class ExampleService {
  @Autowired
  @Qualifier("custom")
  private ExampleComponent component
}
```

Note:

* @Autowired injects dependencies
* Beans can be named during definition
* @Qualifier (in conjunction with @Autowired) specifies an concrete *named* dependency to be injected
* @Primary (in @Bean / component definitions) defines the primary component instance
  * This is the one injected by @Autowired in absence of a @Qualifier if multiple candidates exist