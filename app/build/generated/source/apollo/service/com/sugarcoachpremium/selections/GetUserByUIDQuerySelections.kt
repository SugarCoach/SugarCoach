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
import com.sugarcoachpremium.type.GraphQLString
import com.sugarcoachpremium.type.UsersPermissionsUser
import com.sugarcoachpremium.type.UsersPermissionsUserEntity
import com.sugarcoachpremium.type.UsersPermissionsUserEntityResponseCollection
import kotlin.collections.List

public object GetUserByUIDQuerySelections {
  private val __attributes: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "username",
          type = GraphQLString.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "email",
          type = GraphQLString.type.notNull()
        ).build()
      )

  private val __data: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type
        ).build(),
        CompiledField.Builder(
          name = "attributes",
          type = UsersPermissionsUser.type
        ).selections(__attributes)
        .build()
      )

  private val __usersPermissionsUsers: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "data",
          type = UsersPermissionsUserEntity.type.notNull().list().notNull()
        ).selections(__data)
        .build()
      )

  public val __root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "usersPermissionsUsers",
          type = UsersPermissionsUserEntityResponseCollection.type
        ).arguments(listOf(
          CompiledArgument.Builder("filters", mapOf(
            "FirebaseUID" to mapOf(
              "eq" to CompiledVariable("id")
            )
          )).build()
        ))
        .selections(__usersPermissionsUsers)
        .build()
      )
}
