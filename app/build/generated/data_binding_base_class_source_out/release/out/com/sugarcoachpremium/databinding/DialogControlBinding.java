// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogControlBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button upgradeAccept;

  @NonNull
  public final Button upgradeCancel;

  @NonNull
  public final AppCompatTextView upgradeTitle;

  private DialogControlBinding(@NonNull FrameLayout rootView, @NonNull Button upgradeAccept,
      @NonNull Button upgradeCancel, @NonNull AppCompatTextView upgradeTitle) {
    this.rootView = rootView;
    this.upgradeAccept = upgradeAccept;
    this.upgradeCancel = upgradeCancel;
    this.upgradeTitle = upgradeTitle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogControlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogControlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_control, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogControlBinding bind(@NonNull View rootView) {
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

      id = R.id.upgrade_title;
      AppCompatTextView upgradeTitle = ViewBindings.findChildViewById(rootView, id);
      if (upgradeTitle == null) {
        break missingId;
      }

      return new DialogControlBinding((FrameLayout) rootView, upgradeAccept, upgradeCancel,
          upgradeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}