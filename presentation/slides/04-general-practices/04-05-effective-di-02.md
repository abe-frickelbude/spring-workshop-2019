
<h3 class="chapter-number">04</h3>
### General practices

##### Effective DI

```Java
@Configuration
public class JacksonConfiguration {
    @Bean
    public ObjectMapper defaultMapper() {
        final ObjectMapper mapper = new ObjectMapper()
        mapper.enable(SerializationFeature.INDENT_OUTPUT)
        return mapper
    }
}
```

```Java
@Service
public class DataSerializer  {
    @Autowired
    private ObjectMapper mapper
}
```

Note:
- Explain advantages of this approach
- Configuration of a singleton can be conveniently centralized

