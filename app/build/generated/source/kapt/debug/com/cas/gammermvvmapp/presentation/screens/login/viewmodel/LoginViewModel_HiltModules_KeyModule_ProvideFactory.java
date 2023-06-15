// Generated by Dagger (https://dagger.dev).
package com.cas.gammermvvmapp.presentation.screens.login.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static LoginViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(LoginViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final LoginViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LoginViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
