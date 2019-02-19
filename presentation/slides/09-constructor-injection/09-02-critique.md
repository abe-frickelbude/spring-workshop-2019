
<h3 class="chapter-number">09</h3>
### Constructor injection 

##### Critique

* Adding dependencies requires constructor signature modification
* Constructor parameter list becomes unwieldy
* May be difficult to handle in tests

<h6 class="callout-right">MEH...!</h6>
```Java
@Autowired
public ReligiousDogma(final Gork gork, 
    final Mork mork,
    final GorkService gorkService, 
    final MorkService morkService,
    @Value("${config.gork-believer}") final boolean believesInGork,
    @Value("${config.mork-believer}") final boolean believesInMork,
    @Value("${config.true-believer}") final boolean trueBeliever) {
    ...
}
```

Note:

- Explain both cons AND pros! (e.g. compile-time safety in tests) 