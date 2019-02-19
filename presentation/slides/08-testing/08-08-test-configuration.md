
<h3 class="chapter-number">08</h3>
### Testing

##### Configuration

* Use separate configuration for tests
* SpringBoot supports a separate application.yml out-of-the-box
* Can provide additional configuration classes if desired

```Groovy
@ContextConfiguration
@SpringBootTest(classes = [
    TestConfiguration.class, 
    CustomConfiguration.class, 
    ExtraConfiguration.class
])
class CustomConfiguredSpec {

}
```
Note:

- Show an example
- Explain custom helper classes and alternative component 
implementations created specifically for testing