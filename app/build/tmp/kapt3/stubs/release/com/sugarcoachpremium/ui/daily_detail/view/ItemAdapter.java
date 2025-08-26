package com.sugarcoachpremium.ui.daily_detail.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u001c\u0010\u001f\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0 2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/view/ItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "activity", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailActivity;", "(Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailActivity;)V", "binding", "Lcom/sugarcoachpremium/databinding/EmotionsItemBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/EmotionsItemBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/EmotionsItemBinding;)V", "itemList", "", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyItem;", "type", "", "bind", "", "holder", "Lcom/sugarcoachpremium/ui/daily_detail/view/ItemHolder;", "item", "edit", "position", "getItem", "getItemCount", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "app_release"})
public final class ItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity activity = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> itemList;
    private int type = 0;
    public com.sugarcoachpremium.databinding.EmotionsItemBinding binding;
    
    public ItemAdapter(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.databinding.EmotionsItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.databinding.EmotionsItemBinding p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> itemList, int type) {
    }
    
    public final void edit(int position, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.view.DailyItem item) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.daily_detail.view.DailyItem getItem(int position) {
        return null;
    }
    
    private final void bind(com.sugarcoachpremium.ui.daily_detail.view.ItemHolder holder, com.sugarcoachpremium.ui.daily_detail.view.DailyItem item) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
}