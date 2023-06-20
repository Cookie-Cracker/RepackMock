package com.example.repackmock

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview



@Composable
fun OptionScreen() {
    Column {
    de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.appbar.topappbar.TopAppBar()
        Button(
            onClick = { /*TODO: Handle LCL button click*/ }
        ) {
            Text(text = "LCL")
        }
        Button(
            onClick = { /*TODO: Handle Stuffing button click*/ }
        ) {
            Text(text = "Stuffing")
        }
        Button(
            onClick = { /*TODO: Handle Repack button click*/ }
        ) {
            Text(text = "Repack")
        }
        Button(
            onClick = { /*TODO: Handle Mule button click*/ }
        ) {
            Text(text = "Mule")
        }
    }
}


@Preview
@Composable
fun OptionScreenPreview() {
    OptionScreen()
}