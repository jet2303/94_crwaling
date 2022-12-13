/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.3/userguide/building_java_projects.html
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")

    implementation("org.jsoup:jsoup:1.15.3")

    //stringutils
    // implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.12.0'
    implementation ("org.apache.commons:commons-lang3:3.12.0")
    
    implementation ("com.googlecode.json-simple:json-simple:1.1.1")
}

application {
    // Define the main class for the application.
    mainClass.set("_crwaling.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}