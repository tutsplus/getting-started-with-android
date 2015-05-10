
*--------------Course Details--------------*

## Instructor: 

Paul Trebilcox-Ruiz

## Difficulty: 

Beginner

## Source Files Location: 

https://github.com/tutsplus/something

## Topic: 

Android Development

## Categories: 

Code

## Software/Languages/Frameworks: 

Android SDK 22, Java JDK 1.8, Android Studio 1.1

## Course Rate: 

*--------------Course Outline--------------*

# Course Name: 

Getting Started with Android

# Course Description: 

In this course you will create an Android app for a zoo from start to finish. You will create a list of exhibits that opens into a detail page, a gallery and a Google Maps section. You will also implement a navigation drawer and toolbar while learning the basics of Material design.

# Source Files Description:

Each folder in the source represents the end result of a lesson in this course, and each lesson builds off of the last. The data folder contains a set of JSON files that are used for populating data into the application, and the images folder contains a set of creative commons images from Instagram that you can use within your app. 

*--------------Course--------------*

# 1 Introduction and Getting Setup

## 1.1 Introduction ( Lesson 1 )

In this lesson you will see the finished project for this course and learn about what you will be making.

## 1.2 Installing Android Studio ( Lesson 2 )

In this lesson you will learn how to install Android Studio, the Android SDK and create an Android emulator for testing your apps.

