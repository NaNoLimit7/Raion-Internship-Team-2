package com.example.raioninternshipteam2.reusable

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun RegisterTextField(name: String, onValueChange : (String) -> Unit, label: String, icons : ImageVector) {
    OutlinedTextField(
        name,
        onValueChange = onValueChange,
        label = { Text(label) },
        maxLines = 1,
        leadingIcon = {
            Icon(icons, contentDescription = "", tint = Color.Gray)
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text, imeAction = ImeAction.Done
        ),
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier.padding(top = 16.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedLabelColor = Color.Gray,
            focusedLabelColor = Color.Gray,
            unfocusedBorderColor = Color.Gray,
            focusedBorderColor = Color.Gray,
            focusedTextColor = Color.Gray,
            unfocusedTextColor = Color.Gray
        )
    )
}