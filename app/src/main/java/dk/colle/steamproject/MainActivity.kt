package dk.colle.steamproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import dk.colle.steamproject.startscreen.StartScreenPage
import dk.colle.steamproject.startscreen.ui.StartScreenUiModel
import dk.colle.steamproject.ui.theme.SteamProjectTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SteamProjectTheme {
                StartScreenPage(uiModel = StartScreenUiModel(listOf()))
            }
        }
    }
}