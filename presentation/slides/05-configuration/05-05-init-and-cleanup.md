
<h3 class="chapter-number">05</h3>
### Configuration

##### Component initialization and cleanup

* Hooks for initialization and cleanup code
* Invoked automatically by the bean factory
* Prefer this to legacy InitializingBean and DisposableBean interfaces

```Java
@Component
class BadMoonService {

    @PostConstruct
    public void init() { ... }

    @PreDestroy
    public void cleanup() { ... }
}
```

Note:

* Explain how these methods can also be private -> prevents exposure of implementation
details into the component's API
* Example