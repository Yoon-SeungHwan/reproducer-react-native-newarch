import groovy.lang.Closure
import org.gradle.api.Project

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
// dependencyResolutionManagement {
//     repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//     repositories {
//         google()
//         mavenCentral()
//     }
// }

rootProject.name = "android-rn"
include(":app")
 
includeBuild("../node_modules/@react-native/gradle-plugin")
apply(from = "../node_modules/@react-native-community/cli-platform-android/native_modules.gradle"); (extra["applyNativeModulesSettingsGradle"] as Closure<*>).call(settings)