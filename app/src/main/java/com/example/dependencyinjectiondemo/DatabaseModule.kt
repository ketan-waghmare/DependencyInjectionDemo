package com.example.dependencyinjectiondemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabaseAdapter() : DatabaseAdapter {
        return DatabaseAdapter(DatabaseService())
    }
}