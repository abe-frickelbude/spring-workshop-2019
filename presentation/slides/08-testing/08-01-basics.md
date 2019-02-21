
<h3 class="chapter-number">08</h3>
### Testing

##### Basics

* Special JUnit runner for creating an app context
* Tests become Spring beans - can use DI, configuration etc.

```Java
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestContext.class)
class AccountServiceTest {
    @Autowired
    private AccountRepository accountRepository

    @Value("${config.test.id}")
    private Integer testId

    @Test
    public void testLoad() {...}
}
```

Note:

* Show an example of Spring-enabled test
* Explain difference to @SpringBootTest - what are the specifics?
* Not limited to JUnit - Groovy / Spock work well, too
