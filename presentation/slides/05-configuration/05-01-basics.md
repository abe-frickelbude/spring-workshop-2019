
<h3 class="chapter-number">05</h3>
### Configuration

##### Basics

* Learn various out-of-the-box annotations
* Use configuration classes
* Group related configuration into separate classes
* Do not repeat "global" configuration (e.g. @EnableScheduling)

Note:

* Don't repeat "global" configuration
  * Helps reduce confusion
  * Multiple occurrences of such annotations are generally ignored by the app context
* Do *not* test config classes - this is downright silly!
* Core annotations are often meta-annotated and activate several things simultaneously
