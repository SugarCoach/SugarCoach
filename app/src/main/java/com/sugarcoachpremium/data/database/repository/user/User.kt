package com.sugarcoachpremium.data.database.repository.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import java.util.*

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true) var id: Int,

    @Expose
    @ColumnInfo(name = "username")
    var username: String,

    @Expose
    @ColumnInfo(name = "blocked")
    var blocked: Boolean,

    @Expose
    @ColumnInfo(name = "email")
    var email: String,

    @Expose
    @ColumnInfo(name = "provider")
    var provider: String,

    @Expose
    @ColumnInfo(name = "confirmed")
    var confirmed: Boolean,

    @ColumnInfo(name = "sex")
    var sex: String?,

    @ColumnInfo(name = "name")
    var name: String?,

    @ColumnInfo(name = "avatar")
    var avatar: String?,

    @ColumnInfo(name = "weight")
    var weight: Float?,

    @ColumnInfo(name = "height")
    var height: Float?,

    @ColumnInfo(name = "birthday")
    var birthday: Date?,

    @ColumnInfo(name = "debut")
    var debut: Date?,

    @ColumnInfo(name = "control")
    var control: Boolean?,

    @ColumnInfo(name = "medico")
    var medico: Boolean?,

    @ColumnInfo(name = "sms")
    var sms: Boolean?,

    @ColumnInfo(name = "geolocalizacion")
    var geolocalizacion: Boolean?,

    @ColumnInfo(name = "number")
    var number: String?,

    @Expose
    @ColumnInfo(name = "mirror_id")
    var mirror_id: String?,

    @ColumnInfo(name = "type_account")
    var typeAccount: String?
)