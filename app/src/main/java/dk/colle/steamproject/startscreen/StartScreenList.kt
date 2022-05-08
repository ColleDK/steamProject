package dk.colle.steamproject.startscreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dk.colle.steamproject.startscreen.ui.StartScreenUiModel

@Composable
fun StartScreenList(
    uiModel: StartScreenUiModel
) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items = uiModel.games, key = { game -> game.name }) {

        }
    }

}


@Preview
@Composable
fun StartScreenPreview() {
    StartScreenList(
        uiModel = StartScreenUiModel(
            listOf()
        )
    )
}