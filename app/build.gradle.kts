/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.4.2/samples
 */

description = """
DevOps - Logbook 2
Example Gradle project demonstrating the Gradle build for a Java application.
Project name: ${project.name}
"""

plugins {
    //Apply the application plugin for building java applications
    application
}

repositories {
    //Use the Maven Central repository for all the dependencies
    mavenCentral()
}

dependencies {
    //Add the dependencies for the application
    //TestNG is used for unit testing
    testImplementation("org.testng:testng:7.4.0")

    //Google Guava is used for utility classes
    testImplementation("com.google.guava:guava:30.0-jre")
}

application {
    //Define the main class for the application
    mainClass.set("logbook2.CalcApp")
}

tasks.test{
    //Use TestNG to run the tests
    useTestNG()
}