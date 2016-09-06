package com.programmerhive.app.multidirectinsnackbar;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.Log;

public class SnackbarManager {

    private static final String TAG = SnackbarManager.class.getSimpleName();

    private static Snackbar currentSnackbar;

    private SnackbarManager() {
    }

    public static void show(@NonNull Snackbar snackbar,int direction) {
        try {
            show(snackbar, (Activity) snackbar.getContext(),direction);
        } catch (ClassCastException e) {
            Log.e(TAG, "Couldn't get Activity from the Snackbar's Context. Try calling " +
                    "#show(Snackbar, Activity) instead", e);
        }
    }


    public static void show(@NonNull Snackbar snackbar, @NonNull Activity activity,int lan) {
        if (currentSnackbar != null) {
            currentSnackbar.dismiss();
        }
        currentSnackbar = snackbar;
        currentSnackbar.show(activity,lan);
    }

    public static void dismiss() {
        if (currentSnackbar != null) {
            currentSnackbar.dismiss();
        }
    }
}
