package com.cas.gammermvvmapp.presentation.screens.posts

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cas.gammermvvmapp.domain.model.Post
import com.cas.gammermvvmapp.domain.model.Response
import com.cas.gammermvvmapp.domain.usecases.auth.AuthUseCases
import com.cas.gammermvvmapp.domain.usecases.posts.PostsUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostsViewModel @Inject constructor(private val postsUseCases: PostsUseCases, private val authUseCases: AuthUseCases): ViewModel() {
    var postsResponse by mutableStateOf<Response<List<Post>>?>(null)
    var likeResponse by mutableStateOf<Response<Boolean>?>(null)
    var deleteLikeResponse by mutableStateOf<Response<Boolean>?>(null)
    var currentUser = authUseCases.getCurrentUser()

    init {
        getPosts()
    }
    fun getPosts() = viewModelScope.launch {
        postsResponse = Response.Loading
        postsUseCases.getPosts().collect(){ response->
            postsResponse = response
        }
    }
    fun like(idPost: String, idUser: String) = viewModelScope.launch {
        likeResponse = Response.Loading
        val result = postsUseCases.likePost(idPost, idUser)
        likeResponse = result
    }

    fun deleteLike(idPost: String, idUser: String) = viewModelScope.launch {
        deleteLikeResponse = Response.Loading
        val result = postsUseCases.deleteLikePost(idPost, idUser)
        deleteLikeResponse = result
    }
}