
<h3 class="chapter-number">02</h3>
### Spring Basics

##### Common component scopes

* Singleton - only one instance of component per app context

```Java
@Component
@Scope("singleton")
class SingletonComponent { ... }
```

* Prototype - new instance created by the container as needed

```Java
@Component
@Scope("prototype")
class FireAndForgetComponent { ... }
```

Note:

* Singleton
  * Typically active during the entire lifecycle
  * Should be stateless (e.g. for thread safety reasons)

* Prototype
  * Typical usage in e.g. a Web application on a per-http-request basis