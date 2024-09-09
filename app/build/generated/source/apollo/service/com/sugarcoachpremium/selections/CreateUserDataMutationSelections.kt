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
import com.sugarcoachpremium.type.GraphQLID
import com.sugarcoachpremium.type.UserDataEntity
import com.sugarcoachpremium.type.UserDataEntityResponse
import kotlin.collections.List

public object CreateUserDataMutationSelections {
  private val __data: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type
        ).build()
      )

  private val __createUserData: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "data",
          type = UserDataEntity.type
        ).selections(__data)
        .build()
      )

  public val __root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "createUserData",
          type = UserDataEntityResponse.type
        ).arguments(listOf(
          CompiledArgument.Builder("data", mapOf(
            "users_permissions_user" to CompiledVariable("id"),
            "sugar_points" to 0
          )).build()
        ))
        .selections(__createUserData)
        .build()
      )
}
