# Menu ListView

[![Menu ListView](https://github.com/Vaibhav4697/AndroidUserInterface/blob/master/images/menu.jpeg)](https://github.com/Vaibhav4697/AndroidUserInterface/blob/master/documentation/Menu%20ListView.md#menu-listview)


	1. Create a new Layout Resource File -> app -> res -> layout -> animation_list_card.xml.
	
	2. Save the below given code in animation_list_card.xml ->
	
			<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
				android:layout_width="match_parent"
				android:layout_height="wrap_content"
				android:layout_margin="10dp"
				android:layout_marginVertical="5dp"
				android:background="@drawable/card_view"
				android:orientation="horizontal"
				android:padding="15dp">

				<TextView
					android:id="@+id/count_text_view"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:textColor="@color/secondaryTextColor"
					android:textSize="20sp"
					android:textStyle="bold" />

				<TextView
					android:id="@+id/heading_text_view"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="10dp"
					android:layout_toEndOf="@+id/count_text_view"
					android:textColor="@color/secondaryTextColor"
					android:textSize="20sp"
					android:textStyle="bold" />

			</RelativeLayout>
			
	3. Create a new directory under app -> res -> raw.
	
	4. Save all the MP4 videos going to be used in the application in the directory raw.
	
	5. Create a new Java class -> app -> java -> info.android.ui -> AnimationListAdapter.java.
	
	6. Save the below given code in AnimationListAdapter.java ->
			
			public class AnimationListAdapter extends ArrayAdapter<Video> {

				private Context context;
				private Integer resource;
				private RelativeLayout relativeLayout;
				private String packageName;
				private List<Video> videos;

				public AnimationListAdapter(@NonNull Context context, Integer resource, @NonNull List<Video> videos, RelativeLayout relativeLayout, String packageName) {
					super(context, resource, videos);
					this.context = context;
					this.resource = resource;
					this.relativeLayout = relativeLayout;
					this.packageName = packageName;
					this.videos = videos;
				}

				@NonNull
				@Override
				public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

					LayoutInflater layoutInflater = LayoutInflater.from(context);
					View animationListCard = layoutInflater.inflate(resource, null, false);

					TextView countTextView = animationListCard.findViewById(R.id.count_text_view);
					TextView headingTextView = animationListCard.findViewById(R.id.heading_text_view);

					countTextView.setText(String.valueOf(position + 1).concat("."));
					headingTextView.setText(videos.get(position).getHeading());

					animationListCard.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							new VideoLayout(context, relativeLayout, videos, packageName, position);
						}
					});

					return animationListCard;
				}
			}
			
		*Class AnimationListAdapter will be Adapter class for ListView.
		*Create a constructor to initialize the values.
		*Create a method getView to create and add the view into the ListView.
		
	7. Save the below given code in activity_main.xml ->
			
			<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
				xmlns:app="http://schemas.android.com/apk/res-auto"
				xmlns:tools="http://schemas.android.com/tools"
				android:id="@+id/main_activity"
				android:layout_width="match_parent"
				android:layout_height="match_parent"
				tools:context=".MainActivity">

				<ListView
					android:id="@+id/list_view"
					android:layout_width="match_parent"
					android:layout_height="wrap_content"
					android:layout_margin="10dp" />
				
			</RelativeLayout>
	
	8. Save the below given code in MainActivity.java ->
	
			public class MainActivity extends AppCompatActivity {

				private List<String> headings;
				private List<Video> videos;

				@Override
				protected void onCreate(Bundle savedInstanceState) {
					super.onCreate(savedInstanceState);
					setContentView(R.layout.activity_main);

					ListView listView = findViewById(R.id.list_view);
					videos = new ArrayList<>();

					videos.add(new Video("Animations with Motion Layout", R.raw.video_1, FirstActivity.class));
					videos.add(new Video("Animating based on Drag Events", R.raw.video_2, SecondActivity.class));
					videos.add(new Video("Modifying a Path", R.raw.video_3, ThirdActivity.class));
					videos.add(new Video("Modifying a Path", R.raw.video_4, FourthActivity.class));
					videos.add(new Video("Changing Attributes with Motion", R.raw.video_5, FifthActivity.class));
					videos.add(new Video("Changing Attributes with Motion", R.raw.video_6, SixthActivity.class));
					videos.add(new Video("Changing Attributes with Motion", R.raw.video_7, SeventhActivity.class));
					videos.add(new Video("Changing Custom Attributes with Motion", R.raw.video_8, EighthActivity.class));
					videos.add(new Video("Drag Events and Complex Path", R.raw.video_9, NinthActivity.class));
					videos.add(new Video("Drag Events and Complex Path with Hint", R.raw.video_10, TenthActivity.class));
					videos.add(new Video("Running Motion with Code", R.raw.video_11, EleventhActivity.class));

					RelativeLayout relativeLayout = findViewById(R.id.main_activity);

					listView.setAdapter(new AnimationListAdapter(this, R.layout.animation_list_card, videos, relativeLayout, getPackageName()));
				}
			}