/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.4.2/samples
 */

description = """
DevOps - Logbook 2
Example Gradle project demonstrating the Gradle build lifecycle.
Project name: ${project.name}
"""

println("This is executed during the configuration phase")

task("Startconfig") {
    println("Where Startconfig happens?")
    doLast {
        println("Startconfig is executed")
    }
}



tasks.register("configuration") {
    println("Where configuration happens?")
}


tasks.register("test") {
    doLast {
        println("Where test happens?")
    }
}


tasks.register("cleanUp") {
    doFirst {
        println("Where dofirst cleanUp happens?")
    }
    
    doLast {
        println("Where dolast cleanUp happens?")
    }
}