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

public final class DialogTreatmentSaveBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button treamentAccept;

  @NonNull
  public final Button treamentCancel;

  private DialogTreatmentSaveBinding(@NonNull FrameLayout rootView, @NonNull Button treamentAccept,
      @NonNull Button treamentCancel) {
    this.rootView = rootView;
    this.treamentAccept = treamentAccept;
    this.treamentCancel = treamentCancel;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogTreatmentSaveBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogTreatmentSaveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_treatment_save, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogTreatmentSaveBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.treament_accept;
      Button treamentAccept = ViewBindings.findChildViewById(rootView, id);
      if (treamentAccept == null) {
        break missingId;
      }

      id = R.id.treament_cancel;
      Button treamentCancel = ViewBindings.findChildViewById(rootView, id);
      if (treamentCancel == null) {
        break missingId;
      }

      return new DialogTreatmentSaveBinding((FrameLayout) rootView, treamentAccept, treamentCancel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}