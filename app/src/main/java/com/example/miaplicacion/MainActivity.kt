package com.example.miaplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FormularioScreen()
                }
            }
        }
    }
}

@Composable
fun FormularioScreen() {
    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var usuario by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Nombre:", style = MaterialTheme.typography.bodyLarge)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Text(text = "Apellidos:", style = MaterialTheme.typography.bodyLarge)
        OutlinedTextField(
            value = apellidos,
            onValueChange = { apellidos = it },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Text(text = "Usuario:", style = MaterialTheme.typography.bodyLarge)
        OutlinedTextField(
            value = usuario,
            onValueChange = { usuario = it },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Text(text = "Contraseña:", style = MaterialTheme.typography.bodyLarge)
        OutlinedTextField(
            value = contrasena,
            onValueChange = { contrasena = it },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { },
                modifier = Modifier.weight(1f)
            ) {
                Text("Cancelar")
            }

            Button(
                onClick = { },
                modifier = Modifier.weight(1f)
            ) {
                Text("Aceptar")
            }
        }
    }
}