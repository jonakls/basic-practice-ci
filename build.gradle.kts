plugins {
    id("java")
}

group = "top.jonakls"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks {
    jar {
        manifest {
            attributes["Main-Class"] = "top.jonakls.practiceci.Main"
        }

        archiveBaseName.set("PracticeApp")
    }
}

tasks.test {
    useJUnitPlatform()
}