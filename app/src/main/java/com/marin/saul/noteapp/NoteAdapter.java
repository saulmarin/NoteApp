package com.marin.saul.noteapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marin.saul.noteapp.model.Note;
import com.marin.saul.noteapp.model.Notes;

/**
 * Created by g7-1105ss on 19/01/2017.
 */

public class NoteAdapter extends RecyclerView.Adapter<NoteRowViewHolder>{

    private Notes notes;
    LayoutInflater inflater;

    public NoteAdapter(Notes notes, Context context) {
        this.notes = notes;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public NoteRowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_note, parent, false);
        NoteRowViewHolder viewHolder = new NoteRowViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NoteRowViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.setNote(note);
    }

    @Override
    public int getItemCount() {
        return notes.count();
    }
}
