package com.cas.gammermvvmapp.domain.usecases.users

import com.cas.gammermvvmapp.domain.model.User
import com.cas.gammermvvmapp.domain.repository.UsersRepository
import javax.inject.Inject

class CreateNewUser @Inject constructor(private val repository: UsersRepository) {

    suspend operator fun invoke (user: User) = repository.createNewUser(user)
}