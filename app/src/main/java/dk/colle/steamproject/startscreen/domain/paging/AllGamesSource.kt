package dk.colle.steamproject.startscreen.domain.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dk.colle.steamproject.BuildConfig
import dk.colle.steamproject.startscreen.data.model.AppDetails
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesPagedUseCase
import dk.colle.steamproject.util.Result
import java.io.IOException

class AllGamesSource(
    private val allGamesPagedUseCase: GetAllGamesPagedUseCase
) : PagingSource<Int, AppDetails>() {
    override fun getRefreshKey(state: PagingState<Int, AppDetails>): Int? {
        return state.lastItemOrNull()?.id
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, AppDetails> {
        val nextPage = params.key ?: 1
        val result = allGamesPagedUseCase.invoke(
            key = BuildConfig.STEAM_API_KEY,
            pageIndex = params.key
        )

        return when(result){
            is Result.Success -> {
                LoadResult.Page(
                    data = result.data,
                    prevKey = if (nextPage == 1) null else nextPage - 1,
                    nextKey = nextPage + 1
                )
            }
            is Result.Error -> {
                LoadResult.Error(
                    IOException("Error retrieving data from steam API")
                )
            }
        }
    }
}