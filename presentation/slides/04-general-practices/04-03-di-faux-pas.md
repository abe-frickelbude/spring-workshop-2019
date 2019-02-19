
<h3 class="chapter-number">04</h3>
### General practices 

##### Dependency Injection Faux-pas

###### Don't do this!!!

```Java
@Autowired
public BadHakz(Comp1 comp1, Comp2 comp2, 
               @Value("${params.param1}") String param1) {
                   
    this.comp1 = Objects.requireNonNull(comp1, "comp1 can't be null!")
    this.comp2 = Objects.requireNonNull(comp2, "comp2 can't be null!")
    this.param1 = Objects.requireNonNull(param1, "param1 can't be null!")
}
```
<h6 class="callout-right">PFUI!</h6>
```Groovy
def "Dependency injection works as expected" () {
    ...
    when:
    def hakz = BadHakz(mock1, null, "test")

    then:
    thrown(NullPointerException ex)
}
```

Note:

- Also explain why the interface-per-component mess is not necessary in general

- Make a case for "Either you trust Spring to do its job properly, or you don't. 
If you don't - don't use Spring!"