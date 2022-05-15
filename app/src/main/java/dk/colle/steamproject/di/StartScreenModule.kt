package dk.colle.steamproject.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dk.colle.steamproject.BuildConfig
import dk.colle.steamproject.startscreen.data.AllGamesPagedService
import dk.colle.steamproject.startscreen.data.AllGamesService
import dk.colle.steamproject.startscreen.data.GameDetailService
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesPagedUseCase
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesUseCase
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesWithInformationUseCase
import dk.colle.steamproject.startscreen.data.usecase.GetGameInformationUseCase
import dk.colle.steamproject.startscreen.domain.paging.AllGamesSource
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object StartScreenModule {
    // Http logger
    private val loggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    private val httpClient = OkHttpClient.Builder().addInterceptor(loggingInterceptor)

    @Provides
    @Singleton
    fun provideAllGamesService(): AllGamesService {
        return Retrofit
            .Builder()
            .baseUrl(BuildConfig.STEAM_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AllGamesService::class.java)
    }

    @Provides
    @Singleton
    fun provideGameDetailService(): GameDetailService {
        return Retrofit
            .Builder()
            .baseUrl(BuildConfig.STEAM_STORE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
            .create(GameDetailService::class.java)
    }

    @Provides
    fun provideGetAllGamesUseCase(allGamesService: AllGamesService): GetAllGamesUseCase {
        return GetAllGamesUseCase(
            allGamesService = allGamesService
        )
    }

    @Provides
    fun provideGetGameInformationUseCase(gameDetailService: GameDetailService): GetGameInformationUseCase {
        return GetGameInformationUseCase(
            gameDetailService = gameDetailService
        )
    }

    @Provides
    fun provideGetAllGamesWithInformationUseCase(
        getAllGamesUseCase: GetAllGamesUseCase,
        getGameInformationUseCase: GetGameInformationUseCase
    ): GetAllGamesWithInformationUseCase {
        return GetAllGamesWithInformationUseCase(
            getAllGamesUseCase = getAllGamesUseCase,
            getGameInformationUseCase = getGameInformationUseCase
        )
    }

    @Provides
    fun provideAllGamesPagedService(): AllGamesPagedService {
        return Retrofit
            .Builder()
            .baseUrl(BuildConfig.STEAM_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
            .create(AllGamesPagedService::class.java)
    }

    @Provides
    fun provideAllGamesPagedUseCase(allGamesPagedService: AllGamesPagedService): GetAllGamesPagedUseCase {
        return GetAllGamesPagedUseCase(
            allGamesPagedService = allGamesPagedService
        )
    }

    @Provides
    fun provideAllGamesSource(
        allGamesPagedUseCase: GetAllGamesPagedUseCase
    ): AllGamesSource {
        return AllGamesSource(
            allGamesPagedUseCase = allGamesPagedUseCase
        )
    }
}