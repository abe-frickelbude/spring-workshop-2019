
<h3 class="chapter-number">02</h3>
### Spring Basics

##### Constructor-based DI

```Java
@Service
public class MyService {
    private final Part1 part1 // can now be immutable!
    private final Part2 part2 // ditto
    private final Integer param

    public MyService(final Part1 part1, final Part2 part2,
                    @Value("${app.param}") final Integer param) {
        this.part1 = part1
        this.part2 = part2
        this.param = param
    }
}
```

Note:

* Explain why immutability is useful in composition
* Explain other DI forms - how does constructor DI compare?
* Make a case for: "Pick whichever method you consider the most appropriate and
stick with it - don't mix different injection methods in your code"