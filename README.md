# BlackBearCalorieCounter

The Black Bear Calorie Counter is an android application designed to help users track their intake of calories and macronutrients in order to help them gain, maintain, or lose weight (depending on their personal goals).

Android Studio is currently the primary tool for development, which uses Java and XML as languages.

Currently the software consists of a initial login screen and an activity that leads to a home screen. From the home screen there is a bottom navigation bar that allows users to select "Home", "Calories", or "Settings". The "Calories" section contains a calculator that allows the user to calculate their reccomended daily caloric intake estimate. 

To use this version of the app, create a new project in Android Studio by cloning the repository. This can be done by navigating to File > New > Project from Version Control > GitHub. Use the following link when prompted: 
https://github.com/Group1-SegmentationFault/BlackBearCalorieCounter.git

An emulator can be downloaded within Android Studio by navigating to Open AVD Manager on the toolbar, Create Virtual Device, and selecting an Android Phone. The app can now be tested by pressing the Play button on the toolbar.

Planned features:

-The app will give an estimated caloric and macronutrient intake for users based on the the user's age, weight, height, and weight goals (gain, maintain, or lose weight).

-Users will be able to track the foods they eat and recieve their estimated calorie content by searching for the food in a search query or by scanning the UPC barcode.

-Graphs and statistics will aid the user in visualizing their intake over time.

-Users have a section to record and track daily workouts.

-Users can chose to track their steps, even while the application is suspended.

Dependencies:
androidx.appcombat 1.2.0, 
com.google.android.material 1.3.0,
androidx.constrainlayout 2.0.4,
androidx.legacy 1.0.0,
androidx.navigation 2.2.2,
