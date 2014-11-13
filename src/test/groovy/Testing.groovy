package com.ideas

import spock.lang.Specification


class Testing extends Specification {

def "I will greet you"(){
    given : 'a greeter'
        def greeter = new Greeter();

    when : 'i want to greet'
        def message = greeter.greet('Harry')

    then : 'harry must be greeted'
        message == 'Hello Harry'
}

}
