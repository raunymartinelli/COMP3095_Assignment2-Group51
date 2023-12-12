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
    implementation("io.zipkin.reporter2:zipkin-reporter-brave:2.16.4")
    implementation("io.micrometer:micrometer-tracing-bridge-brave:1.1.4")
	implementation("io.micrometer:micrometer-observation:1.11.3")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-security:3.1.6")
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:4.0.8")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server:3.1.6")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.0.3")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
