package dk.colle.steamproject.startscreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import dk.colle.steamproject.startscreen.data.model.AppDetails
import dk.colle.steamproject.util.NavigationRoutes
import timber.log.Timber

@Composable
fun StartScreenPage(
    viewModel: StartScreenViewModel = hiltViewModel(),
    onNavigate: (NavigationRoutes) -> Unit
) {
    val uiModel = viewModel.uiModel.collectAsState()

    LaunchedEffect(uiModel.value.navigation) {
        uiModel.value.navigation?.let { navigation ->
            navigation.consume { destination ->
                onNavigate(destination)
            }
        }
    }

    val games = viewModel.games.collectAsLazyPagingItems()

    StartScreenList(
        games = games,
        onItemClick = { Timber.d("Item clicked $it") }
    )
}

@Composable
fun StartScreenList(
    games: LazyPagingItems<AppDetails>,
    onItemClick: (String) -> Unit
) {

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(items = games, key = { game -> game.id }) { game ->
            Column(
                modifier = Modifier.clickable { onItemClick(game?.id.toString()) }
            ) {
                Text(
                    text = game?.id.toString(),
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(fontSize = 16.sp)
                )
                Text(
                    text = game?.name.toString(),
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(fontSize = 16.sp)
                )
            }
        }
    }

}


@Preview
@Composable
fun StartScreenPreview() {
    StartScreenPage(onNavigate = {})
}