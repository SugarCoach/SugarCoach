package com.sugarcoach.data.database.repository.user

import com.google.gson.annotations.Expose

data class ParcialUser(
    @Expose
    val email: String,

    @Expose
    val username: String,

    @Expose
    val blocked: Boolean,

    @Expose
    val provider: String,

    @Expose
    val confirmed: Boolean
)
