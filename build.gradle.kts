plugins {
    kotlin("jvm") version "2.0.0"
}

group = "me.motyim.learn"
version = "2.0-SNAPSHOT"
description = "ProblemSolve"

java{
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    api("org.assertj:assertj-core:3.24.2")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.71")
    testImplementation("junit:junit:4.13.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.5.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}