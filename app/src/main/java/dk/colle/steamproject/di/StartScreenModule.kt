package dk.colle.steamproject.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dk.colle.steamproject.BuildConfig
import dk.colle.steamproject.startscreen.data.AllGamesService
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesUseCase
import dk.colle.steamproject.startscreen.data.usecase.impl.GetAllGamesUseCaseImpl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object StartScreenModule {

    @Provides
    fun provideGetAllGamesUseCase(): GetAllGamesUseCase {
        return GetAllGamesUseCaseImpl(
            allGamesService = provideAllGamesService()
        )
    }

    @Provides
    @Singleton
    fun provideAllGamesService(): AllGamesService {
        return Retrofit
            .Builder()
            .baseUrl(BuildConfig.STEAM_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AllGamesService::class.java)
    }
}