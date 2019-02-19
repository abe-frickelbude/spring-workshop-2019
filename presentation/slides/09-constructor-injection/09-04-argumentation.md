
<h3 class="chapter-number">09</h3>
### Constructor injection

##### Argumentation

###### But what about tests?

* Write your tests to serve your code, and not another way around
* Mock injection / Spring-based tests help with field injection
* Resulting tests only marginally more complex than "pure" unit tests


Note:

-  Explain how mock injection / usage of partial/minimal app contexts help
alleviate the perceived deficiencies of field-based injection

- Explain how the additional effort is still worth it w.r.t to simpler
subsequent code modifications and refactoring

- Make a case for: "Pick whichever method you consider the most appropriate and
stick with it - don't mix different injection methods in your code"

- Reiterate that there's no need for javax.inject