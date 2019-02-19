
<h3 class="chapter-number">05</h3>
### Configuration 

##### Code-based

```Java
@Configuration
public class ExampleConfiguration {

    @Autowired
    private AnotherMek anotherMek

    @Value
    private String mekName

    @Bean("mek")
    public Mek mek() { ... }

    @Bean("BigMek")
    public BigMek bigMek() { ... }
}
```

Note:
- Explain bean naming (default and manual)
- Explain the importance of bean names
- Explain @Primary 
- Explain effect of bean names on injection and @Qualifier 