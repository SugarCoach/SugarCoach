// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class DialogCategoryBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppCompatTextView categoryBreakfastTv;

  @NonNull
  public final AppCompatTextView categoryDinnerTv;

  @NonNull
  public final AppCompatTextView categoryLunchTv;

  @NonNull
  public final AppCompatTextView categoryPbreakfastTv;

  @NonNull
  public final AppCompatTextView categoryPdinnerTv;

  @NonNull
  public final AppCompatTextView categoryPlunchTv;

  @NonNull
  public final AppCompatTextView categoryPsnackTv;

  @NonNull
  public final AppCompatTextView categorySnackTv;

  private DialogCategoryBinding(@NonNull FrameLayout rootView,
      @NonNull AppCompatTextView categoryBreakfastTv, @NonNull AppCompatTextView categoryDinnerTv,
      @NonNull AppCompatTextView categoryLunchTv, @NonNull AppCompatTextView categoryPbreakfastTv,
      @NonNull AppCompatTextView categoryPdinnerTv, @NonNull AppCompatTextView categoryPlunchTv,
      @NonNull AppCompatTextView categoryPsnackTv, @NonNull AppCompatTextView categorySnackTv) {
    this.rootView = rootView;
    this.categoryBreakfastTv = categoryBreakfastTv;
    this.categoryDinnerTv = categoryDinnerTv;
    this.categoryLunchTv = categoryLunchTv;
    this.categoryPbreakfastTv = categoryPbreakfastTv;
    this.categoryPdinnerTv = categoryPdinnerTv;
    this.categoryPlunchTv = categoryPlunchTv;
    this.categoryPsnackTv = categoryPsnackTv;
    this.categorySnackTv = categorySnackTv;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_breakfast_tv;
      AppCompatTextView categoryBreakfastTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryBreakfastTv == null) {
        break missingId;
      }

      id = R.id.category_dinner_tv;
      AppCompatTextView categoryDinnerTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryDinnerTv == null) {
        break missingId;
      }

      id = R.id.category_lunch_tv;
      AppCompatTextView categoryLunchTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryLunchTv == null) {
        break missingId;
      }

      id = R.id.category_pbreakfast_tv;
      AppCompatTextView categoryPbreakfastTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryPbreakfastTv == null) {
        break missingId;
      }

      id = R.id.category_pdinner_tv;
      AppCompatTextView categoryPdinnerTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryPdinnerTv == null) {
        break missingId;
      }

      id = R.id.category_plunch_tv;
      AppCompatTextView categoryPlunchTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryPlunchTv == null) {
        break missingId;
      }

      id = R.id.category_psnack_tv;
      AppCompatTextView categoryPsnackTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryPsnackTv == null) {
        break missingId;
      }

      id = R.id.category_snack_tv;
      AppCompatTextView categorySnackTv = ViewBindings.findChildViewById(rootView, id);
      if (categorySnackTv == null) {
        break missingId;
      }

      return new DialogCategoryBinding((FrameLayout) rootView, categoryBreakfastTv,
          categoryDinnerTv, categoryLunchTv, categoryPbreakfastTv, categoryPdinnerTv,
          categoryPlunchTv, categoryPsnackTv, categorySnackTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
