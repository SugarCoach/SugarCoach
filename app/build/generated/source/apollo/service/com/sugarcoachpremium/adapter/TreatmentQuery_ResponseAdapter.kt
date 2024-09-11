//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableBooleanAdapter
import com.apollographql.apollo3.api.NullableDoubleAdapter
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.TreatmentQuery
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object TreatmentQuery_ResponseAdapter {
  public object Data : Adapter<TreatmentQuery.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("treatments")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        TreatmentQuery.Data {
      var _treatments: TreatmentQuery.Treatments? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _treatments = Treatments.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return TreatmentQuery.Data(
        treatments = _treatments
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: TreatmentQuery.Data,
    ): Unit {
      writer.name("treatments")
      Treatments.obj().nullable().toJson(writer, customScalarAdapters, value.treatments)
    }
  }

  public object Treatments : Adapter<TreatmentQuery.Treatments> {
    public val RESPONSE_NAMES: List<String> = listOf("data")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        TreatmentQuery.Treatments {
      var _data: List<TreatmentQuery.Data1>? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _data = Data1.obj().list().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return TreatmentQuery.Treatments(
        `data` = _data!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: TreatmentQuery.Treatments,
    ): Unit {
      writer.name("data")
      Data1.obj().list().toJson(writer, customScalarAdapters, value.`data`)
    }
  }

  public object Data1 : Adapter<TreatmentQuery.Data1> {
    public val RESPONSE_NAMES: List<String> = listOf("id", "attributes")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        TreatmentQuery.Data1 {
      var _id: String? = null
      var _attributes: TreatmentQuery.Attributes? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _id = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _attributes = Attributes.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return TreatmentQuery.Data1(
        id = _id,
        attributes = _attributes
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: TreatmentQuery.Data1,
    ): Unit {
      writer.name("id")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.id)

      writer.name("attributes")
      Attributes.obj().nullable().toJson(writer, customScalarAdapters, value.attributes)
    }
  }

  public object Attributes : Adapter<TreatmentQuery.Attributes> {
    public val RESPONSE_NAMES: List<String> = listOf("bomb", "insulina_unit", "object_glucose",
        "correctora", "correctora_unit", "hyperglucose", "hipoglucose", "carbono", "basal_insuline",
        "medidor", "bomba_infusora", "correctora_insuline")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        TreatmentQuery.Attributes {
      var _bomb: Boolean? = null
      var _insulina_unit: Double? = null
      var _object_glucose: Double? = null
      var _correctora: Double? = null
      var _correctora_unit: Double? = null
      var _hyperglucose: Double? = null
      var _hipoglucose: Double? = null
      var _carbono: Double? = null
      var _basal_insuline: String? = null
      var _medidor: String? = null
      var _bomba_infusora: String? = null
      var _correctora_insuline: String? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _bomb = NullableBooleanAdapter.fromJson(reader, customScalarAdapters)
          1 -> _insulina_unit = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          2 -> _object_glucose = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          3 -> _correctora = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          4 -> _correctora_unit = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          5 -> _hyperglucose = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          6 -> _hipoglucose = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          7 -> _carbono = NullableDoubleAdapter.fromJson(reader, customScalarAdapters)
          8 -> _basal_insuline = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          9 -> _medidor = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          10 -> _bomba_infusora = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          11 -> _correctora_insuline = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return TreatmentQuery.Attributes(
        bomb = _bomb,
        insulina_unit = _insulina_unit,
        object_glucose = _object_glucose,
        correctora = _correctora,
        correctora_unit = _correctora_unit,
        hyperglucose = _hyperglucose,
        hipoglucose = _hipoglucose,
        carbono = _carbono,
        basal_insuline = _basal_insuline,
        medidor = _medidor,
        bomba_infusora = _bomba_infusora,
        correctora_insuline = _correctora_insuline
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: TreatmentQuery.Attributes,
    ): Unit {
      writer.name("bomb")
      NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.bomb)

      writer.name("insulina_unit")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.insulina_unit)

      writer.name("object_glucose")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.object_glucose)

      writer.name("correctora")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.correctora)

      writer.name("correctora_unit")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.correctora_unit)

      writer.name("hyperglucose")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.hyperglucose)

      writer.name("hipoglucose")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.hipoglucose)

      writer.name("carbono")
      NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.carbono)

      writer.name("basal_insuline")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.basal_insuline)

      writer.name("medidor")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.medidor)

      writer.name("bomba_infusora")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.bomba_infusora)

      writer.name("correctora_insuline")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.correctora_insuline)
    }
  }
}