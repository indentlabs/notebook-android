package ai.notebook.notebook;

// Utilizing a guide found on https://guides.codepath.com/android/using-the-recyclerview for RecyclerView
// Need a reycler view because of the content in the list

// Will need to fill this out eventually, this will hold the recycler view

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class MainMenuAdapter extends
        RecyclerView.Adapter<MainMenuAdapter.ViewHolder> {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public Button messageButton;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

//            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
//            messageButton = (Button) itemView.findViewById(R.id.message_button);
        }
    }
    // Store a member variable for the contacts
    private List<MainMenuItem> mMenuItem;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public MainMenuAdapter(Context context, List<MainMenuItem> menuItems) {
        mMenuItem = menuItems;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }
    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public MainMenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.mainmenu_itemview, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(MainMenuAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        MainMenuItem menuItem = mMenuItem.get(position);

        // Set item views based on your views and data model
//        TextView textView = viewHolder.nameTextView;
//        textView.setText(contact.getName());
//        Button button = viewHolder.messageButton;
//        button.setText("Message");
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mMenuItem.size();
    }
}