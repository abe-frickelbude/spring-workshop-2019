
<h3 class="chapter-number">09</h3>
### Constructor injection 

##### Alternatives

<h6 class="callout-right">NICE!</h6>
```Java
class Rebel {
    @Autowired
    private Gork gork
    @Autowired
    private Mork mork
}
```
```Java
class Rebel {
    private Gork gork
    private Mork mork

    @Autowired
    public void setGork(final Gork gork) { this.gork = gork }

    @Autowired
    public void setMork(final Mork mork) { this.mork = mork }
}
```

Note:

- Explain that in both cases the fields may no longer be final (
    impact on immutability -> but we really don't give a damn here!)
- Setter injection is not used very often (historical reasons?)   