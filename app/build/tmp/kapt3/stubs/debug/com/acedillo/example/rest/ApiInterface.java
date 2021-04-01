package com.acedillo.example.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/acedillo/example/rest/ApiInterface;", "", "getAvailableUsers", "Lretrofit2/Call;", "Lcom/acedillo/example/model/AvailableUser;", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "v3/b852db38-d936-4880-b4ab-13361debe270")
    public abstract retrofit2.Call<com.acedillo.example.model.AvailableUser> getAvailableUsers();
}