package com.sugarcoachpremium.data.api_db.Treatment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0012J\u0010\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u00106\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u00109\u001a\u00020\rH\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010A\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u00a8\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020GH\u00d6\u0001J\t\u0010H\u001a\u00020\rH\u00d6\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\'\u0010\u001f\"\u0004\b(\u0010!R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!\u00a8\u0006I"}, d2 = {"Lcom/sugarcoachpremium/data/api_db/Treatment/TreatmentResponse;", "", "bomb", "", "insuline_unit", "", "object_glucose", "correctora", "correctora_unit", "hyperglucose", "hipoglucose", "carbono", "basal_insuline", "", "medidor", "bomba_infusora", "correctora_insuline", "id", "(Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBasal_insuline", "()Ljava/lang/String;", "setBasal_insuline", "(Ljava/lang/String;)V", "getBomb", "()Ljava/lang/Boolean;", "setBomb", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBomba_infusora", "setBomba_infusora", "getCarbono", "()Ljava/lang/Float;", "setCarbono", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getCorrectora", "setCorrectora", "getCorrectora_insuline", "setCorrectora_insuline", "getCorrectora_unit", "setCorrectora_unit", "getHipoglucose", "setHipoglucose", "getHyperglucose", "setHyperglucose", "getId", "setId", "getInsuline_unit", "setInsuline_unit", "getMedidor", "setMedidor", "getObject_glucose", "setObject_glucose", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sugarcoachpremium/data/api_db/Treatment/TreatmentResponse;", "equals", "other", "hashCode", "", "toString", "app_release"})
public final class TreatmentResponse {
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean bomb;
    @org.jetbrains.annotations.Nullable
    private java.lang.Float insuline_unit;
    @org.jetbrains.annotations.Nullable
    private java.lang.Float object_glucose;
    @org.jetbrains.annotations.Nullable
    private java.lang.Float correctora;
    @org.jetbrains.annotations.Nullable
    private java.lang.Float correctora_unit;
    @org.jetbrains.annotations.Nullable
    private java.lang.Float hyperglucose;
    @org.jetbrains.annotations.Nullable
    private java.lang.Float hipoglucose;
    @org.jetbrains.annotations.Nullable
    private java.lang.Float carbono;
    @org.jetbrains.annotations.Nullable
    private java.lang.String basal_insuline;
    @org.jetbrains.annotations.Nullable
    private java.lang.String medidor;
    @org.jetbrains.annotations.Nullable
    private java.lang.String bomba_infusora;
    @org.jetbrains.annotations.Nullable
    private java.lang.String correctora_insuline;
    @org.jetbrains.annotations.NotNull
    private java.lang.String id;
    
    public TreatmentResponse(@org.jetbrains.annotations.Nullable
    java.lang.Boolean bomb, @org.jetbrains.annotations.Nullable
    java.lang.Float insuline_unit, @org.jetbrains.annotations.Nullable
    java.lang.Float object_glucose, @org.jetbrains.annotations.Nullable
    java.lang.Float correctora, @org.jetbrains.annotations.Nullable
    java.lang.Float correctora_unit, @org.jetbrains.annotations.Nullable
    java.lang.Float hyperglucose, @org.jetbrains.annotations.Nullable
    java.lang.Float hipoglucose, @org.jetbrains.annotations.Nullable
    java.lang.Float carbono, @org.jetbrains.annotations.Nullable
    java.lang.String basal_insuline, @org.jetbrains.annotations.Nullable
    java.lang.String medidor, @org.jetbrains.annotations.Nullable
    java.lang.String bomba_infusora, @org.jetbrains.annotations.Nullable
    java.lang.String correctora_insuline, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getBomb() {
        return null;
    }
    
    public final void setBomb(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getInsuline_unit() {
        return null;
    }
    
    public final void setInsuline_unit(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getObject_glucose() {
        return null;
    }
    
    public final void setObject_glucose(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getCorrectora() {
        return null;
    }
    
    public final void setCorrectora(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getCorrectora_unit() {
        return null;
    }
    
    public final void setCorrectora_unit(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getHyperglucose() {
        return null;
    }
    
    public final void setHyperglucose(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getHipoglucose() {
        return null;
    }
    
    public final void setHipoglucose(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getCarbono() {
        return null;
    }
    
    public final void setCarbono(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBasal_insuline() {
        return null;
    }
    
    public final void setBasal_insuline(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMedidor() {
        return null;
    }
    
    public final void setMedidor(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBomba_infusora() {
        return null;
    }
    
    public final void setBomba_infusora(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCorrectora_insuline() {
        return null;
    }
    
    public final void setCorrectora_insuline(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.api_db.Treatment.TreatmentResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.Boolean bomb, @org.jetbrains.annotations.Nullable
    java.lang.Float insuline_unit, @org.jetbrains.annotations.Nullable
    java.lang.Float object_glucose, @org.jetbrains.annotations.Nullable
    java.lang.Float correctora, @org.jetbrains.annotations.Nullable
    java.lang.Float correctora_unit, @org.jetbrains.annotations.Nullable
    java.lang.Float hyperglucose, @org.jetbrains.annotations.Nullable
    java.lang.Float hipoglucose, @org.jetbrains.annotations.Nullable
    java.lang.Float carbono, @org.jetbrains.annotations.Nullable
    java.lang.String basal_insuline, @org.jetbrains.annotations.Nullable
    java.lang.String medidor, @org.jetbrains.annotations.Nullable
    java.lang.String bomba_infusora, @org.jetbrains.annotations.Nullable
    java.lang.String correctora_insuline, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}