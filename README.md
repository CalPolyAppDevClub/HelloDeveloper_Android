#Introduction
Welcome to Hello Developer, a simple app to help get you antiquated to the
awesome world of Android Development. While we won't do any crazy - at least not
yet - it's a great way to get started fast, and we can build on this later.

A couple comments to keep in mind as you explore this project:
* In case you are looking at this project because you missed the workshop, look
at [this quick video that tours the project structure of an Android app](https://www.youtube.com/watch?v=Z_oHH3ZVcB4). This should help remove any intimidation you might feel when you first open up Android Studio

* Most of these ideas generalize to other platforms you may find yourself writing
apps for; if you learn Android dev, its not too different from writing iOS apps!

* I encourage you to **Research and Experiment** with anything that seems
confusing.

* I'm always open to suggestions, questions, and comments concerning this app and
Android development in general. One can contact me via email: kcampos0101[AT]gmail.com.

#Saying Hello
Traditionally, the first program any programmer writes is the Hello World
program. The goal is to simply print out "Hello, World!" We'll make it a bit
more interesting by having the user type in their name, tap a button,
and we will deliver a nice, customized "Hello World!" message.
Check out `activity_mail.xml` in the file pane on the left, which will show you what
the app will look like when we run it.

#Quick Tour
Let's have a brief overview of the files contained in this project. I encourage
you to Google these topics and look at Google's documentation to further your
understanding:

###`app`
In here we will find all the files relevant to the development of our app.

###`Gradle Scripts`
Here we will find all files relevant to Gradle. Gradle is Android's build tool of choice. Its okay 
if you don't know what a build tool is - We won't be touching gradle files for this project.

###`app/manifests`
Here you will find 'AndroidManifest.xml'. This file tells the operating system the details about your app.
Some examples include any required permissions, your app's name, and the icon to use.

###`app/java`
Here is where you will write your app's logic.
You will find three directories that roughly fit the path of 'com.example.com.myapplication'.
Two of them will be labeled 'androidTest' and 'test' in parenthesis. The main folder without tags is
where we will be writing our code. The other two folders are for writing test scripts to make sure our
code is well built. In test, we want to write test cases for all things that do not require us to use
any Android classes. 'androidTest', in contrast, is for test cases that require Android classes. The
reasoning for this seperation is because any tests involving Android classes will require you to load
an android emulator. This results in *much* long testing times. The seperation allows us to run our
non-android tests without the delay of an emulator.

###`app/res`
Here is where all the content (resources) of our app lives.
There are various directories here that are used for resources such text, images, audio, and coloring
for your app's theme is specified. The one you will use most frequently is 'res/values/strings.xml'.
This file holds all static text that appears in your app. Having all of our text in one file allows us 
to easily translate our app. The operating system will load the correct set of strings based on the 
system language. Its this type of structure that allows android apps to be very device-flexible.

###`app/res/layout/activity_main.xml`
Here is where we will create the UI for our app.

On the left, Android Studio renders a representation of what the app will looking like at runtime.
On the right, Android Studio renders outlines of what components you have placed on the screen.

This left-hand-side can be very useful. Minimalist styling trends can make it difficult to distinguish where
one UI element begins and another ends. 

Left of these renderings, you'l find a panel labeled 'Palette'. In here, you can drag UI elements over
onto the rendering and place them as you see fit. Go ahead and drag an EditText object onto the rendering.
Note: It is important that you grab an *EditText* and not a TextView. EditText objects allow you
to input text while TextViews simply display some text. *If you choose the wrong object, your app
will not work*. Click on the EditText object and on the left you will see a 'Properties' panel.

Go ahead and change the 'hint' field to say "Please enter your name". Now, remove whatever value is in
the 'text' field. A hint is that grayed-out text you see in a form that lets you know what a field is
expecting.

Second, drag a button onto the screen. Click on the button in the rendering. In the 'Properties' panel,
go down to 'onClick' and type 'greet'. We have now specified what function will be called
when the button is pressed.

Okay, now we're done laying out our UI. Easy, right? Now lets move on to adding some functionality

###`app/java/com.example.www.myapplication/MainActivity.java`
Here we will be writing the logic that handles our UI componenets. 

Go ahead and create a new public method
that takes in a View as its only parameter. We will call this method from the front end to greet our
new android developer. 

Your method should take the signature: 'public void greet(View vew)'. This is because this is what
we specified in the button's 'onClick' field. Now we move on to writing the inside of this function.

Inside, we will ask for the EditText object on the front end
that the user will put their name into. This is done with the following line: 
'EditText nameField = (EditText) findViewById(R.id.editText);'. Now, from this object we will
grab the text that it is holding. On a new line, we type:
'String message = nameField.getText().toString();' 

Lastly, we will display this text to the user.
We will do this using a toast. A toast is a little notification that you can display to user. If you
have used android before, you've probably seen this type of notification at least once. go ahead and type:
'Toast.makeText(this, "Hello, " + message + "!", Toast.LENGTH_SHORT).show();'

In this method, we pass in some context for the app (whose calling Toast.makeText), the message we want to display,
and the duration for which this message will be shown.

Tadah! we're done!

#Running your app
Now you probably want to run your app. If you have an adroid device and you're on windows, please search for
and install the drivers required for your device. If you have an android device and you're on a mac, you can
just plug yor device in and it will work. If you don't have an android device, you will need to load an emulator.
Don't worry, Android Studio will walk you through this process.

At the top of Android Studio, you should see a green play button. Android Studio will now ask you which
device you would like to run your app on. If your device is connected, you can choose that. Otherwise, you
can create a new virtual device and android studio will use that. 

#Resources
There are unlimited resources for learning Android Development on the web.
I highly recommend learning about Android's activity lifecycle first. From there, you can learn about
having apps with multipule activities. Afterwards you should learn about the different UI components
(Especially different layouts) and additional cool features like networking. Of course, you can learn 
some of these things by continueing to attend our meetings. 