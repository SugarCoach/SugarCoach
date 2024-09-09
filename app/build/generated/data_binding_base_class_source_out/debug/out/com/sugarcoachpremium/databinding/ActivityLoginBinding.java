// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView bg;

  @NonNull
  public final Button loginBt;

  @NonNull
  public final CardView loginCardview;

  @NonNull
  public final TextView loginCompleteTv;

  @NonNull
  public final TextView loginForgot;

  @NonNull
  public final AppCompatEditText loginMail;

  @NonNull
  public final FrameLayout loginMedicoScan;

  @NonNull
  public final AppCompatEditText loginPass;

  @NonNull
  public final FrameLayout loginScan;

  @NonNull
  public final TextView loginSignin;

  @NonNull
  public final TextView loginTitle;

  @NonNull
  public final TextView textView7;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bg,
      @NonNull Button loginBt, @NonNull CardView loginCardview, @NonNull TextView loginCompleteTv,
      @NonNull TextView loginForgot, @NonNull AppCompatEditText loginMail,
      @NonNull FrameLayout loginMedicoScan, @NonNull AppCompatEditText loginPass,
      @NonNull FrameLayout loginScan, @NonNull TextView loginSignin, @NonNull TextView loginTitle,
      @NonNull TextView textView7) {
    this.rootView = rootView;
    this.bg = bg;
    this.loginBt = loginBt;
    this.loginCardview = loginCardview;
    this.loginCompleteTv = loginCompleteTv;
    this.loginForgot = loginForgot;
    this.loginMail = loginMail;
    this.loginMedicoScan = loginMedicoScan;
    this.loginPass = loginPass;
    this.loginScan = loginScan;
    this.loginSignin = loginSignin;
    this.loginTitle = loginTitle;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bg;
      ImageView bg = ViewBindings.findChildViewById(rootView, id);
      if (bg == null) {
        break missingId;
      }

      id = R.id.login_bt;
      Button loginBt = ViewBindings.findChildViewById(rootView, id);
      if (loginBt == null) {
        break missingId;
      }

      id = R.id.login_cardview;
      CardView loginCardview = ViewBindings.findChildViewById(rootView, id);
      if (loginCardview == null) {
        break missingId;
      }

      id = R.id.login_complete_tv;
      TextView loginCompleteTv = ViewBindings.findChildViewById(rootView, id);
      if (loginCompleteTv == null) {
        break missingId;
      }

      id = R.id.login_forgot;
      TextView loginForgot = ViewBindings.findChildViewById(rootView, id);
      if (loginForgot == null) {
        break missingId;
      }

      id = R.id.login_mail;
      AppCompatEditText loginMail = ViewBindings.findChildViewById(rootView, id);
      if (loginMail == null) {
        break missingId;
      }

      id = R.id.login_medico_scan;
      FrameLayout loginMedicoScan = ViewBindings.findChildViewById(rootView, id);
      if (loginMedicoScan == null) {
        break missingId;
      }

      id = R.id.login_pass;
      AppCompatEditText loginPass = ViewBindings.findChildViewById(rootView, id);
      if (loginPass == null) {
        break missingId;
      }

      id = R.id.login_scan;
      FrameLayout loginScan = ViewBindings.findChildViewById(rootView, id);
      if (loginScan == null) {
        break missingId;
      }

      id = R.id.login_signin;
      TextView loginSignin = ViewBindings.findChildViewById(rootView, id);
      if (loginSignin == null) {
        break missingId;
      }

      id = R.id.login_title;
      TextView loginTitle = ViewBindings.findChildViewById(rootView, id);
      if (loginTitle == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, bg, loginBt, loginCardview,
          loginCompleteTv, loginForgot, loginMail, loginMedicoScan, loginPass, loginScan,
          loginSignin, loginTitle, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
