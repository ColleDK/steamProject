package dk.colle.steamproject.startscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import dk.colle.steamproject.startscreen.domain.GameImpl
import dk.colle.steamproject.startscreen.ui.StartScreenUiModel

@Composable
fun StartScreenPage(
    uiModel: StartScreenUiModel,
    viewModel: StartScreenViewModel = hiltViewModel()
) {
    val games = viewModel.games.collectAsState()

    StartScreenList(games = games.value)
}

@Composable
fun StartScreenList(
    games: List<GameImpl>
) {

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(items = games, key = { game -> game.name }) { game ->
            Column {
                Text(
                    text = game.id,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(fontSize = 16.sp)
                )
                Text(
                    text = game.name,
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
    StartScreenPage(
        uiModel = StartScreenUiModel(
            listOf()
        )
    )
}