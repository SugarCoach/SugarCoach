//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.selections

import com.apollographql.apollo3.api.CompiledArgument
import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CompiledSelection
import com.apollographql.apollo3.api.CompiledVariable
import com.sugarcoachpremium.type.DateTime
import com.sugarcoachpremium.type.GraphQLID
import com.sugarcoachpremium.type.Treatment
import com.sugarcoachpremium.type.TreatmentEntity
import com.sugarcoachpremium.type.TreatmentEntityResponse
import kotlin.collections.List

public object CreateTreatmentMutationSelections {
  private val __attributes: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "createdAt",
          type = DateTime.type
        ).build(),
        CompiledField.Builder(
          name = "updatedAt",
          type = DateTime.type
        ).build()
      )

  private val __data: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type
        ).build(),
        CompiledField.Builder(
          name = "attributes",
          type = Treatment.type
        ).selections(__attributes)
        .build()
      )

  private val __createTreatment: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "data",
          type = TreatmentEntity.type
        ).selections(__data)
        .build()
      )

  public val __root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "createTreatment",
          type = TreatmentEntityResponse.type
        ).arguments(listOf(
          CompiledArgument.Builder("data", CompiledVariable("treatment")).build()
        ))
        .selections(__createTreatment)
        .build()
      )
}
