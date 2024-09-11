//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.StringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.GetUserByUIDQuery
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object GetUserByUIDQuery_ResponseAdapter {
  public object Data : Adapter<GetUserByUIDQuery.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("usersPermissionsUsers")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        GetUserByUIDQuery.Data {
      var _usersPermissionsUsers: GetUserByUIDQuery.UsersPermissionsUsers? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _usersPermissionsUsers = UsersPermissionsUsers.obj().nullable().fromJson(reader,
              customScalarAdapters)
          else -> break
        }
      }

      return GetUserByUIDQuery.Data(
        usersPermissionsUsers = _usersPermissionsUsers
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: GetUserByUIDQuery.Data,
    ): Unit {
      writer.name("usersPermissionsUsers")
      UsersPermissionsUsers.obj().nullable().toJson(writer, customScalarAdapters,
          value.usersPermissionsUsers)
    }
  }

  public object UsersPermissionsUsers : Adapter<GetUserByUIDQuery.UsersPermissionsUsers> {
    public val RESPONSE_NAMES: List<String> = listOf("data")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        GetUserByUIDQuery.UsersPermissionsUsers {
      var _data: List<GetUserByUIDQuery.Data1>? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _data = Data1.obj().list().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return GetUserByUIDQuery.UsersPermissionsUsers(
        `data` = _data!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: GetUserByUIDQuery.UsersPermissionsUsers,
    ): Unit {
      writer.name("data")
      Data1.obj().list().toJson(writer, customScalarAdapters, value.`data`)
    }
  }

  public object Data1 : Adapter<GetUserByUIDQuery.Data1> {
    public val RESPONSE_NAMES: List<String> = listOf("id", "attributes")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        GetUserByUIDQuery.Data1 {
      var _id: String? = null
      var _attributes: GetUserByUIDQuery.Attributes? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _id = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _attributes = Attributes.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return GetUserByUIDQuery.Data1(
        id = _id,
        attributes = _attributes
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: GetUserByUIDQuery.Data1,
    ): Unit {
      writer.name("id")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.id)

      writer.name("attributes")
      Attributes.obj().nullable().toJson(writer, customScalarAdapters, value.attributes)
    }
  }

  public object Attributes : Adapter<GetUserByUIDQuery.Attributes> {
    public val RESPONSE_NAMES: List<String> = listOf("username", "email")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        GetUserByUIDQuery.Attributes {
      var _username: String? = null
      var _email: String? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _username = StringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _email = StringAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return GetUserByUIDQuery.Attributes(
        username = _username!!,
        email = _email!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: GetUserByUIDQuery.Attributes,
    ): Unit {
      writer.name("username")
      StringAdapter.toJson(writer, customScalarAdapters, value.username)

      writer.name("email")
      StringAdapter.toJson(writer, customScalarAdapters, value.email)
    }
  }
}