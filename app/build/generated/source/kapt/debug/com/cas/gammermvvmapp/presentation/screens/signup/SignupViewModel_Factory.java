// Generated by Dagger (https://dagger.dev).
package com.cas.gammermvvmapp.presentation.screens.signup;

import com.cas.gammermvvmapp.domain.usecases.auth.AuthUseCases;
import com.cas.gammermvvmapp.domain.usecases.users.UsersUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignupViewModel_Factory implements Factory<SignupViewModel> {
  private final Provider<AuthUseCases> authUseCasesProvider;

  private final Provider<UsersUseCases> usersUseCasesProvider;

  public SignupViewModel_Factory(Provider<AuthUseCases> authUseCasesProvider,
      Provider<UsersUseCases> usersUseCasesProvider) {
    this.authUseCasesProvider = authUseCasesProvider;
    this.usersUseCasesProvider = usersUseCasesProvider;
  }

  @Override
  public SignupViewModel get() {
    return newInstance(authUseCasesProvider.get(), usersUseCasesProvider.get());
  }

  public static SignupViewModel_Factory create(Provider<AuthUseCases> authUseCasesProvider,
      Provider<UsersUseCases> usersUseCasesProvider) {
    return new SignupViewModel_Factory(authUseCasesProvider, usersUseCasesProvider);
  }

  public static SignupViewModel newInstance(AuthUseCases authUseCases,
      UsersUseCases usersUseCases) {
    return new SignupViewModel(authUseCases, usersUseCases);
  }
}
