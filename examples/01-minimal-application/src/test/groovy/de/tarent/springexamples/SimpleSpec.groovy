package de.tarent.springexamples

import spock.lang.Specification

class SimpleSpec extends Specification {

    def "spock works ok" () {
        expect:
        true == true
    }
}
