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
import uz.mrmanager.myapplication.Service.PostModel;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private List<PostModel> posts;

    public PostsAdapter(List<PostModel> posts) {
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PostModel post = posts.get(position);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.post.setText(Html.fromHtml(post.getElementPureHtml(), Html.FROM_HTML_MODE_LEGACY));
        } else {
            holder.post.setText(Html.fromHtml(post.getElementPureHtml()));
        }
        holder.site.setText(post.getSite());
    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView post;
        TextView site;

        public ViewHolder(View itemView) {
            super(itemView);
            post =  itemView.findViewById(R.id.postitem_post);
            site =  itemView.findViewById(R.id.postitem_site);
        }
    }
}
