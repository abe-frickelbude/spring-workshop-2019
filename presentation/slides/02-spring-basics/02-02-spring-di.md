
<h3 class="chapter-number">02</h3>
### Spring Basics

##### Spring  DI implementation

* Application context serves as central "bean registry"
* Strongly annotation-driven
* Opinionated

```java
@Service
class SimpleService {
  
  @Autowired
  private AnotherComponent component

  @Value
  private Integer configValue
}
```

Note:

* Can transform component code to enhance / modify behavior
  * Powerful support for "cross cutting concerns"
  * Uses AOP / dynamic proxies

* Compatible with JSR-330 (javax.inject)
* Internally based on reflection
  * Can dynamically scan packages for eligible components
  * Fairly high application start-up times  