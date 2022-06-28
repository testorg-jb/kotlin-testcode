import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
    id("org.sonarqube") version "3.4.0.2513"
}

sonarqube {
    properties {
        property("sonar.projectKey", "testorg-jb_kotlin-testcode")
        property("sonar.organization", "testorg-jb")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

group = "de.esnail.misc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}
