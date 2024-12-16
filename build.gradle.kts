plugins {
	id("dev.frozenmilk.library") version "10.1.1-0.0.0"
	id("org.jetbrains.dokka") version "1.9.20"
	id("maven-publish")
}

android {
	namespace = "com.pedropathing.pedropathing"

	publishing {
		singleVariant("release") {
			withSourcesJar()
			withJavadocJar()
		}
	}
}

ftc {
	kotlin

	sdk {
		appcompat
		RobotCore
		FtcCommon
	}
}

repositories {
	maven("https://maven.brott.dev/")
}

dependencies {
	implementation("com.acmerobotics.dashboard:dashboard:0.4.16") {
		exclude(group = "org.firstinspires.ftc")
	}
	implementation("org.apache.commons:commons-math3:3.6.1")
}


// CONFIGURE PUBLICATION
publishing {
	publications {
		register<MavenPublication>("release") {
			groupId = "com.pedropathing"
			artifactId = "pedro"
			version = "0.0.0"

			afterEvaluate {
				from(components["release"])
			}
		}
	}

	repositories {
		maven {
			name = "publishing"
			url = uri("INSERT_URL_HERE")
		}
	}
}
