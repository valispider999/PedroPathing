plugins {
	id("org.jetbrains.kotlin.android") version "1.9.20"
	id("com.android.library") version "8.1.2"

	`maven-publish`

	id("org.jetbrains.dokka") version "1.9.20"
}

repositories {
	mavenCentral()
	google()
	maven("https://maven.brott.dev/")
}

android {
	namespace = "com.pedropathing.pedropathing"
	compileSdk = 32

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	publishing {
		singleVariant("release")
	}
	sourceSets {
		getByName("main") {
			java.srcDirs("src/main/kotlin")
		}
	}
}

dependencies {
	compileOnly("org.firstinspires.ftc:RobotCore:10.1.1")
	compileOnly("org.firstinspires.ftc:Hardware:10.1.1")
	compileOnly("org.firstinspires.ftc:FtcCommon:10.1.1")
	compileOnly("org.firstinspires.ftc:RobotServer:10.1.1")
	compileOnly("org.firstinspires.ftc:OnBotJava:10.1.1")

	implementation("com.acmerobotics.dashboard:dashboard:0.4.16") {
		exclude(group = "org.firstinspires.ftc")
	}

	implementation("org.apache.commons:commons-math3:3.6.1")

	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.20")
}


// CONFIGURE PUBLICATION
publishing {
	publications {
		register<MavenPublication>("release") {
			groupId = "com.pedropathing"
			artifactId = "pedro"
			version = "0.0.1-beta5"

			afterEvaluate {
				from(components["release"])
			}
		}
	}

	repositories {
		maven {
			name = "publishing"
			url = uri("./maven.pedropathing.com")
		}
	}
}