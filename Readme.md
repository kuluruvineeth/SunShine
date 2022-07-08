# A Sunshine Weather Application

## Tasks to be accomplished in this exercise :
- [x] Add preferences dependency to gradle.
- [x] Create an xml resource directory.
- [x] Add a PreferenceScreen with an EditTextPreference and ListPreference within the newly created xml resource directory.
- [x] Create SettingsFragment and extend PreferenceFragmentCompat.
- [x] Override onCreatePreferences and add the preference xml file using addPreferencesFromResource.
- [x] Add preferenceTheme to AppTheme and set to @style/PreferenceThemeOverlay.
- [x] Make the SettingsFragment the root layout for SettingsActivity.
- [x] Create a method called setPreferenceSummary that accepts a Preference and an Object and sets the summary of the preference.
- [x] Set the preference summary on each preference that isn't a CheckBoxPreference.
- [x] Implement OnSharedPreferenceChangeListener from SettingsFragment.
- [x] Override onSharedPreferenceChanged to update non CheckBoxPreferences when they are changed.
- [x] Register SettingsFragment (this) as a SharedPreferenceChangedListener in onStart.
- [x] Unregister SettingsFragment (this) as a SharedPreferenceChangedListener in onStop.



## Screenshots
1. Final Output of this Exercise

![img1](https://github.com/kuluruvineeth/Sunshine/blob/6.2-SettingsFragment/Screenshots/img.png)
![img2](https://github.com/kuluruvineeth/Sunshine/blob/6.2-SettingsFragment/Screenshots/img_1.png)
![img3](https://github.com/kuluruvineeth/Sunshine/blob/6.2-SettingsFragment/Screenshots/img_2.png)