//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.CreateUserDataMutation
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object CreateUserDataMutation_ResponseAdapter {
  public object Data : Adapter<CreateUserDataMutation.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("createUserData")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CreateUserDataMutation.Data {
      var _createUserData: CreateUserDataMutation.CreateUserData? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _createUserData = CreateUserData.obj().nullable().fromJson(reader,
              customScalarAdapters)
          else -> break
        }
      }

      return CreateUserDataMutation.Data(
        createUserData = _createUserData
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CreateUserDataMutation.Data,
    ): Unit {
      writer.name("createUserData")
      CreateUserData.obj().nullable().toJson(writer, customScalarAdapters, value.createUserData)
    }
  }

  public object CreateUserData : Adapter<CreateUserDataMutation.CreateUserData> {
    public val RESPONSE_NAMES: List<String> = listOf("data")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CreateUserDataMutation.CreateUserData {
      var _data: CreateUserDataMutation.Data1? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _data = Data1.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return CreateUserDataMutation.CreateUserData(
        `data` = _data
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CreateUserDataMutation.CreateUserData,
    ): Unit {
      writer.name("data")
      Data1.obj().nullable().toJson(writer, customScalarAdapters, value.`data`)
    }
  }

  public object Data1 : Adapter<CreateUserDataMutation.Data1> {
    public val RESPONSE_NAMES: List<String> = listOf("id")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CreateUserDataMutation.Data1 {
      var _id: String? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _id = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return CreateUserDataMutation.Data1(
        id = _id
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CreateUserDataMutation.Data1,
    ): Unit {
      writer.name("id")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.id)
    }
  }
}
