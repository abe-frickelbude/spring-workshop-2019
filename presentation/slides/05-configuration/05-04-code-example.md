
<h3 class="chapter-number">05</h3>
### Configuration

##### Example

```Java
@Configuration
public class ExampleConfiguration {
    @Autowired
    private SimpleService service

    @Value
    private String appName

    @Bean("anotherService")
    public AnotherService anotherService() { ... }

    @Bean("customService")
    public YetAnotherService yetAnotherService() { ... }
}
```

Note:

* Explain bean naming (default and manual)
* Explain the importance of bean names
* Explain @Primary
* Explain effect of bean names on injection and @Qualifier