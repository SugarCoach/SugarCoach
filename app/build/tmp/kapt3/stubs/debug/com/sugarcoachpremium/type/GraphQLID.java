package com.sugarcoachpremium.type;

/**
 * The `ID` scalar type represents a unique identifier, often used to refetch an object or as key
 * for a cache. The ID type appears in a JSON response as a String; however, it is not intended to be
 * human-readable. When expected as an input type, any string (such as `"4"`) or integer (such as `4`)
 * input value will be accepted as an ID.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Lcom/sugarcoachpremium/type/GraphQLID;", "", "<init>", "()V", "Companion", "app_debug"})
public final class GraphQLID {
    @org.jetbrains.annotations.NotNull()
    private static final com.apollographql.apollo3.api.CustomScalarType type = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sugarcoachpremium.type.GraphQLID.Companion Companion = null;
    
    public GraphQLID() {
        super();
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/sugarcoachpremium/type/GraphQLID$Companion;", "", "<init>", "()V", "type", "Lcom/apollographql/apollo3/api/CustomScalarType;", "getType", "()Lcom/apollographql/apollo3/api/CustomScalarType;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.apollographql.apollo3.api.CustomScalarType getType() {
            return null;
        }
    }
}