import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.repackmock.OptionScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var loggedIn by remember { mutableStateOf(false)}
    var error by remember { mutableStateOf(false) } // Track error state

    if (loggedIn){
        OptionScreen()
    }else{


    Column {
        Text(text = "Login")
        TextField(
            value = username,
            onValueChange = { username= it },
            label = { Text("Username") }
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") }
        )
        if (error) {
            Text(text = "Invalid credentials. Please try again.", color = MaterialTheme.colorScheme.error)
        }
        Button(
            onClick = {
                if (username == "alain" && password=="123"){
                    loggedIn = true
                }
                else{
                    error = true
                }

            }
        ) {
            Text(text = "Login")
        }
    }
    }

}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
