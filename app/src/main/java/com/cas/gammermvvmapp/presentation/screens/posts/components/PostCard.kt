package com.cas.gammermvvmapp.presentation.screens.posts.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontLoadingStrategy.Companion.Async
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.cas.gammermvvmapp.domain.model.Post

@Composable
fun PostCard(post: Post){

    Card(
        modifier = Modifier.padding(top = 15.dp, bottom = 15.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(20.dp),
        contentColor = Color.White
    ) {
        Column {
            AsyncImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp),
                model =post.image,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                )
            Text(
                modifier = Modifier.padding(horizontal = 15.dp, vertical = 10.dp),
                text = post.name,
                fontWeight = FontWeight.Bold,
            )
            Text(
                modifier = Modifier.padding(horizontal = 15.dp, vertical = 3.dp),

                text = post.user?.username ?: "",
                fontSize = 12.sp

            )
            Text(
                modifier = Modifier.padding(horizontal = 15.dp, vertical = 3.dp),

                text = post.description,
                fontSize = 13.sp,
                maxLines = 2,
                color = Color.Gray
            )
        }

    }

}