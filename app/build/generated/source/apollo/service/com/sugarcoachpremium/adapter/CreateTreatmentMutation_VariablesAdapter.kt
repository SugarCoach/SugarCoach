//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.CreateTreatmentMutation
import com.sugarcoachpremium.type.adapter.TreatmentInput_InputAdapter
import kotlin.IllegalStateException
import kotlin.Unit

public object CreateTreatmentMutation_VariablesAdapter : Adapter<CreateTreatmentMutation> {
  public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
      CreateTreatmentMutation = throw IllegalStateException("Input type used in output position")

  public override fun toJson(
    writer: JsonWriter,
    customScalarAdapters: CustomScalarAdapters,
    `value`: CreateTreatmentMutation,
  ): Unit {
    writer.name("treatment")
    TreatmentInput_InputAdapter.obj().toJson(writer, customScalarAdapters, value.treatment)
  }
}