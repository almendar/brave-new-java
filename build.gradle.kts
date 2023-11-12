plugins {
    java
    application
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

application {
    mainClass.set("org.example.Main")
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("redis.clients:jedis:5.0.2")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation ("org.testcontainers:testcontainers:1.18.0")
    testImplementation ("org.testcontainers:junit-jupiter:1.18.0")



}

tasks.test {
    useJUnitPlatform()
}