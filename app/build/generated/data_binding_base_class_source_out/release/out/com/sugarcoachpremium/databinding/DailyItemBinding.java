// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DailyItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView dailyBasalText;

  @NonNull
  public final TextView dailyBasalTv;

  @NonNull
  public final CardView dailyCardview;

  @NonNull
  public final TextView dailyCategoryTv;

  @NonNull
  public final LinearLayout dailyContainer;

  @NonNull
  public final TextView dailyCorrectoText;

  @NonNull
  public final TextView dailyCorrectoTv;

  @NonNull
  public final AppCompatImageView dailyEmotionalIv;

  @NonNull
  public final TextView dailyEmotionalTv;

  @NonNull
  public final AppCompatImageView dailyExerciseIv;

  @NonNull
  public final TextView dailyExerciseTv;

  @NonNull
  public final TextView dailyGluText;

  @NonNull
  public final TextView dailyGluTv;

  @NonNull
  public final TextView dailyHcText;

  @NonNull
  public final TextView dailyHcTv;

  @NonNull
  public final TextView dailyTimeTv;

  private DailyItemBinding(@NonNull LinearLayout rootView, @NonNull TextView dailyBasalText,
      @NonNull TextView dailyBasalTv, @NonNull CardView dailyCardview,
      @NonNull TextView dailyCategoryTv, @NonNull LinearLayout dailyContainer,
      @NonNull TextView dailyCorrectoText, @NonNull TextView dailyCorrectoTv,
      @NonNull AppCompatImageView dailyEmotionalIv, @NonNull TextView dailyEmotionalTv,
      @NonNull AppCompatImageView dailyExerciseIv, @NonNull TextView dailyExerciseTv,
      @NonNull TextView dailyGluText, @NonNull TextView dailyGluTv, @NonNull TextView dailyHcText,
      @NonNull TextView dailyHcTv, @NonNull TextView dailyTimeTv) {
    this.rootView = rootView;
    this.dailyBasalText = dailyBasalText;
    this.dailyBasalTv = dailyBasalTv;
    this.dailyCardview = dailyCardview;
    this.dailyCategoryTv = dailyCategoryTv;
    this.dailyContainer = dailyContainer;
    this.dailyCorrectoText = dailyCorrectoText;
    this.dailyCorrectoTv = dailyCorrectoTv;
    this.dailyEmotionalIv = dailyEmotionalIv;
    this.dailyEmotionalTv = dailyEmotionalTv;
    this.dailyExerciseIv = dailyExerciseIv;
    this.dailyExerciseTv = dailyExerciseTv;
    this.dailyGluText = dailyGluText;
    this.dailyGluTv = dailyGluTv;
    this.dailyHcText = dailyHcText;
    this.dailyHcTv = dailyHcTv;
    this.dailyTimeTv = dailyTimeTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DailyItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DailyItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.daily_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DailyItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.daily_basal_text;
      TextView dailyBasalText = ViewBindings.findChildViewById(rootView, id);
      if (dailyBasalText == null) {
        break missingId;
      }

      id = R.id.daily_basal_tv;
      TextView dailyBasalTv = ViewBindings.findChildViewById(rootView, id);
      if (dailyBasalTv == null) {
        break missingId;
      }

      id = R.id.daily_cardview;
      CardView dailyCardview = ViewBindings.findChildViewById(rootView, id);
      if (dailyCardview == null) {
        break missingId;
      }

      id = R.id.daily_category_tv;
      TextView dailyCategoryTv = ViewBindings.findChildViewById(rootView, id);
      if (dailyCategoryTv == null) {
        break missingId;
      }

      LinearLayout dailyContainer = (LinearLayout) rootView;

      id = R.id.daily_correcto_text;
      TextView dailyCorrectoText = ViewBindings.findChildViewById(rootView, id);
      if (dailyCorrectoText == null) {
        break missingId;
      }

      id = R.id.daily_correcto_tv;
      TextView dailyCorrectoTv = ViewBindings.findChildViewById(rootView, id);
      if (dailyCorrectoTv == null) {
        break missingId;
      }

      id = R.id.daily_emotional_iv;
      AppCompatImageView dailyEmotionalIv = ViewBindings.findChildViewById(rootView, id);
      if (dailyEmotionalIv == null) {
        break missingId;
      }

      id = R.id.daily_emotional_tv;
      TextView dailyEmotionalTv = ViewBindings.findChildViewById(rootView, id);
      if (dailyEmotionalTv == null) {
        break missingId;
      }

      id = R.id.daily_exercise_iv;
      AppCompatImageView dailyExerciseIv = ViewBindings.findChildViewById(rootView, id);
      if (dailyExerciseIv == null) {
        break missingId;
      }

      id = R.id.daily_exercise_tv;
      TextView dailyExerciseTv = ViewBindings.findChildViewById(rootView, id);
      if (dailyExerciseTv == null) {
        break missingId;
      }

      id = R.id.daily_glu_text;
      TextView dailyGluText = ViewBindings.findChildViewById(rootView, id);
      if (dailyGluText == null) {
        break missingId;
      }

      id = R.id.daily_glu_tv;
      TextView dailyGluTv = ViewBindings.findChildViewById(rootView, id);
      if (dailyGluTv == null) {
        break missingId;
      }

      id = R.id.daily_hc_text;
      TextView dailyHcText = ViewBindings.findChildViewById(rootView, id);
      if (dailyHcText == null) {
        break missingId;
      }

      id = R.id.daily_hc_tv;
      TextView dailyHcTv = ViewBindings.findChildViewById(rootView, id);
      if (dailyHcTv == null) {
        break missingId;
      }

      id = R.id.daily_time_tv;
      TextView dailyTimeTv = ViewBindings.findChildViewById(rootView, id);
      if (dailyTimeTv == null) {
        break missingId;
      }

      return new DailyItemBinding((LinearLayout) rootView, dailyBasalText, dailyBasalTv,
          dailyCardview, dailyCategoryTv, dailyContainer, dailyCorrectoText, dailyCorrectoTv,
          dailyEmotionalIv, dailyEmotionalTv, dailyExerciseIv, dailyExerciseTv, dailyGluText,
          dailyGluTv, dailyHcText, dailyHcTv, dailyTimeTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
