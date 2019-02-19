
<h3 class="chapter-number">08</h3>
### Testing

##### Spring Boot bean mocks

* SpringBoot provides a convenient ``@MockBean`` annotation
* Such mocks replace already declared beans in an app context
* Can still specify mock behavior if desired
* Can be used to selectively "disable" specific components

```Groovy
@Configuration
class TestConfiguration {

    @MockBean
    private RssClient rssClient //replaces the "real" RSS client
}
```

Note:

- Explain basic usage
- Explain how this can be used to "unit test" a component while still using DI
- Explain how this can be used to e.g. deal with problematic but irrelevant PROD code