**Related Links**
- [Android Studio Install] (https://developer.android.com/sdk/index.html) 


## 1.3 Hello World ( Lesson 3 )

After installing and setting up Android Studio, you will create a basic "Hello World" application in order to test your development environment, and you will learn about some of the more common views in Android.

**Related Links**
- [Android Activities] (http://developer.android.com/guide/components/activities.html)
- [Android Relative Layouts] (http://developer.android.com/guide/topics/ui/layout/relative.html)
- [String Resources] (http://developer.android.com/guide/topics/resources/string-resource.html)

## 1.4 Creating the Toolbar ( Lesson 4 )

This lesson will teach you how to implement the support Toolbar to the top of your activities.

**Related Links**
- [Android Linear Layout] (http://developer.android.com/guide/topics/ui/layout/linear.html)
- [Android Support Library Features] (https://developer.android.com/tools/support-library/features.html)
- [Toolbar] (https://developer.android.com/reference/android/support/v7/widget/Toolbar.html)

## 1.5 Implementing the Navigation Drawer ( Lesson 5 )

In this lesson you will implement a standard navigation drawer that can be swiped out from the left side of the screen, and you will learn how to add a drawer toggle so that the "hamburger" icon in the top left of your app will animate into an arrow as your users open the drawer.

**Related Links**
- [Navigation Drawer] (https://developer.android.com/design/patterns/navigation-drawer.html)
- [Gravity] (http://developer.android.com/reference/android/view/Gravity.html)
- [ActionBarDrawerToggle] (https://developer.android.com/reference/android/support/v4/app/ActionBarDrawerToggle.html)

## 1.6 Implementing the Navigation Drawer ( Lesson 6 )

In this lesson you will create a custom ListView in order to display content in your navigation drawer.

**Related Links**
- [List View] (http://developer.android.com/guide/topics/ui/layout/listview.html)
- [ArrayAdapter] (http://developer.android.com/reference/android/widget/ArrayAdapter.html)
- [Making ListView Scrolling Smooth] (http://developer.android.com/training/improving-layouts/smooth-scrolling.html)

## 1.7 Implementing the Otto Event Bus ( Lesson 7 )

In this lesson you will learn about the third party event bus library, Otto, and implement it so that you can switch between different sections in your zoo app by selecting an item in your navigation drawer.

**Related Links**
- [Otto] (http://square.github.io/otto/)
- [Managing the Activity Lifecycle] (http://developer.android.com/training/basics/activity-lifecycle/index.html)
- [Fragments] (http://developer.android.com/guide/components/fragments.html)
- [Gradle, Please] (http://gradleplease.appspot.com/)
- [FragmentManager] (http://developer.android.com/reference/android/app/FragmentManager.html)

# 2 Exhibits Section

## 2.1 Creating Model Objects ( Lesson 8 )

In this lesson you will create model objects based on data for the exhibits section of your zoo app

**Related Links**
- [JSON] (http://www.json.org/)
- [Gist] (https://gist.github.com/)

## 2.2 Pulling Down Exhibits Data ( Lesson 9 )

This lesson will teach you how to use the Retrofit library to pull down data from an online source for use in your app.

**Related Links**
- [Retrofit] (http://square.github.io/retrofit/)

## 2.3 Creating the Exhibits List ( Lesson 10 )

In this lesson you will populate UI elements into a ListFragment based on online data.

**RelatedLinks**
- [Picasso] (http://square.github.io/picasso/)

## 2.3 Creating the Exhibits Detail Page ( Lesson 11 )

This lesson will teach you how to create a second activity and how to pass data to it so that you can display more detailed content about a selected item.

**RelatedLinks**
- [Intents and Intent Filters] (http://developer.android.com/guide/components/intents-filters.html)
- [ScrollView] (http://developer.android.com/reference/android/widget/ScrollView.html)
- [ImageView.ScaleType] (http://developer.android.com/reference/android/widget/ImageView.ScaleType.html)

# 3: Gallery Section

## 3.1 Setting Up the Gallery Data ( Lesson 12 )

This lesson will reenforce creating a model object and pulling data from the Internet using the Retrofit library.

## 3.2 Creating a GridView of Gallery Images ( Lesson 13 )

In this lesson you will learn about GridViews and how to use them with an Adapter to display content.

**Related Links**
- [GridView] (http://developer.android.com/guide/topics/ui/layout/gridview.html)

## 3.3 Creating the Gallery Image Detail Activity ( Lesson 14 )

This lesson will reenforce the idea of clicking an item in a collection in order to open a detail activity.

# 4 Google Maps

## 4.1 Setting up the Google Maps API Key ( Lesson 15 )

This video will walk you through using the Google Developers Console in order to generate an API key for Google Maps. You will then learn how to reference that key in your app.

**Related Links**
- [Google Maps Android API - Getting Started] (https://developers.google.com/maps/documentation/android/start)
- [Google Developer Console] (https://console.developers.google.com)

## 4.2 Preparing Data for Map Pins ( Lesson 16 )

This lesson will go over placing data for Google Maps pins online and pulling that data in with Retrofit in order to reinforce your knowledge of using external data in your application.

## 4.3 Implementing Map Features ( Lesson 17 )

In this lesson you will learn how to add pins to a Google Map, move the camera to a specific latitude and longitude, enable traffic displays and work with UiSettings.

**Related Links**
- [SupportMapFragment] (http://developer.android.com/reference/com/google/android/gms/maps/SupportMapFragment.html)
- [GoogleMap] (http://developer.android.com/reference/com/google/android/gms/maps/GoogleMap.html)
- [UiSettings] (http://developer.android.com/reference/com/google/android/gms/maps/UiSettings.html)

# 5 Finishing Up

## 5.1 Code Cleanup ( Lesson 18 )

In this lesson you will comb over some of the code used in this app in order to make it more maintainable and fix some bugs.

## 5.2 Styles and Polish ( Lesson 19 )

This lesson will teach you about some of the options you have available for styling your application in XML and Java code. You will add spacing to the Exhibits ListFragment, the Gallery GridView, how to use a StateListDrawable XML file, you will implement a progress spinner as a placeholder for images and learn about the different coloration options available with the Material theme.

**Related Links**
- [Using the Material Theme] (https://developer.android.com/training/material/theme.html)
- [Drawable Resources] (http://developer.android.com/guide/topics/resources/drawable-resource.html)

## 5.3 Conclusion ( Lesson 20 )

This lesson will introduce you to additional resources for continuing your education with the Android platform.

**Related Links**
- [Tuts+ Android Tutorials] (https://code.tutsplus.com/categories/android-sdk)
- [Official Android Developers Blog] (http://android-developers.blogspot.com/)
- [Android Development Tutorials] (http://developer.android.com/guide/index.html)
- [Android Samples] (http://developer.android.com/samples/index.html)

I really hope you have enjoyed this course on Getting Started with Android and plan to continue having fun with the Android platform, my name is Paul Trebilcox-Ruiz and from all of us here at Tuts+ thanks for watching!