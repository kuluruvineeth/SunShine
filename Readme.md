# A SunShine Weather Application

## Tasks to be accomplished in this exercise :
- [x] Add RecyclerView dependency.
- [x] Replace ScrollView and TextView with RecyclerView.
- [x] Give the RecyclerView an id of @+id/recyclerview_forecast.
- [x] Set the width and the height of the RecyclerView to match_parent.
- [x] Add a layout for an item in the list called forecast_list_item.xml.
- [x] Make the root of the layout a vertical LinearLayout.
- [x] Set the width of the LinearLayout to match_parent and the height to wrap_content.
- [x] Add a TextView with an id @+id/tv_weather_data.
- [x] Set the text size to 22sp.
- [x] Make the width and height wrap_content.
- [x] Give the TextView 16dp of padding.
- [x] Add a View to the layout with a width of match_parent and a height of 1dp.
- [x] Set the background color to #dadada.
- [x] Set the left and right margins to 8dp.
- [x] Add a class file called ForecastAdapter.
- [x] Create a class within ForecastAdapter called ForecastAdapterViewHolder.
- [x] Extend RecyclerView.ViewHolder.
- [x] Create a public final TextView variable called mWeatherTextView.
- [x] Create a constructor for this class that accepts a View as a parameter.
- [x] Call super(view) within the constructor for ForecastAdapterViewHolder.
- [x] Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView.
- [x] Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>.
- [x] Create a private string array called mWeatherData.
- [x] Override onCreateViewHolder.
- [x] Within onCreateViewHolder, inflate the list item xml into a view.
- [x] Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter.
- [x] Override onBindViewHolder.
- [x] Set the text of the TextView to the weather for this list item's position.
- [x] Override getItemCount.
- [x] Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null.
- [x] Create a setWeatherData method that saves the weatherData to mWeatherData.
- [x] After you save mWeatherData, call notifyDataSetChanged.
- [x] Delete mWeatherTextView.
- [x] Add a private RecyclerView variable called mRecyclerView.
- [x] Add a private ForecastAdapter variable called mForecastAdapter.
- [x] Delete the line where you get a reference to mWeatherTextView.
- [x] Use findViewById to get a reference to the RecyclerView.
- [x] Create layoutManager, a LinearLayoutManager with VERTICAL orientation and shouldReverseLayout == false.
- [x] Set the layoutManager on mRecyclerView.
- [x] Use setHasFixedSize(true) on mRecyclerView to designate that all items in the list will have the same size.
- [x] set mForecastAdapter equal to a new ForecastAdapter.
- [x] Use mRecyclerView.setAdapter and pass in mForecastAdapter.
- [x] Show mRecyclerView, not mWeatherTextView.
- [x] Hide mRecyclerView, not mWeatherTextView.
- [x] Instead of iterating through every string, use mForecastAdapter.setWeatherData and pass in the weather data.
- [x] Instead of setting the text to "", set the adapter to null before refreshing.
- [x] Create the default constructor (we will pass in parameters in a later lesson).


## Screenshots
1. Final Output of this exercise

![img1](https://github.com/kuluruvineeth/Sunshine/blob/RecyclerView/Screenshots/img.png)