# 1. Create a New Project

	1. Create a new Project -> UserInterface
	
	2. Update build.gradle (Module: app) ->
	
		Add ->
			
			android -> deafultConfig ->
				android.defaultConfig.vectorDrawables.useSupportLibrary = true
			
			dependencies ->
				implementation 'androidx.constraintlayout:constraintlayout:2.0.0-beta4'
				implementation 'com.google.android.material:material:1.2.0-alpha06'
				
				*Dependency for constraintlayout is mendatory for motionlayout.
				*Dependency for material is mendatory for providing dark theme.
					**Material Components for Android is a static library that you can add to your Android application in order to use APIs that provide implementations of the Material Design specification. Compatible on devices running API 14 or later.
	
	3. Update styles.xml ->
			
			<resources>

				<!-- Base application theme. -->
				<style name="AppTheme" parent="Base.Theme.MaterialComponents">
					<!-- Customize your theme here. -->
					<item name="colorPrimary">@color/primaryColor</item>
					<item name="colorPrimaryDark">@color/primaryDarkColor</item>
					<item name="colorPrimaryVariant">@color/primaryDarkColor</item>
					<item name="colorOnPrimary">@color/primaryTextColor</item>
					<item name="colorSecondary">@color/secondaryColor</item>
					<item name="colorSecondaryVariant">@color/secondaryLightColor</item>
					<item name="colorOnSecondary">@color/secondaryTextColor</item>

				</style>

				<style name="AppTheme.NoActionBar">
					<item name="windowActionBar">false</item>
					<item name="windowNoTitle">true</item>
				</style>

				<style name="AppTheme.AppBarOverlay" parent="ThemeOverlay.AppCompat.Dark.ActionBar" />

				<style name="AppTheme.PopupOverlay" parent="ThemeOverlay.AppCompat.Light" />

			</resources>

		*Android provides the following features to help you build material design apps with Theme.MaterialComponents:
			**A material design app theme to style all your UI widgets.
			**Widgets for complex views such as lists and cards.
			**New APIs for custom shadows and animations.
			
		*AppTheme.AppBarOverlay is theme for toolbar.
			
		*AppTheme.PopupOverlay is theme for toolbar popup menu.
		
	4. Update colors.xml ->
	
			<resources>
				<color name="primaryColor">#263238</color>
				<color name="primaryLightColor">#4f5b62</color>
				<color name="primaryDarkColor">#000a12</color>
				<color name="secondaryColor">#ff7043</color>
				<color name="secondaryLightColor">#ffa270</color>
				<color name="secondaryDarkColor">#c63f17</color>
				<color name="primaryTextColor">#ffffff</color>
				<color name="secondaryTextColor">#000000</color>
			</resources>
		
	5. Update strings.xml ->
	
			<resources>
				<string name="app_name">User Interface</string>
				<string name="star">Star</string>
				<string name="animationsWithMotionLayout">Animations with Motion Layout</string>
				<string name="animatingBasedOnDragEvents">Animating based on Drag Events</string>
				<string name="credits">Vaibhav Grover</string>
				<string name="modifyingAPath">Modifying a Path</string>
				<string name="moon">Moon</string>
				<string name="changingAttributesWithMotion">Changing Attributes with Motion</string>
				<string name="changingCustomAttributesWithMotion">Changing Custom Attributes with Motion</string>
				<string name="dragEventsAndComplexPath">Drag Events and Complex Path</string>
				<string name="cancelButton">Cancel Button</string>
				<string name="clickAboveToViewTheAnimation">Click above to view the animation!</string>
				<string name="dragEventsAndComplexPathWithHint">Drag Events and Complex Path with Hint</string>
				<string name="swipeToTheRight">Swipe to the Right</string>
				<string name="runningMotionWithCode">Running Motion with Code</string>
				<string name="background">Background</string>
				<string name="longText">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Proin nibh nisl condimentum id venenatis a. Est placerat in egestas erat imperdiet sed. Ut lectus arcu bibendum at varius. Purus in mollis nunc sed id semper risus in hendrerit. Volutpat est velit egestas dui. Id diam vel quam elementum pulvinar etiam non. Tristique magna sit amet purus gravida quis blandit. Gravida in fermentum et sollicitudin ac orci. Sed augue lacus viverra vitae congue eu. Sapien nec sagittis aliquam malesuada bibendum. Tortor aliquam nulla facilisi cras fermentum odio. Egestas sed tempus urna et pharetra pharetra massa. Amet purus gravida quis blandit. Orci a scelerisque purus semper eget duis at tellus.

				Volutpat lacus laoreet non curabitur. Urna cursus eget nunc scelerisque viverra mauris. Turpis massa sed elementum tempus egestas sed sed risus pretium. Quam nulla porttitor massa id neque aliquam. Tempus quam pellentesque nec nam aliquam sem et. Ut eu sem integer vitae justo. Commodo sed egestas egestas fringilla phasellus faucibus scelerisque eleifend donec. Cras fermentum odio eu feugiat pretium nibh ipsum. Posuere morbi leo urna molestie at elementum eu facilisis sed. Augue eget arcu dictum varius duis at. Lacinia at quis risus sed vulputate odio. Massa tincidunt dui ut ornare.

				Auctor augue mauris augue neque gravida in fermentum et. Varius vel pharetra vel turpis nunc eget. Condimentum mattis pellentesque id nibh tortor id aliquet. In massa tempor nec feugiat nisl pretium fusce. Dolor sed viverra ipsum nunc aliquet bibendum. Potenti nullam ac tortor vitae purus faucibus ornare suspendisse sed. Mauris a diam maecenas sed. Tortor aliquam nulla facilisi cras fermentum. Mattis rhoncus urna neque viverra. Dui sapien eget mi proin sed. In dictum non consectetur a. Eu consequat ac felis donec et odio pellentesque. Eget egestas purus viverra accumsan in nisl. Dui nunc mattis enim ut tellus elementum. Lobortis elementum nibh tellus molestie nunc non. Nisi porta lorem mollis aliquam ut porttitor leo a diam. Pulvinar mattis nunc sed blandit libero volutpat sed. Ut faucibus pulvinar elementum integer.

				Scelerisque varius morbi enim nunc faucibus a pellentesque. Scelerisque in dictum non consectetur a erat nam at lectus. Sed euismod nisi porta lorem mollis aliquam. Nunc mi ipsum faucibus vitae aliquet. Nibh cras pulvinar mattis nunc. Sed viverra tellus in hac habitasse platea. Ac tortor vitae purus faucibus ornare. Laoreet sit amet cursus sit amet dictum sit amet. Risus sed vulputate odio ut enim. Massa sapien faucibus et molestie ac feugiat sed. Proin libero nunc consequat interdum varius sit amet mattis vulputate. Eget sit amet tellus cras adipiscing enim eu. Ullamcorper dignissim cras tincidunt lobortis feugiat. Arcu ac tortor dignissim convallis aenean et tortor at. Aliquet risus feugiat in ante metus. Sit amet luctus venenatis lectus magna. Egestas maecenas pharetra convallis posuere morbi leo. Auctor neque vitae tempus quam pellentesque nec nam aliquam sem.

					Ac orci phasellus egestas tellus rutrum tellus. Ultrices neque ornare aenean euismod elementum nisi quis. Vel pharetra vel turpis nunc eget. Quis lectus nulla at volutpat diam ut venenatis tellus in. Egestas congue quisque egestas diam in arcu. Tincidunt praesent semper feugiat nibh sed pulvinar. Tristique senectus et netus et malesuada fames. Tristique nulla aliquet enim tortor. Aliquet nibh praesent tristique magna sit amet purus. Diam maecenas ultricies mi eget mauris pharetra et ultrices neque. Morbi tristique senectus et netus et malesuada. Venenatis tellus in metus vulputate eu scelerisque felis. Risus pretium quam vulputate dignissim suspendisse in. Ut venenatis tellus in metus vulputate. Turpis in eu mi bibendum. Pellentesque elit eget gravida cum sociis natoque. Tristique risus nec feugiat in fermentum posuere urna. Senectus et netus et malesuada fames ac turpis.</string>
			</resources>
			
	6. Update AndroidManifest.xml ->
	
			<activity
				android:name=".FirstActivity"
				android:label="@string/animationsWithMotionLayout"
				android:theme="@style/AppTheme">
				<meta-data
					android:name="android.support.PARENT_ACTIVITY"
					android:value=".MainActivity" />
			</activity>
			
		*Add the activity tag for every activity in this file, mentioneing:
			**Add name attribute for the activity.
			**Add label attribute for the activity; label to be appeared on the toolbar.
			**Add theme attribute for the activity; theme for the activity.
			**Add meta-data tag; with name and value attribute for parent activity to return on when clicked on back button.

