
<h3 class="chapter-number">02</h3>
### Spring Basics

##### Spring DI - how does it work?

<img src="images/spring_di_context_internals.svg" class="large"/>

Note:

1. Component scan identifies bean candidates
2. Beans are registered in app context
 * Explicitly configured beans are also added
3. BeanFactoryPostProcessors transform bean definitions as required
4. When a bean instance is requested:
  * The app context's BeanFactory creates a bean
  * BeanPostProcessors perform any specific initialization
  * DI and configuration are actually performed by specialized BeanPostProcessors
5. The resulting configured bean references are stored in the bean registry
6. The bean instance is returned by the context

