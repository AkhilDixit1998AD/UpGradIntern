package com.akhil.akhildixit.UpgradIntern;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.akhil.akhildixit.UpgradIntern.CustomDataTypes.Question;

import java.util.List;

@Dao
public interface QuPOJO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Question question);

    @Delete
    void delete(Question question);

    @Query("SELECT * FROM questions_table")
    LiveData<List<Question>> getOfflineQuestions();

}
