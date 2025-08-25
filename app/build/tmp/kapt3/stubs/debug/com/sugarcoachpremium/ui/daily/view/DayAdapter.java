package com.sugarcoachpremium.ui.daily.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/view/DayAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sugarcoachpremium/ui/daily/view/DayAdapter$DayViewHolder;", "dayList", "", "Lcom/sugarcoachpremium/ui/daily/view/DayItem;", "<init>", "(Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "DayViewHolder", "app_debug"})
public final class DayAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sugarcoachpremium.ui.daily.view.DayAdapter.DayViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.util.List<com.sugarcoachpremium.ui.daily.view.DayItem>> dayList = null;
    
    public DayAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.List<com.sugarcoachpremium.ui.daily.view.DayItem>> dayList) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.sugarcoachpremium.ui.daily.view.DayAdapter.DayViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily.view.DayAdapter.DayViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/view/DayAdapter$DayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sugarcoachpremium/databinding/RegisterMonthItemBinding;", "<init>", "(Lcom/sugarcoachpremium/ui/daily/view/DayAdapter;Lcom/sugarcoachpremium/databinding/RegisterMonthItemBinding;)V", "bind", "", "day", "", "Lcom/sugarcoachpremium/ui/daily/view/DayItem;", "app_debug"})
    public final class DayViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.sugarcoachpremium.databinding.RegisterMonthItemBinding binding = null;
        
        public DayViewHolder(@org.jetbrains.annotations.NotNull()
        com.sugarcoachpremium.databinding.RegisterMonthItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        java.util.List<com.sugarcoachpremium.ui.daily.view.DayItem> day) {
        }
    }
}