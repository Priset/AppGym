package com.grupoe.runconcola.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grupoe.runconcola.dataClasses.Notes
import com.grupoe.runconcola.databinding.ItemNoteBinding

class NotesAdapter: RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    private val notesList = mutableListOf<Notes>()
    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):NotesViewHolder {
        context = parent.context
        return NotesViewHolder(ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.binding(notesList[position])
    }

    override fun getItemCount(): Int = notesList.size

    inner class NotesViewHolder(private val binding: ItemNoteBinding): RecyclerView.ViewHolder(binding.root){
        fun binding(data: Notes){
            binding.textTitleItem.text = data.date
            binding.textDescriptionItem.text = data.description
        }
    }

    fun addOptions(list: MutableList<Notes>){
        notesList.clear()
        notesList.addAll(list)
    }

}