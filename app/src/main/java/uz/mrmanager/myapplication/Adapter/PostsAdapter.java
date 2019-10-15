package uz.mrmanager.myapplication.Adapter;

import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.mrmanager.myapplication.R;
import uz.mrmanager.myapplication.Service.MyResponse;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private List<MyResponse> posts;

    public PostsAdapter(List<MyResponse> posts) {
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MyResponse post = posts.get(position);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.date.setText(Html.fromHtml("DATE: "+post.getDate(), Html.FROM_HTML_MODE_LEGACY));
        } else {
            holder.date.setText(Html.fromHtml(post.getActionType()));
        }
        holder.site.setText("ID:" + post.getId());
        holder.active.setText("Active:" + post.getActionType());



    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView site;
        TextView active;


        public ViewHolder(View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.postitem_date);
            site = itemView.findViewById(R.id.postitem_site);
            active = itemView.findViewById(R.id.postitem_active);
        }
    }
}
