package dev.andrericardo.womensoccernews.data.remote;

import java.util.List;

import dev.andrericardo.womensoccernews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {
    @GET("news.json")
    Call<List<News>> getNews();
}
