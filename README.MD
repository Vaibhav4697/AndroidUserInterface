# Android User Interface

This repository consist of code for an android application that contain representation of android documentation.

# 1. Animations with Motion Layout

For this step we will build an animation that moves a view from the top start of the screen to the bottom end in response to user clicks.

After we complete this step, we'll have implemented the following animation.

[![Animations with Motion Layout](https://github.com/Vaibhav4697/AndroidUserInterface/blob/master/animations/animation_1.gif)]()


To create the animation above with MotionLayout, we'll need the following major pieces:

1. A MotionLayout which is a subclass of ConstraintLayout. We will specify all the views to be animated inside the MotionLayout tag.
2. A MotionScene which is an XML file that describes an animation for MotionLayout.
3. A Transition which is part of the MotionScene that specifies the animation duration, trigger, and how to move the views.
4. A ConstraintSet that specifies both the start and the end constraints of the transition.

Let's take a look at each of these in turn starting with the MotionLayout.