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
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class MainMenuAdapter extends
        RecyclerView.Adapter<MainMenuAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemName;
        public ImageView headerImage;

        public ViewHolder(View itemView) {
            super(itemView);

            itemName = (TextView) itemView.findViewById(R.id.itemCountText);
            headerImage = (ImageView) itemView.findViewById(R.id.itemBanner);
        }
    }
    private List<MainMenuItem> mMenuItem;
    private Context mContext;

    public MainMenuAdapter(Context context, List<MainMenuItem> menuItems) {
        mMenuItem = menuItems;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }
    @Override
    public MainMenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.mainmenu_itemview, parent, false);

        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MainMenuAdapter.ViewHolder viewHolder, int position) {
        MainMenuItem menuItem = mMenuItem.get(position);

        // Set item views based on your views and data model
        TextView textView = viewHolder.itemName;
        textView.setText(menuItem.getItemName());
        ImageView image = viewHolder.headerImage;
        image.setImageResource(menuItem.getHeaderImage());
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mMenuItem.size();
    }
}