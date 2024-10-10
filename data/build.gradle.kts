plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("com.google.devtools.ksp")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(Dependency.Retrofit.RETROFIT)
    implementation(Dependency.Retrofit.RETROFIT_CONVERTER_GSON)
    implementation(Dependency.OkHttp.OKHTTP)
    implementation(Dependency.OkHttp.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Dependency.Moshi.MOSHI)
    implementation(Dependency.Moshi.MOSHI_CONVERTER)
    ksp(Dependency.Moshi.MOSHI_CODEGEN)
    implementation(Dependency.DataStore.PREFERENCES)
}