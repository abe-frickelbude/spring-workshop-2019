
<h3 class="chapter-number">04</h3>
### General practices 

##### Effective DI

###### Prefer singleton Spring beans over static references

```Java
public class DataSerializer {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
    ...

    public String serialize() {
        return OBJECT_MAPPER
          .writerWithDefaultPrettyPrinter().writeValueAsString(...)
    }
}
```

Note:

- Explain reasonable use of DI to avoid the statics mess
- Explain that it is perfectly OK for a Singleton component to
manage its own internal structure