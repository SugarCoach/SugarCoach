package com.sugarcoachpremium.ui.treatment.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J,\u0010#\u001a\u00020 2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0$2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rJ\u0016\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\tJ\u000e\u0010\'\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001eJ\u0018\u0010(\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006)"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/view/TreatmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "activity", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentActivity;", "<init>", "(Lcom/sugarcoachpremium/ui/treatment/view/TreatmentActivity;)V", "itemList", "", "Lcom/sugarcoachpremium/ui/treatment/view/HorarioItem;", "items", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "holder", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentHolder;", "getHolder", "()Lcom/sugarcoachpremium/ui/treatment/view/TreatmentHolder;", "setHolder", "(Lcom/sugarcoachpremium/ui/treatment/view/TreatmentHolder;)V", "binding", "Lcom/sugarcoachpremium/databinding/TreatmentItemBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/TreatmentItemBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/TreatmentItemBinding;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "position", "getItemCount", "setData", "", "edit", "item", "getItem", "bind", "app_debug"})
public final class TreatmentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.sugarcoachpremium.ui.treatment.view.TreatmentActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.sugarcoachpremium.ui.treatment.view.HorarioItem> itemList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> items;
    public com.sugarcoachpremium.ui.treatment.view.TreatmentHolder holder;
    public com.sugarcoachpremium.databinding.TreatmentItemBinding binding;
    
    public TreatmentAdapter(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.view.TreatmentHolder getHolder() {
        return null;
    }
    
    public final void setHolder(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.databinding.TreatmentItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.databinding.TreatmentItemBinding p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.treatment.view.HorarioItem> itemList, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> items) {
    }
    
    public final void edit(int position, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.HorarioItem item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.view.HorarioItem getItem(int position) {
        return null;
    }
    
    private final void bind(com.sugarcoachpremium.ui.treatment.view.TreatmentHolder holder, com.sugarcoachpremium.ui.treatment.view.HorarioItem item) {
    }
}