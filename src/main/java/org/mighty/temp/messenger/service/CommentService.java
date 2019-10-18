package org.mighty.temp.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mighty.temp.messenger.database.DatabaseClass;
import org.mighty.temp.messenger.dbobject.Comment;
import org.mighty.temp.messenger.dbobject.Message;

public class CommentService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public List<Comment> getAllComments(long messageId){
		Map<Long,Comment> comments= messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}
	
	public Comment getCommnet(long messageId,long commentId) {
		Map<Long,Comment> comments= messages.get(messageId).getComments();
		return comments.get(commentId);
	}
	
	public Comment addCommnet(long messageId,Comment comment) {
		Map<Long,Comment> comments= messages.get(messageId).getComments();
		comment.setId(comments.size() + 1);
		comments.put(comment.getId(), comment);
		return comment;
	}

	public Comment updateComment(long messageId,Comment comment) {
		Map<Long,Comment> comments = messages.get(messageId).getComments();
		if(comment.getId() <=0) {
			return null;
		}
		comments.put(comment.getId(),comment);
		return comment;
	}
	public Comment removeComment(long messageId,long commentId) {
		Map<Long,Comment> comments = messages.get(messageId).getComments();
		return comments.remove(commentId);
	}
}
