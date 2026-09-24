plugins {
    id("java")
    id("jacoco") // <--- Plugin JaCoCo
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // <--- Dépendances de test indispensables
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation("org.hamcrest:hamcrest:2.2")
    testImplementation("org.mockito:mockito-core:5.11.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.11.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.test {
    useJUnitPlatform() // Permet à Gradle d'exécuter JUnit 5
}

jacoco {
    toolVersion = "0.8.11" // Version compatible Java 21
}