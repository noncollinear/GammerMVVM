package com.cas.gammermvvmapp.domain.usecases.auth

import com.cas.gammermvvmapp.domain.repository.AuthRepository
import javax.inject.Inject

class Logout @Inject constructor(private val repository: AuthRepository) {
    operator fun invoke() = repository.logout()
}