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
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.notNull
import com.sugarcoachpremium.type.GraphQLID
import com.sugarcoachpremium.type.UserDataEntity
import com.sugarcoachpremium.type.UserDataEntityResponseCollection
import kotlin.collections.List

public object GetUserDataIdQuerySelections {
  private val __data: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type
        ).build()
      )

  private val __usersData: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "data",
          type = UserDataEntity.type.notNull().list().notNull()
        ).selections(__data)
        .build()
      )

  public val __root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "usersData",
          type = UserDataEntityResponseCollection.type
        ).arguments(listOf(
          CompiledArgument.Builder("filters", mapOf(
            "users_permissions_user" to mapOf(
              "id" to mapOf(
                "eq" to CompiledVariable("id")
              )
            )
          )).build()
        ))
        .selections(__usersData)
        .build()
      )
}
