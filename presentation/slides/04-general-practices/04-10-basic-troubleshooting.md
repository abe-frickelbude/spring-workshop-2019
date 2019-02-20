
<h3 class="chapter-number">04</h3>
### General practices

##### Troubleshooting

##### HELP!!!

<img src="images/looney_toons_taz.png" alt="Angry Taz" class="float-right" />

* Spring app context provides good error messages
* SpringBoot provides _even better_ error messages
* Don't be afraid to debug _into_ the framework code
* Be aware of "cascading" failures during DI

Note:

* Explain some basic mistakes (e.g. injection of unknown / improperly configured dependencies)
* Explain a typical cascading failure in DI (i.e. cannot inject a dependency
 because something IN it cannot be properly initialized)