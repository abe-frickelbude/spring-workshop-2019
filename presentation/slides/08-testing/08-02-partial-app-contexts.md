
<h3 class="chapter-number">08</h3>
### Testing

##### Partial application contexts

* Useful for isolating component tests 
* Useful for avoiding full app initialization
* Can improve test execution performance

```Groovy
@Configuration
//@SpringBootApplication
class TestContext { ... }
```

```Groovy
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestContext.class)
class CustomComponentTest { ... }
```

```Groovy
@SpringBootTest(classes = TestContext.class)
@ContextConfiguration // don't forget this!
class CustomComponentTest { ... }
```

Note:

- Explain advantages of partial context w.r.t to problematic init of PROD-only code
- Show an example of a partial test context (i.e. in EbonService)
- Show how to use
- Explain pros/cons