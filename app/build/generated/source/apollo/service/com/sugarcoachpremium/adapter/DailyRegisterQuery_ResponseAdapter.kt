//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableAnyAdapter
import com.apollographql.apollo3.api.NullableDoubleAdapter
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.DailyRegisterQuery
import kotlin.Any
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object DailyRegisterQuery_ResponseAdapter {
  public object Data : Adapter<DailyRegisterQuery.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("dailyRegisters")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        DailyRegisterQuery.Data {
      var _dailyRegisters: DailyRegisterQuery.DailyRegisters? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _dailyRegisters = DailyRegisters.obj().nullable().fromJson(reader,
              customScalarAdapters)
          else -> break
        }
      }

      return DailyRegisterQuery.Data(
        dailyRegisters = _dailyRegisters
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: DailyRegisterQuery.Data,
    ): Unit {
      writer.name("dailyRegisters")
      DailyRegisters.obj().nullable().toJson(writer, customScalarAdapters, value.dailyRegisters)
    }
  }

  public object DailyRegisters : Adapter<DailyRegisterQuery.DailyRegisters> {
    public val RESPONSE_NAMES: List<String> = listOf("data")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        DailyRegisterQuery.DailyRegisters {
      var _data: List<DailyRegisterQuery.Data1>? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _data = Data1.obj().list().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return DailyRegisterQuery.DailyRegisters(
        `data` = _data!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: DailyRegisterQuery.DailyRegisters,
    ): Unit {
      writer.name("data")
      Data1.obj().list().toJson(writer, customScalarAdapters, value.`data`)
    }
  }

  public object Data1 : Adapter<DailyRegisterQuery.Data1> {
    public val RESPONSE_NAMES: List<String> = listOf("id", "attributes")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        DailyRegisterQuery.Data1 {
      var _id: String? = null
      var _attributes: DailyRegisterQuery.Attributes? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _id = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _attributes = Attributes.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return DailyRegisterQuery.Data1(
        id = _id,
        attributes = _attributes
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: DailyRegisterQuery.Data1,
    ): Unit {
      writer.name("id")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.id)

      writer.name("attributes")
      Attributes.obj().nullable().toJson(writer, customScalarAdapters, value.attributes)
    }
  }

  public object Attributes : Adapter<DailyRegisterQuery.Attributes> {
    public val RESPONSE_NAMES: List<String> = listOf("glucose", "insulin", "carbohydrates",
        "comment", "basal", "colors", "emotional_state", "excercise", "createdAt", "category")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        DailyRegisterQuery.Attributes {
      var _glucose: Double? = null
      var _insulin: Double? = null
      var _carbohydrates: Double? = null
      var _comment: String? = null
      var _basal: Double? = null
      var _colors: String? = null
      var _emotional_state: String? = null
      var _excercise: String? = null
      var _createdAt: Any? = null
      var _category: String? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _glucose = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          1 -> _insulin = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          2 -> _carbohydrates = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          3 -> _comment = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          4 -> _basal = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          5 -> _colors = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          6 -> _emotional_state = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          7 -> _excercise = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          8 -> _createdAt = NullableAnyAdapter.fromJson(reader, customScalarAdapters)
          9 -> _category = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return DailyRegisterQuery.Attributes(
        glucose = _glucose,
        insulin = _insulin,
        carbohydrates = _carbohydrates,
        comment = _comment,
        basal = _basal,
        colors = _colors,
        emotional_state = _emotional_state,
        excercise = _excercise,
        createdAt = _createdAt,
        category = _category
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: DailyRegisterQuery.Attributes,
    ): Unit {
      writer.name("glucose")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.glucose)

      writer.name("insulin")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.insulin)

      writer.name("carbohydrates")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.carbohydrates)

      writer.name("comment")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.comment)

      writer.name("basal")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.basal)

      writer.name("colors")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.colors)

      writer.name("emotional_state")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.emotional_state)

      writer.name("excercise")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.excercise)

      writer.name("createdAt")
      NullableAnyAdapter.toJson(writer, customScalarAdapters, value.createdAt)

      writer.name("category")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.category)
    }
  }
}
