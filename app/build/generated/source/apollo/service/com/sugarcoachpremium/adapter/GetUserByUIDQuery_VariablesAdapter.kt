//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.Optional
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.present
import com.sugarcoachpremium.GetUserByUIDQuery
import kotlin.IllegalStateException
import kotlin.Unit

public object GetUserByUIDQuery_VariablesAdapter : Adapter<GetUserByUIDQuery> {
  public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
      GetUserByUIDQuery = throw IllegalStateException("Input type used in output position")

  public override fun toJson(
    writer: JsonWriter,
    customScalarAdapters: CustomScalarAdapters,
    `value`: GetUserByUIDQuery,
  ): Unit {
    if (value.id is Optional.Present) {
      writer.name("id")
      NullableStringAdapter.present().toJson(writer, customScalarAdapters, value.id)
    }
  }
}
