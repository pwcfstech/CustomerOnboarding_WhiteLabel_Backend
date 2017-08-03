package com.afrAsia.service;

import com.afrAsia.entities.response.GenericResponse;

public interface AddCommentService {
	
		public GenericResponse addComments(Long appId,String comments,String userId,String userCat);
			
}
