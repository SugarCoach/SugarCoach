// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogUpgradeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button upgradeAccept;

  @NonNull
  public final Button upgradeCancel;

  private DialogUpgradeBinding(@NonNull FrameLayout rootView, @NonNull Button upgradeAccept,
      @NonNull Button upgradeCancel) {
    this.rootView = rootView;
    this.upgradeAccept = upgradeAccept;
    this.upgradeCancel = upgradeCancel;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogUpgradeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogUpgradeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_upgrade, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogUpgradeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.upgrade_accept;
      Button upgradeAccept = ViewBindings.findChildViewById(rootView, id);
      if (upgradeAccept == null) {
        break missingId;
      }

      id = R.id.upgrade_cancel;
      Button upgradeCancel = ViewBindings.findChildViewById(rootView, id);
      if (upgradeCancel == null) {
        break missingId;
      }

      return new DialogUpgradeBinding((FrameLayout) rootView, upgradeAccept, upgradeCancel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
