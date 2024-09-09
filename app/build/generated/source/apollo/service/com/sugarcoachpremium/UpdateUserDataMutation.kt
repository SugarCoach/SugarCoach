//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium

import com.apollographql.apollo3.annotations.ApolloAdaptableWith
import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.Mutation
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.adapter.UpdateUserDataMutation_ResponseAdapter
import com.sugarcoachpremium.adapter.UpdateUserDataMutation_VariablesAdapter
import com.sugarcoachpremium.selections.UpdateUserDataMutationSelections
import com.sugarcoachpremium.type.UserDataInput
import kotlin.String
import kotlin.Unit

public data class UpdateUserDataMutation(
  public val user: UserDataInput,
  public val id: String,
) : Mutation<UpdateUserDataMutation.Data> {
  public override fun id(): String = OPERATION_ID

  public override fun document(): String = OPERATION_DOCUMENT

  public override fun name(): String = OPERATION_NAME

  public override fun serializeVariables(writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters): Unit {
    UpdateUserDataMutation_VariablesAdapter.toJson(writer, customScalarAdapters, this)
  }

  public override fun adapter(): Adapter<Data> = UpdateUserDataMutation_ResponseAdapter.Data.obj()

  public override fun rootField(): CompiledField = CompiledField.Builder(
    name = "data",
    type = com.sugarcoachpremium.type.Mutation.type
  )
  .selections(selections = UpdateUserDataMutationSelections.__root)
  .build()

  @ApolloAdaptableWith(UpdateUserDataMutation_ResponseAdapter.Data::class)
  public data class Data(
    public val updateUserData: UpdateUserData?,
  ) : Mutation.Data

  public data class UpdateUserData(
    public val `data`: Data1?,
  )

  public data class Data1(
    public val id: String?,
  )

  public companion object {
    public const val OPERATION_ID: String =
        "d70750a99dadc4ebc81d45fb1765368233eba691317a4a75cb9ed9d5f64a61f3"

    /**
     * The minimized GraphQL document being sent to the server to save a few bytes.
     * The un-minimized version is:
     *
     * mutation UpdateUserData($user: UserDataInput!, $id: ID!) {
     *   updateUserData(id: $id, data: $user) {
     *     data {
     *       id
     *     }
     *   }
     * }
     */
    public val OPERATION_DOCUMENT: String
      get() =
          "mutation UpdateUserData(${'$'}user: UserDataInput!, ${'$'}id: ID!) { updateUserData(id: ${'$'}id, data: ${'$'}user) { data { id } } }"

    public const val OPERATION_NAME: String = "UpdateUserData"
  }
}
