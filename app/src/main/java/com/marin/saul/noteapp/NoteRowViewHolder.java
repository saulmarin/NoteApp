package com.marin.saul.noteapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.marin.saul.noteapp.model.Note;

/**
 * Created by g7-1105ss on 19/01/2017.
 */

public class NoteRowViewHolder extends RecyclerView.ViewHolder {

    private TextView noteTitleText;
    private TextView noteTextText;

    private Note note;

    public NoteRowViewHolder(View itemView) {
        super(itemView);

        noteTitleText = (TextView) itemView.findViewById(R.id.row_note_note_title);
        noteTextText = (TextView) itemView.findViewById(R.id.row_note_note_text);

    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
        noteTitleText.setText(note.getTitle());
        noteTextText.setText(note.getText());
    }
}
