package com.example.exemple
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.util.*

class FilmAdapter : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    var filming: MutableList<Films> = ArrayList()
    lateinit var context: Context

    fun FilmAdapter(filming: MutableList<Films>, context: Context) {
        this.filming = filming
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = filming.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.film_list, parent, false))
    }

    override fun getItemCount(): Int {
        return filming.size
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val filmName = view.findViewById(R.id.tittle) as TextView
        val cover = view.findViewById(R.id.cover) as ImageView
        fun bind (films: Films, context: Context) {
            filmName.text = films.name
            itemView.setOnClickListener(View.OnClickListener {
                Toast.makeText(
                    context,
                    films.name,
                    Toast.LENGTH_SHORT
                ).show()
            })
            cover.loadUrl(films.photo)
        }

        fun ImageView.loadUrl(url: String) {
            Picasso.with(context).load(url).into(this)
        }
    }
}
