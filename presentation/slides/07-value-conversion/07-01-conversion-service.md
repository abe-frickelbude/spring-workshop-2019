
<h3 class="chapter-number">07</h3>
### Value conversion

##### Conversion service

* A central ConversionService allows us to reduce boilerplate 

```yaml
config.fixed.ids = "1,3,45,65,89,112"
```

```Java
@Service
public class ComplexService {
    ...
    @Value("${config.fixed.ids}")
    private Set<Integer> fixedIds
}
```

```Java
@RequestMapping(...)
public UserAccount getUserAccount(@PathParam("id") Long id) {...}
```


Note:
- Explain how the central ConversionService assists in transforming values
- Show an example of ConversionService custom converter integration