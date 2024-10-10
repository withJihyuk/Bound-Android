object Dependency {

    object Coil {
        const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"
    }

    object Retrofit {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    }

    object OkHttp {
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
        const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
    }

    object Hilt {
        const val HILT_PLUGIN = "com.google.dagger.hilt.android"
        const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
        const val HILT_NAVIGATION_FRAGMENT = "androidx.hilt:hilt-navigation-fragment:${Versions.HILT_NAVIGATION}"
        const val HILT_NAVIGATION_COMPOSE = "androidx.hilt:hilt-navigation-compose:${Versions.HILT_NAVIGATION}"
    }

    object DataStore {
        const val PREFERENCES = "androidx.datastore:datastore-preferences:${Versions.PREFERENCES}"
    }

    object Moshi {
        const val MOSHI = "com.squareup.retrofit2:converter-moshi:${Versions.MOSHI_CONVERTER}"
        const val MOSHI_CONVERTER = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"
        const val MOSHI_CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.MOSHI}"
    }

    object Material3 {
        const val MATERIAL3 = "implementation \"androidx.compose.material3:material3:${Versions.MATERIAL3}"
    }

}