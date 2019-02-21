
<h3 class="chapter-number">10</h3>
### Pros and Cons

##### Disadvantages

* Somewhat unsuitable for Java beginners
* Notorious for using "too much magic"
* DI is reflection-based - slow application start-up
* Excessive overhead in case of very simple product requirements
* Results in rather large binaries

Note:

* Not for beginners: explain why Spring requires prior technical experience
(i.e. core framework difficult to comprehend at first glance etc.)
* Magic: explain why it is not really the case (opinionated!)
* Explain why in case of very simple implementations (e.g a microservice) the
overhead may be excessive
* Explain when and when not to use Spring