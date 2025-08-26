package com.sugarcoachpremium.ui.profile.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/view/ProfileItem;", "", "id", "", "image", "", "selected", "", "<init>", "(ILjava/lang/String;Z)V", "getId$app_debug", "()I", "getImage$app_debug", "()Ljava/lang/String;", "getSelected$app_debug", "()Z", "setSelected$app_debug", "(Z)V", "Builder", "app_debug"})
public final class ProfileItem {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String image = null;
    private boolean selected;
    
    public ProfileItem(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String image, boolean selected) {
        super();
    }
    
    public final int getId$app_debug() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage$app_debug() {
        return null;
    }
    
    public final boolean getSelected$app_debug() {
        return false;
    }
    
    public final void setSelected$app_debug(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c2\u0003J\t\u0010\u000e\u001a\u00020\u0007H\u00c2\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/view/ProfileItem$Builder;", "", "id", "", "image", "", "selected", "", "<init>", "(ILjava/lang/String;Z)V", "build", "Lcom/sugarcoachpremium/ui/profile/view/ProfileItem;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class Builder {
        private int id;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String image;
        private boolean selected;
        
        public Builder(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String image, boolean selected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sugarcoachpremium.ui.profile.view.ProfileItem.Builder id(int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sugarcoachpremium.ui.profile.view.ProfileItem.Builder image(@org.jetbrains.annotations.NotNull()
        java.lang.String image) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sugarcoachpremium.ui.profile.view.ProfileItem.Builder selected(boolean selected) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sugarcoachpremium.ui.profile.view.ProfileItem build() {
            return null;
        }
        
        public Builder() {
            super();
        }
        
        private final int component1() {
            return 0;
        }
        
        private final java.lang.String component2() {
            return null;
        }
        
        private final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sugarcoachpremium.ui.profile.view.ProfileItem.Builder copy(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String image, boolean selected) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}