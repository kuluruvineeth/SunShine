# A Sunshine Weather Application

## Tasks to be accomplished in this exercise :
- [x] Return the user's preferred location.
- [x] Return true if the user's preference for units is metric, false otherwise.
- [x] Implement OnSharedPreferenceChangeListener on MainActivity.
- [x] Add a private static boolean flag for preference updates and initialize it to false.
- [x] Override onSharedPreferenceChanged to set the preferences flag to true.
- [x] Register MainActivity as a OnSharedPreferenceChangedListener in onCreate.
- [x] In onStart, if preferences have been changed, refresh the data and set the flag to false.
- [x] Override onDestroy and unregister MainActivity as a SharedPreferenceChangedListener.
- [x] Use preferred location rather than a default location to display in the map.