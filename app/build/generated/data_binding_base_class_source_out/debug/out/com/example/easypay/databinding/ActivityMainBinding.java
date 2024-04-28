// Generated by view binder compiler. Do not edit!
package com.example.easypay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.easypay.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final BottomAppBar bottomAppBar;

  @NonNull
  public final BottomNavigationView bottomNavView;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final CoordinatorLayout main;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull BottomAppBar bottomAppBar, @NonNull BottomNavigationView bottomNavView,
      @NonNull FrameLayout frameLayout, @NonNull CoordinatorLayout main) {
    this.rootView = rootView;
    this.bottomAppBar = bottomAppBar;
    this.bottomNavView = bottomNavView;
    this.frameLayout = frameLayout;
    this.main = main;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomAppBar;
      BottomAppBar bottomAppBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomAppBar == null) {
        break missingId;
      }

      id = R.id.bottomNavView;
      BottomNavigationView bottomNavView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavView == null) {
        break missingId;
      }

      id = R.id.frame_layout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      CoordinatorLayout main = (CoordinatorLayout) rootView;

      return new ActivityMainBinding((CoordinatorLayout) rootView, bottomAppBar, bottomNavView,
          frameLayout, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}