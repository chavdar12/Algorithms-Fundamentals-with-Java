// Only leaf modules carry sources; the 005/006 parent folders are plain containers.
configure(subprojects.filter { it.file("src").isDirectory }) {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    extensions.configure<JavaPluginExtension> {
        toolchain.languageVersion = JavaLanguageVersion.of(25)
        sourceSets.named("test") {
            java.srcDir(rootProject.file("test-support"))
        }
    }

    dependencies {
        "testImplementation"(platform("org.junit:junit-bom:6.0.0"))
        "testImplementation"("org.junit.jupiter:junit-jupiter")
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        // The programs keep state in static fields, so every test class gets a fresh JVM.
        forkEvery = 1
    }
}
