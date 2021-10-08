import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

const COMMENT_API = 'http://localhost:8081/api/comment/';

@Injectable({
  providedIn: 'root'
})
export class CommentService {

  constructor(private http: HttpClient) { }

  public addToCommentToPost(postId: number, message: string): Observable<any> {
    return this.http.post(COMMENT_API + postId + '/create', {
      message: message
    });
  }

  public getCommentToPost(commentId: number): Observable<any> {
    return this.http.get(COMMENT_API + commentId + '/all');
  }

  public deleteComment(commentId: number): Observable<any> {
    return this.http.post(COMMENT_API + commentId + '/delete', null);
  }


}
