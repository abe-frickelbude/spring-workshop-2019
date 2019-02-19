
<h3 class="chapter-number">06</h3>
### Application profiles

##### Profile-dependent context initialization

* Annotation-driven application profiles
* Names correspond to those in application.yml
* Use -Dspring.profiles.active=[profiles] to switch profiles 

```Java
@Profile("prod")
@Component
public class ProdOnlyComponent { ... }

@Profile("dev")
@Component
public class DevOnlyComponent { ... }

```

Note:

- Explain profiles 
- Explain default profile
- Explain use case for local development