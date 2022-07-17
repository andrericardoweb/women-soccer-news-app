package dev.andrericardo.womensoccernews.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import dev.andrericardo.womensoccernews.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class SoccerNewsDb extends RoomDatabase {
    public abstract NewsDao newsDao();
}
