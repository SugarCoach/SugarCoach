// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRegisterValuesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final ImageView registerPlanet;

  @NonNull
  public final TextView registerType;

  @NonNull
  public final LinearLayout registerUnidad;

  @NonNull
  public final AppCompatTextView registerUnidadTv;

  @NonNull
  public final TextView registerValue;

  private FragmentRegisterValuesBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout linearLayout3, @NonNull ImageView registerPlanet,
      @NonNull TextView registerType, @NonNull LinearLayout registerUnidad,
      @NonNull AppCompatTextView registerUnidadTv, @NonNull TextView registerValue) {
    this.rootView = rootView;
    this.linearLayout3 = linearLayout3;
    this.registerPlanet = registerPlanet;
    this.registerType = registerType;
    this.registerUnidad = registerUnidad;
    this.registerUnidadTv = registerUnidadTv;
    this.registerValue = registerValue;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegisterValuesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegisterValuesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_register_values, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegisterValuesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.register_planet;
      ImageView registerPlanet = ViewBindings.findChildViewById(rootView, id);
      if (registerPlanet == null) {
        break missingId;
      }

      id = R.id.register_type;
      TextView registerType = ViewBindings.findChildViewById(rootView, id);
      if (registerType == null) {
        break missingId;
      }

      id = R.id.register_unidad;
      LinearLayout registerUnidad = ViewBindings.findChildViewById(rootView, id);
      if (registerUnidad == null) {
        break missingId;
      }

      id = R.id.register_unidad_tv;
      AppCompatTextView registerUnidadTv = ViewBindings.findChildViewById(rootView, id);
      if (registerUnidadTv == null) {
        break missingId;
      }

      id = R.id.register_value;
      TextView registerValue = ViewBindings.findChildViewById(rootView, id);
      if (registerValue == null) {
        break missingId;
      }

      return new FragmentRegisterValuesBinding((LinearLayout) rootView, linearLayout3,
          registerPlanet, registerType, registerUnidad, registerUnidadTv, registerValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