# Video Layout

[![Video Layout](https://github.com/Vaibhav4697/AndroidUserInterface/blob/master/animations/video_layout.gif)](https://github.com/Vaibhav4697/AndroidUserInterface/blob/master/documentation/Video%20Layout.md#video-layout)


	1. Create a new Layout Resource File -> app -> res -> layout -> video_layout.xml.
	
	2. Save the below given code in video_layout.xml ->
	
			<?xml version="1.0" encoding="utf-8"?>
			<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
				xmlns:app="http://schemas.android.com/apk/res-auto"
				android:layout_width="match_parent"
				android:layout_height="wrap_content"
				android:background="@drawable/card_view"
				android:padding="20dp">

				<ImageView
					android:id="@+id/cancel_image_view"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_alignParentTop="true"
					android:layout_alignParentEnd="true"
					android:background="@drawable/cancel"
					android:contentDescription="@string/cancelButton" />

				<TextView
					android:id="@+id/heading_text_view"
					android:layout_width="match_parent"
					android:layout_height="wrap_content"
					android:layout_below="@id/cancel_image_view"
					android:textAlignment="center"
					android:textColor="@color/secondaryTextColor"
					android:textSize="24sp"
					android:textStyle="bold" />

				<RelativeLayout
					android:id="@+id/relative_layout"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_below="@id/heading_text_view">

					<VideoView
						android:id="@+id/video_view"
						android:layout_width="500dp"
						android:layout_height="500dp"
						android:layout_margin="10dp" />

					<com.google.android.material.floatingactionbutton.FloatingActionButton
						android:id="@+id/left_fab"
						android:layout_width="wrap_content"
						android:layout_height="wrap_content"
						android:layout_alignParentStart="true"
						android:layout_centerVertical="true"
						android:layout_margin="20dp"
						android:background="@color/secondaryDarkColor"
						app:srcCompat="@drawable/left" />

					<com.google.android.material.floatingactionbutton.FloatingActionButton
						android:id="@+id/right_fab"
						android:layout_width="wrap_content"
						android:layout_height="wrap_content"
						android:layout_alignParentEnd="true"
						android:layout_centerVertical="true"
						android:layout_margin="20dp"
						android:background="@color/secondaryDarkColor"
						app:srcCompat="@drawable/right" />

				</RelativeLayout>

				<TextView
					android:layout_width="match_parent"
					android:layout_height="wrap_content"
					android:layout_below="@id/relative_layout"
					android:text="@string/clickAboveToViewTheAnimation"
					android:textAlignment="center"
					android:textColor="@color/secondaryTextColor"
					android:textSize="15sp" />

			</RelativeLayout>
		
	3. Create a new Java class -> app -> java -> info.android.ui -> Video.java.
	
	4. Save the below given code to Video.java ->

			public class Video {

				private String heading;
				private Integer videoId;
				private Class intentClass;

				public Video(String heading, Integer videoId, Class intentClass) {
					this.heading = heading;
					this.videoId = videoId;
					this.intentClass = intentClass;
				}

				public String getHeading() {
					return heading;
				}

				public Integer getVideoId() {
					return videoId;
				}

				public Class getIntentClass() {
					return intentClass;
				}
			}
		
		*Create a string heading; to store heading.
		*Create an integer videoId; to store the video id.
		*Create a class object intentClass; to store the class name for intent.
		*Create a parameterized constructor; to initialize the value.
		*Create getters; to fetch the value.
		
	5. Create a new Java class -> app -> java -> info.android.ui -> VideoLayout.java.
	
	6. Save the below given code to VideoLayout.java ->
	
			public class VideoLayout {

				private Context context;
				private RelativeLayout relativeLayout;
				private List<Video> videos;
				private String packageName;
				private int currentPosition;

				private PopupWindow popupWindow;

				private ImageView cancelImageView;
				private TextView headingTextView;
				private VideoView videoView;
				private FloatingActionButton leftFAB;
				private FloatingActionButton rightFAB;

				public VideoLayout(Context context, RelativeLayout relativeLayout, List<Video> videos, String packageName, int currentPosition) {
					this.context = context;
					this.relativeLayout = relativeLayout;
					this.videos = videos;
					this.packageName = packageName;
					this.currentPosition = currentPosition;

					popupWindow = showWindow();
				}

				private PopupWindow showWindow() {

					LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

					View videoLayoutView = inflater.inflate(R.layout.video_layout, null);

					final PopupWindow popupWindow = new PopupWindow(
							videoLayoutView,
							ViewGroup.LayoutParams.WRAP_CONTENT,
							ViewGroup.LayoutParams.WRAP_CONTENT
					);

					// Set an elevation value for popup window
					// Call requires API level 21
					if (Build.VERSION.SDK_INT >= 21) {
						popupWindow.setElevation(5.0f);
					}

					popupWindow.setOutsideTouchable(false);
					popupWindow.setFocusable(true);
					popupWindow.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);

					cancelImageView = videoLayoutView.findViewById(R.id.cancel_image_view);
					headingTextView = videoLayoutView.findViewById(R.id.heading_text_view);
					videoView = videoLayoutView.findViewById(R.id.video_view);
					leftFAB = videoLayoutView.findViewById(R.id.left_fab);
					rightFAB = videoLayoutView.findViewById(R.id.right_fab);

					/* Code for cancel button */
					cancelImageView.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							dismissWindow();
						}
					});

					/* Code for heading */
					setHeading();

					/* Code for video view */
					playVideo();
					videoView.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							Intent intent = new Intent(context, videos.get(currentPosition).getIntentClass());
							context.startActivity(intent);
						}
					});

					/* Code for FAB */
					checkFAB();
					leftFAB.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							--currentPosition;
							setHeading();
							checkFAB();
							playVideo();
						}
					});
					rightFAB.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							++currentPosition;
							setHeading();
							checkFAB();
							playVideo();
						}
					});

					return popupWindow;
				}

				private void dismissWindow() {

					popupWindow.dismiss();
				}

				private MediaPlayer.OnPreparedListener preparedListener = new MediaPlayer.OnPreparedListener() {

					@Override
					public void onPrepared(MediaPlayer mediaPlayer) {
						try {
							if (mediaPlayer.isPlaying()) {
								mediaPlayer.stop();
								mediaPlayer.release();
								mediaPlayer = new MediaPlayer();
							}
							mediaPlayer.setVolume(0f, 0f);
							mediaPlayer.setLooping(true);
							mediaPlayer.start();
						} catch (Exception e) {
							System.out.println(e);
						}
					}
				};

				private void playVideo() {
					if (videoView.isPlaying()) {
						videoView.stopPlayback();
					}
					videoView.setOnPreparedListener(preparedListener);
					videoView.requestFocus();
					videoView.setVideoPath("android.resource://" + packageName + "/" + videos.get(currentPosition).getVideoId());
				}

				private void setHeading() {
					headingTextView.setText(videos.get(currentPosition).getHeading());
				}

				private void checkFAB() {
					if (currentPosition == 0) {
						leftFAB.setVisibility(View.INVISIBLE);
					} else if (currentPosition == videos.size() - 1) {
						rightFAB.setVisibility(View.INVISIBLE);
					} else {
						leftFAB.setVisibility(View.VISIBLE);
						rightFAB.setVisibility(View.VISIBLE);
					}
				}
			}