package com.myfb.postservice.service;

import com.myfb.postservice.client.CommentDTO;
import com.myfb.postservice.dto.PostDTO;

import java.util.List;

public interface PostService {

    PostDTO createPost(PostDTO postDTO);
    PostDTO getPostDetail(Long PostId);
    List<PostDTO> getAllPostByUser(Long UserId);
    CommentDTO[] getAllCommentsForPostId(Long postId);
}
