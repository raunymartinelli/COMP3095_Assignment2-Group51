plugins {
	java
	id("org.springframework.boot") version "3.1.6"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "ca.gbc"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-security:3.1.6")
    implementation("io.micrometer:micrometer-observation:1.11.3")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("io.zipkin.reporter2:zipkin-reporter-brave:2.16.4")
    implementation("io.micrometer:micrometer-tracing-bridge-brave:1.1.4")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server:4.0.3")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
