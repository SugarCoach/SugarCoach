// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogCongratulationBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView bg;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final CircleImageView congratulationAvatar;

  @NonNull
  public final ImageView congratulationClose;

  @NonNull
  public final AppCompatTextView congratulationLevelTxt;

  @NonNull
  public final AppCompatTextView congratulationPtsTotalTxt;

  @NonNull
  public final AppCompatTextView congratulationPtsTxt;

  private DialogCongratulationBinding(@NonNull FrameLayout rootView, @NonNull ImageView bg,
      @NonNull CardView cardView2, @NonNull CircleImageView congratulationAvatar,
      @NonNull ImageView congratulationClose, @NonNull AppCompatTextView congratulationLevelTxt,
      @NonNull AppCompatTextView congratulationPtsTotalTxt,
      @NonNull AppCompatTextView congratulationPtsTxt) {
    this.rootView = rootView;
    this.bg = bg;
    this.cardView2 = cardView2;
    this.congratulationAvatar = congratulationAvatar;
    this.congratulationClose = congratulationClose;
    this.congratulationLevelTxt = congratulationLevelTxt;
    this.congratulationPtsTotalTxt = congratulationPtsTotalTxt;
    this.congratulationPtsTxt = congratulationPtsTxt;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogCongratulationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogCongratulationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_congratulation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogCongratulationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bg;
      ImageView bg = ViewBindings.findChildViewById(rootView, id);
      if (bg == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.congratulation_avatar;
      CircleImageView congratulationAvatar = ViewBindings.findChildViewById(rootView, id);
      if (congratulationAvatar == null) {
        break missingId;
      }

      id = R.id.congratulation_close;
      ImageView congratulationClose = ViewBindings.findChildViewById(rootView, id);
      if (congratulationClose == null) {
        break missingId;
      }

      id = R.id.congratulation_level_txt;
      AppCompatTextView congratulationLevelTxt = ViewBindings.findChildViewById(rootView, id);
      if (congratulationLevelTxt == null) {
        break missingId;
      }

      id = R.id.congratulation_pts_total_txt;
      AppCompatTextView congratulationPtsTotalTxt = ViewBindings.findChildViewById(rootView, id);
      if (congratulationPtsTotalTxt == null) {
        break missingId;
      }

      id = R.id.congratulation_pts_txt;
      AppCompatTextView congratulationPtsTxt = ViewBindings.findChildViewById(rootView, id);
      if (congratulationPtsTxt == null) {
        break missingId;
      }

      return new DialogCongratulationBinding((FrameLayout) rootView, bg, cardView2,
          congratulationAvatar, congratulationClose, congratulationLevelTxt,
          congratulationPtsTotalTxt, congratulationPtsTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
