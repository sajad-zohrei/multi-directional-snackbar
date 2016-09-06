# multi-directinal-snackbar
android snackbar supports multi directins


## Features
- Support multiDirection.

## Usage
  -  The multiDirectinalSnackbar is very easy to setup

   ```java
    Snackbar snackbar = Snackbar.with(getApplicationContext())
                .duration(Snackbar.SnackbarDuration.LENGTH_INDEFINITE)
                .text(<your text>)
                .actionLabel(<your lable>)
                .actionListener(new ActionClickListener() {

                    @Override
                    public void onActionClicked(Snackbar snackbar) {
                        //your action
                    }
                });
        snackbar.actionColor(<Your color>);
        SnackbarManager.show(snackbar, this, Snackbar.{ 'RTL' or 'LTR'});
    ```

## Gradle
  -  Add the following to your project level `build.gradle`:
 
```gradle
allprojects {
	repositories {
		maven { url "https://jitpack.io" }
	}
}
```
  -  Add this to your app `build.gradle`:
 
```gradle
dependencies {
     compile 'com.github.sajad-zohrei:multi-directional-snackbar:1.1'
}
```

## Contributing

Pull requests with bug fixes or new features are always welcome :), but please, send me a separate pull request for each bug fix or feature. Also, you can [contact](mailto:sajad.zohrei@yahoo.com) me to discuss a new feature before implementing it.

## Developed By

Sajad Zohrei: <sajad.zohrei@yahoo.com>

