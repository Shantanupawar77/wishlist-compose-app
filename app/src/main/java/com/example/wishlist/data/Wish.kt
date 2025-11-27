package com.example.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = "",
)


object DummyWish{
    val wishList = listOf(
        Wish(1, "Wish 1", "Description 1"),
        Wish(2, "Wish 2", "Description 2"),
        Wish(3, "Wish 3", "Description 3"),
        Wish(4, "Wish 4", "Description 4"),
        )
}