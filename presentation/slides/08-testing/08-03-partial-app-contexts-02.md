
<h3 class="chapter-number">08</h3>
### Testing

##### Partial application contexts

A test can be its own application context!

```Groovy
@ContextConfiguration
@SpringBootTest(classes = SelfContainedTest.class)
class SelfContainedTest {
    
    @Bean
    UserDataRepository repository() {
        return new UserDataRepository()
    }

    @Autowired
    private UserDataRepository testSubject

    def "Test repository operations" () { ... }
}
```


Note:

- Explain how a test can bootstrap its own configuration
- Show an example of a self-contained test