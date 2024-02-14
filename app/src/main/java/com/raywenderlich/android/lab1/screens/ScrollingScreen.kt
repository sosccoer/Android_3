package com.raywenderlich.android.lab1.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun ScrollingScrren() {
    MyScrollingScreen()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyScrollingScreen(modifier: Modifier = Modifier) {

        Column (modifier = modifier.verticalScroll(rememberScrollState())) {
            BookImage( R.drawable.advanced_architecture_android,R.string.better_architecher_android)
            BookImage( R.drawable.kotlin_aprentice,R.string.better_architecher_android)
            BookImage( R.drawable.kotlin_coroutines,R.string.better_architecher_android)
        }

}

@Composable
fun BookImage(@DrawableRes imageResId: Int, @StringRes contentDescriptionResId:Int ){
    Image(
        bitmap = ImageBitmap.imageResource(imageResId),
        contentDescription = stringResource(id = contentDescriptionResId),
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.size(476.dp,616.dp)
    )
}