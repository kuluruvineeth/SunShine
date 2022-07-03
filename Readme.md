# A SunShine Weather Application

## Tasks to be accomplished in this exercise :
- [x] Add an interface called ForecastAdapterOnClickHandler.
- [x] Within that interface, define a void method that access a String as a parameter.
- [x] Create a final private ForecastAdapterOnClickHandler called mClickHandler.
- [x] Add a ForecastAdapterOnClickHandler as a parameter to the constructor and store it in mClickHandler.
- [x] Implement OnClickListener in the ForecastAdapterViewHolder class.
- [x] Override onClick, passing the clicked day's data to mClickHandler via its onClick method.
- [x] Call setOnClickListener on the view passed into the constructor (use 'this' as the OnClickListener).
- [x] Implement ForecastAdapterOnClickHandler from the MainActivity.
- [x] Override ForecastAdapterOnClickHandler's onClick method.
- [x] Show a Toast when an item is clicked, displaying that item's weather data.
- [x] Pass in 'this' as the ForecastAdapterOnClickHandler.


## Screenshots
1. Final Output of this exercise

![img1](https://github.com/kuluruvineeth/Sunshine/blob/RecyclerViewClickHandling/Screenshots/img.png)