
<h3 class="chapter-number">08</h3>
### Testing

##### Unit tests

* Java -> Use Mockito ``@Mock`` and ``@InjectMocks`` mechanisms
* If using constructor injection, can provide mocks explicitly

```Java
class ConfusedOrk {  
    @Autowired private Gork gork
    @Autowired private Mork mork
}
```
```Java
class ConfusedOrkTest {
    @Mock
    private Gork gork
    @Mock
    private Mork mork

    @InjectMocks
    private ConfusedOrk ork = new ConfusedOrk()
}
```

Note:
 - Explain basic usage and show examples
 - (Touch on constructor injection issues here? or later?)
