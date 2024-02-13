package com.raywenderlich.android.lab1.screens

import android.content.Context
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.router.Screen



val THREE_ELEMENTS_LIST = listOf(
    R.string.first,
    R.string.second,
    R.string.third
)

@Composable
fun RowScreen() {
    myRow()
    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}
@Composable
fun myRow() {

    Row (verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()) {

        THREE_ELEMENTS_LIST.forEach { textResId ->
            Text(
                text = stringResource(id = textResId),
                fontSize = 18.sp
            )

        }

    }

}