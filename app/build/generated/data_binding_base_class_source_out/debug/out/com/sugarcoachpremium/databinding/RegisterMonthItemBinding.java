// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RegisterMonthItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView tvBreakfastBasal;

  @NonNull
  public final TextView tvBreakfastCor;

  @NonNull
  public final TextView tvBreakfastGlyc;

  @NonNull
  public final TextView tvBreakfastTime;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvDinnerBasal;

  @NonNull
  public final TextView tvDinnerCor;

  @NonNull
  public final TextView tvDinnerGlyc;

  @NonNull
  public final TextView tvDinnerTime;

  @NonNull
  public final TextView tvLunchBasal;

  @NonNull
  public final TextView tvLunchCor;

  @NonNull
  public final TextView tvLunchGlyc;

  @NonNull
  public final TextView tvLunchTime;

  @NonNull
  public final TextView tvPostBreakfastBasal;

  @NonNull
  public final TextView tvPostBreakfastCor;

  @NonNull
  public final TextView tvPostBreakfastGlyc;

  @NonNull
  public final TextView tvPostBreakfastTime;

  @NonNull
  public final TextView tvPostDinnerBasal;

  @NonNull
  public final TextView tvPostDinnerCor;

  @NonNull
  public final TextView tvPostDinnerGlyc;

  @NonNull
  public final TextView tvPostDinnerTime;

  @NonNull
  public final TextView tvPostLunchBasal;

  @NonNull
  public final TextView tvPostLunchCor;

  @NonNull
  public final TextView tvPostLunchGlyc;

  @NonNull
  public final TextView tvPostLunchTime;

  @NonNull
  public final TextView tvPostSnackBasal;

  @NonNull
  public final TextView tvPostSnackCor;

  @NonNull
  public final TextView tvPostSnackTime;

  @NonNull
  public final TextView tvSPostSnackGlyc;

  @NonNull
  public final TextView tvSnackBasal;

  @NonNull
  public final TextView tvSnackCor;

  @NonNull
  public final TextView tvSnackGlyc;

  @NonNull
  public final TextView tvSnackTime;

  private RegisterMonthItemBinding(@NonNull CardView rootView, @NonNull TextView tvBreakfastBasal,
      @NonNull TextView tvBreakfastCor, @NonNull TextView tvBreakfastGlyc,
      @NonNull TextView tvBreakfastTime, @NonNull TextView tvDate, @NonNull TextView tvDinnerBasal,
      @NonNull TextView tvDinnerCor, @NonNull TextView tvDinnerGlyc, @NonNull TextView tvDinnerTime,
      @NonNull TextView tvLunchBasal, @NonNull TextView tvLunchCor, @NonNull TextView tvLunchGlyc,
      @NonNull TextView tvLunchTime, @NonNull TextView tvPostBreakfastBasal,
      @NonNull TextView tvPostBreakfastCor, @NonNull TextView tvPostBreakfastGlyc,
      @NonNull TextView tvPostBreakfastTime, @NonNull TextView tvPostDinnerBasal,
      @NonNull TextView tvPostDinnerCor, @NonNull TextView tvPostDinnerGlyc,
      @NonNull TextView tvPostDinnerTime, @NonNull TextView tvPostLunchBasal,
      @NonNull TextView tvPostLunchCor, @NonNull TextView tvPostLunchGlyc,
      @NonNull TextView tvPostLunchTime, @NonNull TextView tvPostSnackBasal,
      @NonNull TextView tvPostSnackCor, @NonNull TextView tvPostSnackTime,
      @NonNull TextView tvSPostSnackGlyc, @NonNull TextView tvSnackBasal,
      @NonNull TextView tvSnackCor, @NonNull TextView tvSnackGlyc, @NonNull TextView tvSnackTime) {
    this.rootView = rootView;
    this.tvBreakfastBasal = tvBreakfastBasal;
    this.tvBreakfastCor = tvBreakfastCor;
    this.tvBreakfastGlyc = tvBreakfastGlyc;
    this.tvBreakfastTime = tvBreakfastTime;
    this.tvDate = tvDate;
    this.tvDinnerBasal = tvDinnerBasal;
    this.tvDinnerCor = tvDinnerCor;
    this.tvDinnerGlyc = tvDinnerGlyc;
    this.tvDinnerTime = tvDinnerTime;
    this.tvLunchBasal = tvLunchBasal;
    this.tvLunchCor = tvLunchCor;
    this.tvLunchGlyc = tvLunchGlyc;
    this.tvLunchTime = tvLunchTime;
    this.tvPostBreakfastBasal = tvPostBreakfastBasal;
    this.tvPostBreakfastCor = tvPostBreakfastCor;
    this.tvPostBreakfastGlyc = tvPostBreakfastGlyc;
    this.tvPostBreakfastTime = tvPostBreakfastTime;
    this.tvPostDinnerBasal = tvPostDinnerBasal;
    this.tvPostDinnerCor = tvPostDinnerCor;
    this.tvPostDinnerGlyc = tvPostDinnerGlyc;
    this.tvPostDinnerTime = tvPostDinnerTime;
    this.tvPostLunchBasal = tvPostLunchBasal;
    this.tvPostLunchCor = tvPostLunchCor;
    this.tvPostLunchGlyc = tvPostLunchGlyc;
    this.tvPostLunchTime = tvPostLunchTime;
    this.tvPostSnackBasal = tvPostSnackBasal;
    this.tvPostSnackCor = tvPostSnackCor;
    this.tvPostSnackTime = tvPostSnackTime;
    this.tvSPostSnackGlyc = tvSPostSnackGlyc;
    this.tvSnackBasal = tvSnackBasal;
    this.tvSnackCor = tvSnackCor;
    this.tvSnackGlyc = tvSnackGlyc;
    this.tvSnackTime = tvSnackTime;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RegisterMonthItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RegisterMonthItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.register_month_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RegisterMonthItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvBreakfastBasal;
      TextView tvBreakfastBasal = ViewBindings.findChildViewById(rootView, id);
      if (tvBreakfastBasal == null) {
        break missingId;
      }

      id = R.id.tvBreakfastCor;
      TextView tvBreakfastCor = ViewBindings.findChildViewById(rootView, id);
      if (tvBreakfastCor == null) {
        break missingId;
      }

      id = R.id.tvBreakfastGlyc;
      TextView tvBreakfastGlyc = ViewBindings.findChildViewById(rootView, id);
      if (tvBreakfastGlyc == null) {
        break missingId;
      }

      id = R.id.tvBreakfastTime;
      TextView tvBreakfastTime = ViewBindings.findChildViewById(rootView, id);
      if (tvBreakfastTime == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvDinnerBasal;
      TextView tvDinnerBasal = ViewBindings.findChildViewById(rootView, id);
      if (tvDinnerBasal == null) {
        break missingId;
      }

      id = R.id.tvDinnerCor;
      TextView tvDinnerCor = ViewBindings.findChildViewById(rootView, id);
      if (tvDinnerCor == null) {
        break missingId;
      }

      id = R.id.tvDinnerGlyc;
      TextView tvDinnerGlyc = ViewBindings.findChildViewById(rootView, id);
      if (tvDinnerGlyc == null) {
        break missingId;
      }

      id = R.id.tvDinnerTime;
      TextView tvDinnerTime = ViewBindings.findChildViewById(rootView, id);
      if (tvDinnerTime == null) {
        break missingId;
      }

      id = R.id.tvLunchBasal;
      TextView tvLunchBasal = ViewBindings.findChildViewById(rootView, id);
      if (tvLunchBasal == null) {
        break missingId;
      }

      id = R.id.tvLunchCor;
      TextView tvLunchCor = ViewBindings.findChildViewById(rootView, id);
      if (tvLunchCor == null) {
        break missingId;
      }

      id = R.id.tvLunchGlyc;
      TextView tvLunchGlyc = ViewBindings.findChildViewById(rootView, id);
      if (tvLunchGlyc == null) {
        break missingId;
      }

      id = R.id.tvLunchTime;
      TextView tvLunchTime = ViewBindings.findChildViewById(rootView, id);
      if (tvLunchTime == null) {
        break missingId;
      }

      id = R.id.tvPostBreakfastBasal;
      TextView tvPostBreakfastBasal = ViewBindings.findChildViewById(rootView, id);
      if (tvPostBreakfastBasal == null) {
        break missingId;
      }

      id = R.id.tvPostBreakfastCor;
      TextView tvPostBreakfastCor = ViewBindings.findChildViewById(rootView, id);
      if (tvPostBreakfastCor == null) {
        break missingId;
      }

      id = R.id.tvPostBreakfastGlyc;
      TextView tvPostBreakfastGlyc = ViewBindings.findChildViewById(rootView, id);
      if (tvPostBreakfastGlyc == null) {
        break missingId;
      }

      id = R.id.tvPostBreakfastTime;
      TextView tvPostBreakfastTime = ViewBindings.findChildViewById(rootView, id);
      if (tvPostBreakfastTime == null) {
        break missingId;
      }

      id = R.id.tvPostDinnerBasal;
      TextView tvPostDinnerBasal = ViewBindings.findChildViewById(rootView, id);
      if (tvPostDinnerBasal == null) {
        break missingId;
      }

      id = R.id.tvPostDinnerCor;
      TextView tvPostDinnerCor = ViewBindings.findChildViewById(rootView, id);
      if (tvPostDinnerCor == null) {
        break missingId;
      }

      id = R.id.tvPostDinnerGlyc;
      TextView tvPostDinnerGlyc = ViewBindings.findChildViewById(rootView, id);
      if (tvPostDinnerGlyc == null) {
        break missingId;
      }

      id = R.id.tvPostDinnerTime;
      TextView tvPostDinnerTime = ViewBindings.findChildViewById(rootView, id);
      if (tvPostDinnerTime == null) {
        break missingId;
      }

      id = R.id.tvPostLunchBasal;
      TextView tvPostLunchBasal = ViewBindings.findChildViewById(rootView, id);
      if (tvPostLunchBasal == null) {
        break missingId;
      }

      id = R.id.tvPostLunchCor;
      TextView tvPostLunchCor = ViewBindings.findChildViewById(rootView, id);
      if (tvPostLunchCor == null) {
        break missingId;
      }

      id = R.id.tvPostLunchGlyc;
      TextView tvPostLunchGlyc = ViewBindings.findChildViewById(rootView, id);
      if (tvPostLunchGlyc == null) {
        break missingId;
      }

      id = R.id.tvPostLunchTime;
      TextView tvPostLunchTime = ViewBindings.findChildViewById(rootView, id);
      if (tvPostLunchTime == null) {
        break missingId;
      }

      id = R.id.tvPostSnackBasal;
      TextView tvPostSnackBasal = ViewBindings.findChildViewById(rootView, id);
      if (tvPostSnackBasal == null) {
        break missingId;
      }

      id = R.id.tvPostSnackCor;
      TextView tvPostSnackCor = ViewBindings.findChildViewById(rootView, id);
      if (tvPostSnackCor == null) {
        break missingId;
      }

      id = R.id.tvPostSnackTime;
      TextView tvPostSnackTime = ViewBindings.findChildViewById(rootView, id);
      if (tvPostSnackTime == null) {
        break missingId;
      }

      id = R.id.tvSPostSnackGlyc;
      TextView tvSPostSnackGlyc = ViewBindings.findChildViewById(rootView, id);
      if (tvSPostSnackGlyc == null) {
        break missingId;
      }

      id = R.id.tvSnackBasal;
      TextView tvSnackBasal = ViewBindings.findChildViewById(rootView, id);
      if (tvSnackBasal == null) {
        break missingId;
      }

      id = R.id.tvSnackCor;
      TextView tvSnackCor = ViewBindings.findChildViewById(rootView, id);
      if (tvSnackCor == null) {
        break missingId;
      }

      id = R.id.tvSnackGlyc;
      TextView tvSnackGlyc = ViewBindings.findChildViewById(rootView, id);
      if (tvSnackGlyc == null) {
        break missingId;
      }

      id = R.id.tvSnackTime;
      TextView tvSnackTime = ViewBindings.findChildViewById(rootView, id);
      if (tvSnackTime == null) {
        break missingId;
      }

      return new RegisterMonthItemBinding((CardView) rootView, tvBreakfastBasal, tvBreakfastCor,
          tvBreakfastGlyc, tvBreakfastTime, tvDate, tvDinnerBasal, tvDinnerCor, tvDinnerGlyc,
          tvDinnerTime, tvLunchBasal, tvLunchCor, tvLunchGlyc, tvLunchTime, tvPostBreakfastBasal,
          tvPostBreakfastCor, tvPostBreakfastGlyc, tvPostBreakfastTime, tvPostDinnerBasal,
          tvPostDinnerCor, tvPostDinnerGlyc, tvPostDinnerTime, tvPostLunchBasal, tvPostLunchCor,
          tvPostLunchGlyc, tvPostLunchTime, tvPostSnackBasal, tvPostSnackCor, tvPostSnackTime,
          tvSPostSnackGlyc, tvSnackBasal, tvSnackCor, tvSnackGlyc, tvSnackTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
