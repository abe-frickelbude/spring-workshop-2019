
<h3 class="chapter-number">04</h3>
### General practices

##### Object Graph Composition

* Avoid implementing unnecessary interfaces in components
* Most components can be implemented as concrete classes
* General guideline: prefer composition over inheritance

Note:

* Explain the example with multiple-interfaces-per-component implementation and
injection of said individual interfaces into other components

* Use interfaces only if there is more than one implementation of a component

* Mention that Spring often also features deep class hierarchies
(some of them historical) which strictly speaking violate the
composition-over-inheritance principle