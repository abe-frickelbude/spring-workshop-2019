
<h3 class="chapter-number">08</h3>
### Testing

##### Unit tests

* Groovy / Spock -> can set fields directly
* Groovy ignores the visibility barrier on private fields

```Java
class ConfusedOrk {  
    @Autowired private Gork gork
    @Autowired private Mork mork
}
```
```Groovy
class ConfusedOrkSpec {
    def "test confusion" () {
        Gork gork = mock(Gork)
        Mork mork = mock(Mork)

        ConfusedOrk testSubject = new ConfusedOrk()
        testSubject.gork = gork
        testSubject.mork = mork
    }
}
```

Note:

- Show an example
- Explain 
- TODO: check groovy actually ignores the visibility barrier