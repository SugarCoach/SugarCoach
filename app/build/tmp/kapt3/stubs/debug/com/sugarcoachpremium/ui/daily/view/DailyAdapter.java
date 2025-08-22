package com.sugarcoachpremium.ui.daily.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u0007\u00a2\u0006\u0004\b\t\u0010\nJ0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J(\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\bH\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/view/DailyAdapter;", "Lcom/hominoid/expandablerecyclerviewlib/adapter/ExpandableRecyclerViewAdapter;", "Lcom/sugarcoachpremium/ui/daily/view/DailyAdapter$HeaderViewHolder;", "Lcom/sugarcoachpremium/ui/daily/view/DailyHolder;", "context", "Lcom/sugarcoachpremium/ui/daily/view/DailyActivity;", "groups", "", "Lcom/hominoid/expandablerecyclerviewlib/models/ExpandableListItem;", "<init>", "(Lcom/sugarcoachpremium/ui/daily/view/DailyActivity;Ljava/util/List;)V", "binding", "Lcom/sugarcoachpremium/databinding/DailyItemBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/DailyItemBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/DailyItemBinding;)V", "onBindChildViewHolder", "", "holder", "flatPosition", "", "group", "childIndex", "onBindGroupViewHolder", "onCreateChildViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onCreateGroupViewHolder", "HeaderViewHolder", "app_debug"})
public final class DailyAdapter extends com.hominoid.expandablerecyclerviewlib.adapter.ExpandableRecyclerViewAdapter<com.sugarcoachpremium.ui.daily.view.DailyAdapter.HeaderViewHolder, com.sugarcoachpremium.ui.daily.view.DailyHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.sugarcoachpremium.ui.daily.view.DailyActivity context = null;
    public com.sugarcoachpremium.databinding.DailyItemBinding binding;
    
    public DailyAdapter(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily.view.DailyActivity context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<?, ?>> groups) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.databinding.DailyItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.databinding.DailyItemBinding p0) {
    }
    
    @java.lang.Override()
    public void onBindChildViewHolder(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily.view.DailyHolder holder, int flatPosition, @org.jetbrains.annotations.NotNull()
    com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<?, ?> group, int childIndex) {
    }
    
    @java.lang.Override()
    public void onBindGroupViewHolder(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily.view.DailyAdapter.HeaderViewHolder holder, int flatPosition, @org.jetbrains.annotations.NotNull()
    com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<?, ?> group) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.sugarcoachpremium.ui.daily.view.DailyHolder onCreateChildViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.sugarcoachpremium.ui.daily.view.DailyAdapter.HeaderViewHolder onCreateGroupViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/view/DailyAdapter$HeaderViewHolder;", "Lcom/hominoid/expandablerecyclerviewlib/viewholders/GroupViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "app_debug"})
    public static final class HeaderViewHolder extends com.hominoid.expandablerecyclerviewlib.viewholders.GroupViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
    }
}