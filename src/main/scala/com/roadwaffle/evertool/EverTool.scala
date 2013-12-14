package com.roadwaffle.evertool

import com.evernote.clients.{ClientFactory, UserStoreClient}
import com.evernote.edam.userstore.UserStore
import com.evernote.auth.{EvernoteService, EvernoteAuth}
import com.evernote.edam.`type`.Note


/**
 * EverTool
 *
 */
object EverTool {
  def main(args: Array[String]) {
    val auth = new EvernoteAuth(EvernoteService.SANDBOX, Config.DEVELOPER_TOKEN)
    val factory = new ClientFactory(auth);
    val noteStore = factory.createNoteStoreClient();

    val note = new Note();

    note.setTitle("testing note")
    val content =
      """<?xml version="1.0" encoding="UTF-8"?>
        <!DOCTYPE en-note SYSTEM "http://xml.evernote.com/pub/enml2.dtd">
        <en-note>blah blah blah
        </en-note>"""
    note.setContent(content);

    noteStore.createNote(note)
  }
}
