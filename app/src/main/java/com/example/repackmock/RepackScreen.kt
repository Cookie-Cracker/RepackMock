package com.example.repackmock

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepackScreen() {
    Column {
        DropdownMenu(
            expanded = true,
            onDismissRequest = {true }
        ) {
            DropdownMenuItem(
                text = { Text("Load") },
                onClick = {  }
            )
            DropdownMenuItem(
                text = { Text("Save") },
                onClick = {  }
            )
        }
        TextField(
            value = "",
            onValueChange = { /*TODO: Handle DR Re-pack change*/ },
            label = { Text("DR Re-pack") }
        )
        TextField(
            value = "",
            onValueChange = { /*TODO: Handle DR # change*/ },
            label = { Text("DR #") }
        )
        // TODO: Add component to list DRs
        TextField(
            value = "",
            onValueChange = { /*TODO: Handle Totals - Pkgs change*/ },
            label = { Text("Totals - Pkgs") }
        )
        TextField(
            value = "",
            onValueChange = { /*TODO: Handle Totals - Cubic Feet change*/ },
            label = { Text("Totals - Cubic Feet") }
        )
        Button(
            onClick = { /*TODO: Handle exit button click*/ }
        ) {
            Text(text = "Exit")
        }
        Button(
            onClick = { /*TODO: Handle Navbar button click*/ }
        ) {
            Text(text = "Navbar")
        }
    }
}

@Preview
@Composable
fun RepackScreenPreview() {
    RepackScreen()
}