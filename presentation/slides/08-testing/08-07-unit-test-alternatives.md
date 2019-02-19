
<h3 class="chapter-number">08</h3>
### Testing

##### Alternatives to unit testing

* Use Spring tests with minimal app contexts instead
* Only marginally slower than "real" unit tests
* Does not significantly diminish the quality of the tests
* DI still works, so we don't have to simulate it
* Best of both worlds: mock DI dependencies before injection


Note:

- Explain how retaining the DI capabilities simplifies test development

- Explain how careful configuration can help approach the controlled 
conditions of a "real" unit test

- Explain why this alternative approach does not significantly detract
from the quality of the tests