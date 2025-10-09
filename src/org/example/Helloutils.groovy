package org.example

class Helloutils implements Serializable {

    def script

    Helloutils(script) {
        this.script = script
    }

    def sayHelloJenkins() {
        script.echo("Hello Jenkins")
    }
}
