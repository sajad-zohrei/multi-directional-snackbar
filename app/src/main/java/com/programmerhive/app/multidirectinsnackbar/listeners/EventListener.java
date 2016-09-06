package com.programmerhive.app.multidirectinsnackbar.listeners;

import com.programmerhive.app.multidirectinsnackbar.Snackbar;


public interface EventListener {

    public void onShow(Snackbar snackbar);


    public void onShown(Snackbar snackbar);


    public void onDismiss(Snackbar snackbar);


    public void onDismissed(Snackbar snackbar);
}
