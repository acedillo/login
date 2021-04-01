package com.acedillo.example.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/acedillo/example/ui/main/PageViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/acedillo/example/repository/UserRepository;", "(Lcom/acedillo/example/repository/UserRepository;)V", "_greeting", "Landroidx/lifecycle/MutableLiveData;", "", "_index", "greeting", "Landroidx/lifecycle/LiveData;", "getGreeting", "()Landroidx/lifecycle/LiveData;", "text", "", "getText", "setGreeting", "", "setIndex", "index", "Companion", "app_debug"})
public final class PageViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _index = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _greeting = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> text = null;
    private final com.acedillo.example.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.acedillo.example.ui.main.PageViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGreeting() {
        return null;
    }
    
    public final void setIndex(int index) {
    }
    
    public final void setGreeting() {
    }
    
    public PageViewModel(@org.jetbrains.annotations.NotNull()
    com.acedillo.example.repository.UserRepository userRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/acedillo/example/ui/main/PageViewModel$Companion;", "", "()V", "getFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "userRepository", "Lcom/acedillo/example/repository/UserRepository;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.ViewModelProvider.Factory getFactory(@org.jetbrains.annotations.NotNull()
        com.acedillo.example.repository.UserRepository userRepository) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}