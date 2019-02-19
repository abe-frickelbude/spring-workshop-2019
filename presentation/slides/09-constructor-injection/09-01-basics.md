
<h3 class="chapter-number">09</h3>
### Constructor injection 

##### Basics

```Java
@Component
public class ReligiousDogma {

    private final Gork gork
    private final Mork mork
    private final boolean trueBeliever

    @Autowired
    public ReligiousDogma(final Gork gork, final Mork mork,
    @Value("${config.believer}") final boolean trueBeliever) {
        this.gork = gork
        this.mork = mork
        this.trueBeliever = trueBeliever
    }
}
```

... What are the implications? Are there any alternatives?

Note:

- Show why this pattern doesn't scale well with increasing DI complexity
- Show why modifying such classes incurs messy refactoring